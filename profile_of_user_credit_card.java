package software1.softwareengineering1.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class profile_of_user_credit_card {
    @Id
    @GeneratedValue
    private int PK;
    private String CardType;
    private String CreditCardNumber;
    private String NameOfCreditCard;
    private int CsvCode;
    private String CreditCardExpirationDateMonth;
    private String CreditCardExpirationDateYear;
    private String UserEmailFK;

    public String getCardType() {
        return CardType;
    }

    public void setCardType(String cardType) {
        CardType = cardType;
    }

    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }

    public String getNameOfCreditCard() {
        return NameOfCreditCard;
    }

    public void setNameOfCreditCard(String nameOfCreditCard) {
        NameOfCreditCard = nameOfCreditCard;
    }

    public int getCsvCode() {
        return CsvCode;
    }

    public void setCsvCode(int csvCode) {
        CsvCode = csvCode;
    }

    public String getCreditCardExpirationDateMonth() {
        return CreditCardExpirationDateMonth;
    }

    public void setCreditCardExpirationDateMonth(String creditCardExpirationDateMonth) {
        CreditCardExpirationDateMonth = creditCardExpirationDateMonth;
    }

    public String getCreditCardExpirationDateYear() {
        return CreditCardExpirationDateYear;
    }

    public void setCreditCardExpirationDateYear(String creditCardExpirationDateYear) {
        CreditCardExpirationDateYear = creditCardExpirationDateYear;
    }

    public String getUserEmailFK() {
        return UserEmailFK;
    }

    public void setUserEmailFK(String userEmailFK) {
        UserEmailFK = userEmailFK;
    }

    public int getPK() {
        return PK;
    }

    public void setPK(int PK) {
        this.PK = PK;
    }



    public profile_of_user_credit_card(String cardType, String creditCardNumber,
                                       String nameOfCreditCard, int csvCode, String creditCardExpirationDateMonth,
                                       String creditCardExpirationDateYear, String userEmailFK, int PK) {
        this.CardType = cardType;
        this.CreditCardNumber = creditCardNumber;
        this.NameOfCreditCard = nameOfCreditCard;
        this.CsvCode = csvCode;
        this.CreditCardExpirationDateMonth = creditCardExpirationDateMonth;
        this.CreditCardExpirationDateYear = creditCardExpirationDateYear;
        this.UserEmailFK = userEmailFK;
        this.PK = PK;
    }




//end
}
