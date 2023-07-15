package com.intershop.ts.component.warehouse.orm.internal;

import java.util.Collection;

import javax.inject.Inject;

import com.intershop.beehive.core.capi.domain.Domain;
import com.intershop.beehive.core.capi.naming.NamingMgr;
import com.intershop.beehive.core.capi.util.ObjectMapper;
import com.intershop.beehive.core.capi.util.ObjectMappingCollection;
import com.intershop.component.product.capi.ProductBO;
import com.intershop.component.repository.capi.AbstractDomainRepositoryBOExtension;
import com.intershop.component.repository.capi.RepositoryBO;
import com.intershop.ts.component.warehouse.capi.WarehouseBO;
import com.intershop.ts.component.warehouse.capi.WarehouseBORepository;

public class ORMWarehouseBORepositoryImpl extends AbstractDomainRepositoryBOExtension implements WarehouseBORepository,
                ObjectMapper<WarehousePO, WarehouseBO>
{

    @Inject
    private WarehousePOFactory factory;
    private Domain domain = getDomain();

    public ORMWarehouseBORepositoryImpl(String extensionID, RepositoryBO extendedObject)
    {
        super(extensionID, extendedObject);
        NamingMgr.injectMembers(this);
    }

    @Override
    public WarehouseBO CreateWarehouseBO(String warehouseName)
    {
        WarehousePO warehousePO = factory.create(domain, warehouseName);
        WarehouseBO warehouseBO = resolve(warehousePO);

        return warehouseBO;
    }

    @Override
    public void removeWarehouses(String warehouseID)
    {
        factory.remove(new WarehousePOKey(warehouseID));
    }

    @Override
    public WarehouseBO getWarehouseBOByID(String warehouseID)
    {
        WarehousePO warehousePO = factory.getObjectByPrimaryKey(new WarehousePOKey(warehouseID));
        return resolve(warehousePO);
    }

    @Override
    public WarehouseBO getWarehouseBOByName(String warehouseName)
    {
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Collection<WarehouseBO> getWarehouseBOs()
    {
        String domainID = getDomain().getDomainID();
        return new ObjectMappingCollection<WarehousePO, WarehouseBO>(factory.getObjectsByDomainID(domainID), this);
    }

    @Override
    public int getProductStockCount(ProductBO productbo)
    {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public WarehouseBO resolve(WarehousePO arg0)
    {
        return new ORMWarehouseBOImpl(arg0, getContext());
    }

}
