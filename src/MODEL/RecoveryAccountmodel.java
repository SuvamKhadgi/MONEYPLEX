
package MODEL;

public class RecoveryAccountmodel {
    String phone,question,answer,password;

    public RecoveryAccountmodel(String phone, String question, String answer, String password) {
        this.phone = phone;
        this.question = question;
        this.answer = answer;
        this.password = password;
    }
    public RecoveryAccountmodel(){
        
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
