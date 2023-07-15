package com.intershop.ts.component.warehouse.pipelet.warehouse;

import java.util.Collection;

import com.intershop.beehive.core.capi.pipeline.Pipelet;
import com.intershop.beehive.core.capi.pipeline.PipeletExecutionException;
import com.intershop.beehive.core.capi.pipeline.PipelineDictionary;
import com.intershop.ts.component.warehouse.capi.WarehouseBO;
import com.intershop.ts.component.warehouse.capi.WarehouseBORepository;

public class GetWarehouseBOs extends Pipelet
{

    public int execute(PipelineDictionary aPipelineDictionary) throws PipeletExecutionException
    {

        WarehouseBORepository warehouseBORepository = aPipelineDictionary.getRequired("WarehouseBORepository");

        Collection<WarehouseBO> warehouseBOs = warehouseBORepository.getWarehouseBOs();

        aPipelineDictionary.put("WarehouseBOs", warehouseBOs);

        return PIPELET_NEXT;
    }

}
