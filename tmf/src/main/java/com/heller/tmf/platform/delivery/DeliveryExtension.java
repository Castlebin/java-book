package com.heller.tmf.platform;

import com.heller.tmf.core.ExtensionPoint;

@ExtensionPoint
public interface DeliveryExtension {

    String getTransportMethod(DeliveryItem item);

    String getReceiveMethod(DeliveryItem item);

}