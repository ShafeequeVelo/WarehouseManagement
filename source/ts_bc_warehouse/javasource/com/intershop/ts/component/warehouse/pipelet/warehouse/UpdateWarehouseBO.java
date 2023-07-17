package com.intershop.ts.component.warehouse.pipelet.warehouse;

import com.intershop.beehive.core.capi.localization.LocaleInformation;
import com.intershop.beehive.core.capi.pipeline.Pipelet;
import com.intershop.beehive.core.capi.pipeline.PipeletExecutionException;
import com.intershop.beehive.core.capi.pipeline.PipelineDictionary;
import com.intershop.ts.component.warehouse.capi.WarehouseBO;
import com.intershop.ts.component.warehouse.capi.WarehouseBORepository;

public class UpdateWarehouseBO extends Pipelet
{

    public int execute(PipelineDictionary aPipelineDictionary) throws PipeletExecutionException
    {
        WarehouseBORepository warehouseBORepository = aPipelineDictionary.getRequired("WarehouseBORepository");
        
        LocaleInformation localeInformation = aPipelineDictionary.getRequired("LocaleInformation");
        
        String warehouseDescription = (String)aPipelineDictionary.get("WarehouseDescription");
                
        String warehouseLocation = (String)aPipelineDictionary.get("WarehouseLocation");
        
        String warehouseName = (String)aPipelineDictionary.getRequired("WarehouseName");
        
        if(null == warehouseName)
        {
            throw new PipeletExecutionException("Mandatory input parameter 'WarehouseName' not available in pipeline dictionary.");
        }
        
        Integer warehouseCapacity = aPipelineDictionary.get("WarehouseCapacity");
        
        WarehouseBO warehouseBO, warehouseBO1;
        
        warehouseBO = aPipelineDictionary.get("WarehouseBO");
        
        if(!warehouseName.equals(warehouseBO.getName().toString()))
        {
            warehouseBO1 = warehouseBORepository.getWarehouseBOByName(warehouseName);
            if(warehouseBO1 == null)
            {
                if (warehouseName != null && warehouseName.length()>0)
                {
                    warehouseBO.setName(warehouseName);
                } 
            }
            else
            {
                aPipelineDictionary.put("ErrorMsg", "DuplicateWarehouseName");
                return PIPELET_ERROR;
                }
        }

        if (warehouseLocation != null && warehouseLocation.length()>0)
        {
            warehouseBO.setLocation(warehouseLocation);
        }
           

        if (warehouseDescription != null && warehouseDescription.length()>0)
        {
            warehouseBO.setDescription(warehouseDescription, localeInformation);
        }
        
        if (warehouseCapacity != null)
        {
            warehouseBO.setCapacity(warehouseCapacity);
        }
        
        return PIPELET_NEXT;
    }
}