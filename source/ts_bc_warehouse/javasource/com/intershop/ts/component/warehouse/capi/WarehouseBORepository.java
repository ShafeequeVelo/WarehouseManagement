package com.intershop.ts.component.warehouse.capi;

import java.util.Collection;

import com.intershop.beehive.businessobject.capi.BusinessObjectRepository;
import com.intershop.component.product.capi.ProductBO;

public interface WarehouseBORepository extends BusinessObjectRepository
{
    static final String EXTENSION_ID = "WarehouseBORepository";

    WarehouseBO CreateWarehouseBO(String warehouseName);

    void removeWarehouses(String warehouseID);

    WarehouseBO getWarehouseBOByID(String warehouseID);

    WarehouseBO getWarehouseBOByName(String warehouseName);

    Collection<WarehouseBO> getWarehouseBOs();

    int getProductStockCount(ProductBO productbo);
}
