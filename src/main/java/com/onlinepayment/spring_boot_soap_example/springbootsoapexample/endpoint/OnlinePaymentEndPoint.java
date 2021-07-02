package com.onlinepayment.spring_boot_soap_example.springbootsoapexample.endpoint;

import com.onlinepayment.spring_boot_soap_example.springboot_soapexample.GetOnlinePaymentRequest;
import com.onlinepayment.spring_boot_soap_example.springboot_soapexample.GetOnlinePaymentResponse;
import com.onlinepayment.spring_boot_soap_example.springbootsoapexample.OnlinPaymentRepository;
import com.onlinepayment.spring_boot_soap_example.springbootsoapexample.service.OnlinePaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class OnlinePaymentEndPoint {
    private static final String NAMESPACE_URI = "http://onlinepayment.com/spring_boot_soap_example";
    
    private OnlinPaymentRepository onlinPaymentRepository;

    @Autowired
    public OnlinePaymentEndPoint(OnlinPaymentRepository OnlinePaymentService) {
        this.onlinPaymentRepository = OnlinePaymentService;
    }


    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "getOnlinePaymentRequest")
    @ResponsePayload
    public GetOnlinePaymentResponse getOnlinePaymentDetail(@RequestPayload GetOnlinePaymentRequest request ){
        GetOnlinePaymentRequest response =new GetOnlinePaymentRequest();
        response.setOnlinePaymentDetail(OnlinePaymentService.findOnlinePaymentDetail(request.getOnlinePaymentDetail()));
        return response;


    }

}


 



