package com.heller.tmf.plugin;

import com.heller.tmf.core.BizCode;
import com.heller.tmf.platform.delivery.DeliveryExtension;
import com.heller.tmf.platform.delivery.DeliveryItem;

//这个注解用来建立扩展点实现与业务的关联。
@BizCode("tmall")
public class TmallDeliveryExtension implements DeliveryExtension {

    public String getTransportMethod(DeliveryItem item) {
        return "oneDayExpress";
    }

    public String getReceiveMethod(DeliveryItem item) {
        return "receiveAtHome";
    }

}
