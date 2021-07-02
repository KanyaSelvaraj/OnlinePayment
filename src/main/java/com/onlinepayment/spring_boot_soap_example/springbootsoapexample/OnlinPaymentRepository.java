package com.onlinepayment.spring_boot_soap_example.springbootsoapexample;

import com.onlinepayment.spring_boot_soap_example.springboot_soapexample.OnlinePaymentDetail;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Component
public class OnlinPaymentRepository {
    private static final Map<String, OnlinePaymentDetail> onlinePaymentDetail = new HashMap<>();
    @PostConstruct
    public void intialize() {
        OnlinePaymentDetail detail = new OnlinePaymentDetail();
        detail.setRRN("RollNumber");
        onlinePaymentDetail.put(detail.getRRN(), detail);
        detail.setBANK_CODE("BankDetail");
        onlinePaymentDetail.put(detail.getBANK_CODE(), detail);
        detail.setCARDNUMBER(1234567);
        detail.setLANACCOUNT("Accountdetail");
        onlinePaymentDetail.put(detail.getLANACCOUNT(), detail);
        detail.setCUSTID(01);
        detail.setACTIVITYFLAG("Active");
        onlinePaymentDetail.put(detail.getACTIVITYFLAG(), detail);
        detail.setSTATUSRRN("Status");
        onlinePaymentDetail.put(detail.getSTATUSRRN(), detail);
        detail.setAMOUNT(2000);
        detail.setLASTPAYDATE(500);
        detail.setTRANSNUMBER("Transfer");
        onlinePaymentDetail.put(detail.getTRANSNUMBER(), detail);
        detail.setREINSTATED("Reinstated");
        onlinePaymentDetail.put(detail.getREINSTATED(), detail);


    }


}

