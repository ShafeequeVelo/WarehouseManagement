// =============================================================================
// File: StockPOKey.java
// Generated by JGen Code Generator from INTERSHOP Communications AG.
// Generator template: ORMKey.xpt(checksum: b5b09bf4e9329db7d7dafe870b159b0d)
// =============================================================================
// The JGen Code Generator software is the property of INTERSHOP Communications AG. 
// Any rights to use are granted under the license agreement.
// =============================================================================
package com.intershop.ts.component.warehouse.orm.internal;

import com.intershop.beehive.orm.capi.common.ORMObjectKey;

/**
 * This class represents the primary key for objects of type StockPO. The key
 * objects can be used for lookup operations in the database.
 * 
 * @author training
 * 
 * @generated
 */
public class StockPOKey extends ORMObjectKey
{
    /**
     * Useless constant to make compiler happy.
     * 
     * @generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * A primary key attribute.
     * 
     * @generated
     */
    private String productID;
    /**
     * A primary key attribute.
     * 
     * @generated
     */
    private String domainID;
    /**
     * A primary key attribute.
     * 
     * @generated
     */
    private String warehouseID;

    /**
     * Creates an empty primary key. After creation of a new key object you must
     * call the corresponding set<i>Attribute</i> method(s) to set the value(s)
     * of the primary key.
     * 
     * @generated
     */
    public StockPOKey()
    {
    }

    /**
     * Creates a primary key with the specified value(s).
     * 
     * @generated
     */
    public StockPOKey(String productID, String domainID, String warehouseID)
    {
        this.productID = productID;
        this.domainID = domainID;
        this.warehouseID = warehouseID;
    }

    /**
     * Returns the key attribute.
     * 
     * @return the value of the primary key attribute
     * @generated
     */
    public String getProductID()
    {
        return productID;
    }

    /**
     * Sets the key attribute.
     * 
     * @param value
     *            the attribute value
     * @generated
     */
    public void setProductID(String value)
    {
        this.productID = value;
    }

    /**
     * Returns the key attribute.
     * 
     * @return the value of the primary key attribute
     * @generated
     */
    public String getDomainID()
    {
        return domainID;
    }

    /**
     * Sets the key attribute.
     * 
     * @param value
     *            the attribute value
     * @generated
     */
    public void setDomainID(String value)
    {
        this.domainID = value;
    }

    /**
     * Returns the key attribute.
     * 
     * @return the value of the primary key attribute
     * @generated
     */
    public String getWarehouseID()
    {
        return warehouseID;
    }

    /**
     * Sets the key attribute.
     * 
     * @param value
     *            the attribute value
     * @generated
     */
    public void setWarehouseID(String value)
    {
        this.warehouseID = value;
    }

    /**
     * Returns the hashcode of the key object.
     * 
     * @return the hashcode
     * @generated
     */
    public int hashCode()
    {
        int hash = 0;

        hash ^= productID.hashCode();
        hash ^= domainID.hashCode();
        hash ^= warehouseID.hashCode();

        return hash;
    }

    /**
     * Compares an object with this key object.
     * 
     * @return true, if all the other object is a key object and all their key
     *         attributes are equal
     * @generated
     */
    public boolean equals(Object anObject)
    {
        if (this == anObject)
        {
            return true;
        }

        if (anObject != null)
        {
            if (anObject instanceof StockPOKey)
            {
                StockPOKey that = (StockPOKey)anObject;

                if (!productID.equals(that.productID))
                {
                    return false;
                }
                if (!domainID.equals(that.domainID))
                {
                    return false;
                }
                if (!warehouseID.equals(that.warehouseID))
                {
                    return false;
                }

                return true;
            }
        }

        return false;
    }

    /**
     * Returns a String representation of this key object.
     * 
     * @return a string containing the key attributes
     * @generated
     */
    public String toString()
    {
        StringBuffer buf = new StringBuffer("com.intershop.ts.component.warehouse.orm.internal.StockPOKey[");

        buf.append(productID);
        buf.append(", ");
        buf.append(domainID);
        buf.append(", ");
        buf.append(warehouseID);
        buf.append("]");

        return buf.toString();
    }
}
