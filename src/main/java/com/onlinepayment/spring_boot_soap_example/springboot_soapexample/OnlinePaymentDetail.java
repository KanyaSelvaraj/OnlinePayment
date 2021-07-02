package com.onlinepayment.spring_boot_soap_example.springboot_soapexample;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Map;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OnlinePaymentDetail", propOrder = {
        "RRN","BANK_CODE","CARDNUMBER","LANACCOUNT",
        "CUSTID","ACTIVITYFLAG","STATUSRRN","AMOUNT",
        "LASTPAYDATE","TRANSNUMBER","REINSTATED"
})
public class OnlinePaymentDetail {


    @XmlElement(required = true)
    protected String RRN;
    @XmlElement(required = true)
    protected String BANK_CODE;
    @XmlElement(required = true)
    protected int CARDNUMBER;
    @XmlElement(required = true)
    protected String LANACCOUNT;
    @XmlElement(required = true)
    protected int CUSTID;
    @XmlElement(required = true)
    protected String ACTIVITYFLAG;
    @XmlElement(required = true)
    protected String STATUSRRN;
    @XmlElement(required = true)
    protected int AMOUNT;
    @XmlElement(required = true)
    protected int LASTPAYDATE;
    @XmlElement(required = true)
    protected String TRANSNUMBER;
    @XmlElement(required = true)
    protected String REINSTATED;


    public String getRRN() {

        return RRN;
    }

    public void setRRN(String RRN) {

        this.RRN = RRN;
    }

    public String getBANK_CODE() {

        return BANK_CODE;
    }

    public void setBANK_CODE(String BANK_CODE) {

        this.BANK_CODE = BANK_CODE;
    }

    public int getCARDNUMBER() {

        return CARDNUMBER;
    }

    public void setCARDNUMBER(int CARDNUMBER) {

        this.CARDNUMBER = CARDNUMBER;
    }

    public String getLANACCOUNT() {

        return LANACCOUNT;
    }

    public void setLANACCOUNT(String LANACCOUNT) {

        this.LANACCOUNT = LANACCOUNT;
    }

    public int getCUSTID() {

        return CUSTID;
    }

    public void setCUSTID(int CUSTID) {

        this.CUSTID = CUSTID;
    }

    public String getACTIVITYFLAG() {

        return ACTIVITYFLAG;
    }

    public void setACTIVITYFLAG(String ACTIVITYFLAG) {

        this.ACTIVITYFLAG = ACTIVITYFLAG;
    }

    public String getSTATUSRRN() {

        return STATUSRRN;
    }

    public void setSTATUSRRN(String STATUSRRN) {

        this.STATUSRRN = STATUSRRN;
    }

    public int getAMOUNT() {

        return AMOUNT;
    }
    public void setAMOUNT(int AMOUNT) {

        this.AMOUNT = AMOUNT;
    }

    public int getLASTPAYDATE() {

        return LASTPAYDATE;
    }

    public void setLASTPAYDATE(int LASTPAYDATE) {

        this.LASTPAYDATE = LASTPAYDATE;
    }

    public String getTRANSNUMBER() {

        return TRANSNUMBER;
    }

    public void setTRANSNUMBER(String TRANSNUMBER) {

        this.TRANSNUMBER = TRANSNUMBER;
    }

    public String getREINSTATED() {

        return REINSTATED;
    }

    public void setREINSTATED(String REINSTATED) {

        this.REINSTATED = REINSTATED;
    }
}




