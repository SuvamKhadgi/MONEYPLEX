package MODEL;
public class FundTransfermodel {
    String senderac,reciverac,transferamt,date,reference;

    public FundTransfermodel(String senderac, String reciverac, String transferamt, String date, String reference) {
        this.senderac = senderac;
        this.reciverac = reciverac;
        this.transferamt = transferamt;
        this.date = date;
        this.reference = reference;
    }

    public String getSenderac() {
        return senderac;
    }

    public void setSenderac(String senderac) {
        this.senderac = senderac;
    }

    public String getReciverac() {
        return reciverac;
    }

    public void setReciverac(String reciverac) {
        this.reciverac = reciverac;
    }

    public String getTransferamt() {
        return transferamt;
    }

    public void setTransferamt(String transferamt) {
        this.transferamt = transferamt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
