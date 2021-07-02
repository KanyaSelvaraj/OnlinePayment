package com.onlinepayment.spring_boot_soap_example.springboot_soapexample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "",propOrder = {
        "CARDNUMBER"
})
@XmlRootElement(name = "GetOnlinePaymentRequest")
public class GetOnlinePaymentRequest {

    protected int CARDNUMBER;

    public int getCARDNUMBER(){

        return CARDNUMBER;
    }

    public void setCARDNUMBER(int CARDNUMBER) {

        this.CARDNUMBER = CARDNUMBER;
    }

}


