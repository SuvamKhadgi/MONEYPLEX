package MODEL;

public class NewAdminmodel {
int id;
     String phone,fname,lname,password,question,answer;



 

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public NewAdminmodel( String phone, String fname, String lname, String question, String answer, String password) {
      
        this.phone = phone;
        this.fname = fname;
        this.lname = lname;
     
        this.password = password;
        this.question = question;
        this.answer = answer;
    }

}
