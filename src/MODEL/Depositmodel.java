package MODEL;

public class Depositmodel {
       String id,name,ava_amt,deposit_amt,date,total;

    public Depositmodel(String id, String name, String ava_amt, String deposit_amt, String date, String total) {
        this.id = id;
        this.name = name;
        this.ava_amt = ava_amt;
        this.deposit_amt = deposit_amt;
        this.date = date;
        this.total = total;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAva_amt() {
        return ava_amt;
    }

    public void setAva_amt(String ava_amt) {
        this.ava_amt = ava_amt;
    }

    public String getDeposit_amt() {
        return deposit_amt;
    }

    public void setDeposit_amt(String deposit_amt) {
        this.deposit_amt = deposit_amt;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
