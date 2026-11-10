package murach.business;
import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String date;              // Ngày sinh
    private String heardFrom;         // Biết từ đâu
    private String wantUpdates;       // Muốn nhận update không
    private String sendAnnouncements; // Muốn nhận thông báo không
    private String contactVia;        // Hình thức liên lạc

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        date = "";
        heardFrom = "";
        wantUpdates = "";
        sendAnnouncements = "";
        contactVia = "";
    }

    public User(String firstName, String lastName, String email, String date, 
                String heardFrom, String wantUpdates, String sendAnnouncements, String contactVia) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.date = date;
        this.heardFrom = heardFrom;
        this.wantUpdates = wantUpdates;
        this.sendAnnouncements = sendAnnouncements;
        this.contactVia = contactVia;
    }

   
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getEmail() { return email; }
    public String getDate() { return date; }
    public String getHeardFrom() { return heardFrom; }
    public String getWantUpdates() { return wantUpdates; }
    public String getSendAnnouncements() { return sendAnnouncements; }
    public String getContactVia() { return contactVia; }

}