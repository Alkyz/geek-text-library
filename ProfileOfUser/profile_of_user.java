package software1.softwareengineering1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class profile_of_user {


    public profile_of_user(){
    }

    public profile_of_user(String userEmail, String userPassword, String userName, String userLastName,
                           String userHomeAddress, String userHomeAddressState, String userHomeAddressZipCode) {
        UserEmail = userEmail;
        UserPassword = userPassword;
        UserName = userName;
        UserLastName = userLastName;
        UserHomeAddress = userHomeAddress;
        UserHomeAddressState = userHomeAddressState;
        UserHomeAddressZipCode = userHomeAddressZipCode;
    }



    @Id
   // @GeneratedValue
    private String UserEmail;
    private String UserPassword;
    private String UserName;
    private String UserLastName;
    private String UserHomeAddress;
    private String UserHomeAddressState;
    private String UserHomeAddressZipCode;


    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String userLastName) {
        UserLastName = userLastName;
    }

    public String getUserHomeAddress() {
        return UserHomeAddress;
    }

    public void setUserHomeAddress(String userHomeAddress) {
        UserHomeAddress = userHomeAddress;
    }

    public String getUserHomeAddressState() {
        return UserHomeAddressState;
    }

    public void setUserHomeAddressState(String userHomeAddressState) {
        UserHomeAddressState = userHomeAddressState;
    }

    public String getUserHomeAddressZipCode() {
        return UserHomeAddressZipCode;
    }

    public void setUserHomeAddressZipCode(String userHomeAddressZipCode) {
        UserHomeAddressZipCode = userHomeAddressZipCode;
    }
}
