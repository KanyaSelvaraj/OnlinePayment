package com.onlinepayment.spring_boot_soap_example.springboot_soapexample;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory(){
    }
    public GetOnlinePaymentResponse createGetOnlinePaymentResponse() {
        return new GetOnlinePaymentResponse();
    }
    public OnlinePaymentDetail createOnlinePaymentDetail() {
        return new OnlinePaymentDetail();
    }
    public GetOnlinePaymentRequest createGetOnlinePaymentRequest() {
        return new GetOnlinePaymentRequest() ;
    }

}

