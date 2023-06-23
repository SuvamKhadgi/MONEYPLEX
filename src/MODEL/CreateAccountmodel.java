
package MODEL;
public class CreateAccountmodel {

   
    String fname, mname,lname,address,country,profession,email,typ_acc,dob,int_for,int_per,date;
    int phone,citizen_no,deposit_amt;

    public CreateAccountmodel(String fname, String mname, String lname, String address, String country, String profession, String email, String typ_acc, String dob, String int_for, String int_per, String date, int phone, int citizen_no, int deposit_amt) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.address = address;
        this.country = country;
        this.profession = profession;
        this.email = email;
        this.typ_acc = typ_acc;
        this.dob = dob;
        this.int_for = int_for;
        this.int_per = int_per;
        this.date = date;
        this.phone = phone;
        this.citizen_no = citizen_no;
        this.deposit_amt = deposit_amt;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTyp_acc() {
        return typ_acc;
    }

    public void setTyp_acc(String typ_acc) {
        this.typ_acc = typ_acc;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getInt_for() {
        return int_for;
    }

    public void setInt_for(String int_for) {
        this.int_for = int_for;
    }

    public String getInt_per() {
        return int_per;
    }

    public void setInt_per(String int_per) {
        this.int_per = int_per;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getCitizen_no() {
        return citizen_no;
    }

    public void setCitizen_no(int citizen_no) {
        this.citizen_no = citizen_no;
    }

    public int getDeposit_amt() {
        return deposit_amt;
    }

    public void setDeposit_amt(int deposit_amt) {
        this.deposit_amt = deposit_amt;
    }
}
 