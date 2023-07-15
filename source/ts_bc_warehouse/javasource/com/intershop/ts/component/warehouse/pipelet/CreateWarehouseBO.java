package com.intershop.ts.component.warehouse.pipelet;

import com.intershop.beehive.core.capi.localization.LocaleInformation;
import com.intershop.beehive.core.capi.log.Logger;
import com.intershop.beehive.core.capi.pipeline.Pipelet;
import com.intershop.beehive.core.capi.pipeline.PipeletExecutionException;
import com.intershop.beehive.core.capi.pipeline.PipelineDictionary;
import com.intershop.ts.component.warehouse.capi.WarehouseBO;
import com.intershop.ts.component.warehouse.capi.WarehouseBORepository;

public class CreateWarehouseBO extends Pipelet
{
    WarehouseBO warehouseBO = null;

    public int execute(PipelineDictionary aPipelineDictionary) throws PipeletExecutionException
    {
        WarehouseBORepository warehouseBORepository = aPipelineDictionary.getRequired("WarehouseBORepository");
        LocaleInformation localeInformation = aPipelineDictionary.getRequired("LocaleInformation");
        String warehouseName = aPipelineDictionary.getRequired("WarehouseName");
        if (warehouseName == null)
        {
            throw new PipeletExecutionException(
                            "Mandatory input parameter 'WarehouseName' not available in pipeline dictionary.");
        }
        String warehouseLocation = aPipelineDictionary.getRequired("WarehouseLocation");

        String warehouseDescription = aPipelineDictionary.getRequired("WarehousDescription");

        Integer warehouseCapacity = aPipelineDictionary.getRequired("WarehouseCapacity");
        try
        {
            warehouseBO = warehouseBORepository.getWarehouseBOByName(warehouseName);
            if (warehouseBO != null)
            {
                aPipelineDictionary.put("ErrorMsg", "DuplicateWarehouseName");
                return PIPELET_ERROR;
            }
            warehouseBO = warehouseBORepository.CreateWarehouseBO(warehouseName);
        }
        catch(Exception ex)
        {

            Logger.error(this, "Warehouse pipelet creation failed {}", ex.toString());
            return PIPELET_ERROR;
        }

        if (warehouseLocation != null && warehouseLocation.length() > 0)
        {
            warehouseBO.setLocation(warehouseLocation);
        }
        if (warehouseDescription != null && warehouseDescription.length() > 0)
        {
            warehouseBO.setDescription(warehouseDescription, localeInformation);
        }
        if (warehouseCapacity != null)
        {
            warehouseBO.setCapacity(warehouseCapacity);
        }
        aPipelineDictionary.put("WarehouseBO", warehouseBO);
        return PIPELET_NEXT;
    }

}
