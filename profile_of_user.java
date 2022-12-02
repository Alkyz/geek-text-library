package software1.softwareengineering1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
@Data
@NoArgsConstructor
@ToString
@Entity
public class profile_of_user {

    public profile_of_user(String userEmail, String UserPassword, String userName, String userLastName,
                           String userHomeAddress, String userHomeAddressState, String userHomeAddressZipCode,List<profile_of_user_credit_card> user_credit_cards) {
        UserEmail = userEmail;
        userPassword = UserPassword;
        UserName = userName;
        UserLastName = userLastName;
        UserHomeAddress = userHomeAddress;
        UserHomeAddressState = userHomeAddressState;
        UserHomeAddressZipCode = userHomeAddressZipCode;
        user_credit_card = user_credit_cards;
    }



    @Id
    // @GeneratedValue
    private String UserEmail;

    private String userPassword;
    private String UserName;
    private String UserLastName;
    private String UserHomeAddress;
    private String UserHomeAddressState;
    private String UserHomeAddressZipCode;

  /*  @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "UserEmailFK")
    private List<profile_of_user_credit_card> user_credit_card;*/

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "UserEmailFK", updatable = false, insertable = false)
    private List<profile_of_user_credit_card> user_credit_card;

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String UserPassword) {
        userPassword = UserPassword;
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