package inc.flide.docman.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ID")    
    private long id;
    @Column (name = "first_name")    
    private String firstName;
    @Column (name = "last_name")    
    private String lastName;
    @Column (name = "pan_number")    
    private String panNumber;
    @Column (name = "email_address")    
    private String emailAddress;
    @Column (name = "date_of_birth")    
    private Date dateOfBirth;

    public Client() { }

    public Client(Client client) {
        this.firstName = client.firstName;
        this.lastName = client.lastName;
        this.panNumber = client.panNumber;
        this.emailAddress = client.emailAddress;
        this.dateOfBirth = client.dateOfBirth;
    }
    public Client(String firstName, String lastName, String panNumber, String emailAddress, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.panNumber = panNumber;
        this.emailAddress = emailAddress;
        this.dateOfBirth = dateOfBirth;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPanNumber() {
        return panNumber;
    }
    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    
}