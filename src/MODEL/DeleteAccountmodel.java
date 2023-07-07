
package MODEL;

public class DeleteAccountmodel {
    String id,name,phone,acctype,date,balance;

    public DeleteAccountmodel(String id, String name, String phone, String acctype, String date, String balance) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.acctype = acctype;
        this.date=date;
        this.balance = balance;
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

    public String getAcc_type() {
        return acctype;
    }

    public void setAcc_type(String acctype ){ 
        this.acctype = acctype;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date= date;
    }
}

    
