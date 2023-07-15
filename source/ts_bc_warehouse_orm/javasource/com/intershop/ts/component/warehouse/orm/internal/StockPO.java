// =============================================================================
// File: StockPO.java
// Generated by JGen Code Generator from INTERSHOP Communications AG.
// Generator template: ORMClass.xpt(checksum: 954aa2b015f6a59dd69d1cff59c8d023)
// =============================================================================
// The JGen Code Generator software is the property of INTERSHOP Communications AG. 
// Any rights to use are granted under the license agreement. 
// =============================================================================
package com.intershop.ts.component.warehouse.orm.internal;

import com.intershop.beehive.orm.capi.common.ORMObject;
import com.intershop.beehive.orm.capi.common.ORMObjectFactory;
import com.intershop.beehive.orm.capi.description.AttributeDescription;
import com.intershop.beehive.orm.capi.description.RelationDescription;

/**
 * @author training
 * @generated
 */
public class StockPO extends ORMObject
{

    /**
     * @generated
     */
    public static AttributeDescription countAttribute = null;
    /**
     * @generated
     */
    public static AttributeDescription productIDAttribute = null;
    /**
     * @generated
     */
    public static AttributeDescription domainIDAttribute = null;
    /**
     * @generated
     */
    public static AttributeDescription warehouseIDAttribute = null;

    /**
     * @generated
     */
    public static AttributeDescription ocaAttribute = null;

    /**
     * @generated
     */
    public static RelationDescription warehousePORelation = null;

    /**
     * The constructor.
     * 
     * @generated
     */
    public StockPO(ORMObjectFactory factory, StockPOKey key)
    {
        super(factory, key);
    }

    /**
     * Returns the name of the factory that manages this type of objects. The
     * name can be used to lookup the factory from the NamingMgr.
     * 
     * @return the factory name
     * @generated
     */
    public String getFactoryName()
    {
        return getClass().getName();
    }

    /**
     * Loads the state of the object from the database.
     * 
     * @deprecated use refresh now
     * @generated
     */
    public void load()
    {
        refresh();
    }

    /**
     * This hook is called whenever the bean has been modified.
     * 
     * @generated modifiable
     */
    public void onChange()
    {
        // {{ bean_onchange
        // put your custom onChange code here
        // }} bean_onchange

    }

    /**
     * Returns the value of attribute 'count'.
     * <p>
     * 
     * @return the value of the attribute 'count'
     * @generated
     */
    public int getCount()
    {
        Integer value = (Integer)getAttributeValue(countAttribute);
        return (value != null) ? value.intValue() : (int)0;
    }

    /**
     * Sets the value of the attribute 'count'.
     * <p>
     * 
     * @param aValue
     *            the new value of the attribute
     * @generated
     */
    public void setCount(int aValue)
    {

        if (setAttributeValue(countAttribute, new Integer(aValue)))
        {
            onChange();
        }
    }

    /**
     * Checks whether the value of the attribute 'count' is null.
     * <p>
     * 
     * @return true if the value of attribute 'count' is null, false otherwise
     * @generated
     */
    public boolean getCountNull()
    {
        return (getAttributeValue(countAttribute) == null);
    }

    /**
     * Sets the value of the attribute 'count' to null.
     * <p>
     * 
     * @param aFlag
     *            meaningless
     * @generated
     */
    public void setCountNull(boolean aFlag)
    {

        if (setAttributeValue(countAttribute, null))
        {

            onChange();
        }
    }

    /**
     * Returns the value of attribute 'productID'.
     * <p>
     * 
     * @return the value of the attribute 'productID'
     * @generated
     */
    public String getProductID()
    {
        String value = (String)getAttributeValue(productIDAttribute);
        return (value != null) ? value : "";
    }

    /**
     * Returns the value of attribute 'domainID'.
     * <p>
     * 
     * @return the value of the attribute 'domainID'
     * @generated
     */
    public String getDomainID()
    {
        String value = (String)getAttributeValue(domainIDAttribute);
        return (value != null) ? value : "";
    }

    /**
     * Returns the value of attribute 'warehouseID'.
     * <p>
     * 
     * @return the value of the attribute 'warehouseID'
     * @generated
     */
    public String getWarehouseID()
    {
        String value = (String)getAttributeValue(warehouseIDAttribute);
        return (value != null) ? value : "";
    }

    /**
     * Returns the value of attribute 'oca'.
     * <p>
     * 
     * @return the value of the attribute 'oca'
     * @generated
     */
    public int getOca()
    {
        Integer value = (Integer)getAttributeValue(ocaAttribute);
        return (value != null) ? value.intValue() : (int)0;
    }

    /**
     * Sets the value of the attribute 'oca'.
     * <p>
     * 
     * @param aValue
     *            the new value of the attribute
     * @generated
     */
    public void setOca(int aValue)
    {
        // oca may not be set from outside
    }

    /**
     * Checks whether the value of the attribute 'oca' is null.
     * <p>
     * 
     * @return true if the value of attribute 'oca' is null, false otherwise
     * @generated
     */
    public boolean getOcaNull()
    {
        return (getAttributeValue(ocaAttribute) == null);
    }

    /**
     * Sets the value of the attribute 'oca' to null.
     * <p>
     * 
     * @param aFlag
     *            meaningless
     * @generated
     */
    public void setOcaNull(boolean aFlag)
    {
        // oca may not be set from outside
    }

    /**
     * Returns the object for the relation 'warehousePO'.
     * <p>
     * 
     * @return the object for the relation 'warehousePO'
     * @generated
     */
    public WarehousePO getWarehousePO()
    {
        return (WarehousePO)getRelatedObject(warehousePORelation);
    }

}
