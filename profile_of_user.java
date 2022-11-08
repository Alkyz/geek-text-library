package software1.softwareengineering1.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class profile_of_user {
    public profile_of_user(String user_email, String user_password, String user_name,
                           String User_lastname, String user_home_address,
                           String user_home_address_state,
                           String user_home_address_zip_code) {

        this.User_email = user_email;
        this.User_password = user_password;
        this.User_name = user_name;
        this.User_lastname = User_lastname;
        this.user_home_address = user_home_address;
        this.user_home_address_state = user_home_address_state;
        this.user_home_address_zip_code = user_home_address_zip_code;
    }

    public profile_of_user(){
    }

    @OneToOne(cascade = CascadeType.ALL, targetEntity = profile_of_user.class)
    @JoinColumn(name = "user_email_fk", referencedColumnName = "User_email")
    private List<profile_of_user_credit_card> credit_card;

    @Id
    private String User_email;
    private String User_password;
    private String User_name;
    private String User_lastname;
    private String user_home_address;
    private String user_home_address_state;
    private String user_home_address_zip_code;





    public String getUser_email() {
        return User_email;
    }

    public void setUser_email(String user_email) {
        user_email = user_email;
    }

    public String getUser_password() {
        return User_password;
    }

    public void setUser_password(String user_password) {
        User_password = user_password;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getUser_lastName() {
        return User_lastname;
    }

    public void setUser_lastName(String user_lastname) {
        User_lastname = user_lastname;
    }

    public String getUser_home_address() {
        return user_home_address;
    }

    public void setUser_home_address(String user_home_address) {
        this.user_home_address = user_home_address;
    }

    public String getUser_home_address_state() {
        return user_home_address_state;
    }

    public void setUser_home_address_state(String user_home_address_state) {
        this.user_home_address_state = user_home_address_state;
    }

    public String getUser_home_address_zip_code() {
        return user_home_address_zip_code;
    }

    public void setUser_home_address_zip_code(String user_home_address_zip_code) {
        this.user_home_address_zip_code = user_home_address_zip_code;
    }






}
