package com.intershop.ts.component.warehouse.capi;

import com.intershop.beehive.businessobject.capi.BusinessObject;
import com.intershop.beehive.core.capi.localization.LocaleInformation;

public interface WarehouseBO extends BusinessObject
{
    String getName();
    void setName(String name);
    String getLocation();
    void setLocation(String location);
    int getCapacity();
    void setCapacity(int Capacity);
    String getDescription();
    String getDescription(LocaleInformation localeInformation);
    void getDescription(String description, LocaleInformation localeInformation);

}
