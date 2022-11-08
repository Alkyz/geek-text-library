package software1.softwareengineering1.entity;

import javax.persistence.*;

@Entity
public class profile_of_user_credit_card {


   public profile_of_user_credit_card(){

   }


    public profile_of_user_credit_card(String user_card_type, String user_credit_card_number,
                                       String user_name_of_credit_card, int user_csv_code,
                                       String user_credit_card_expiration_date_month, String user_credit_card_expiration_date_year,
                                       String user_email_fk) {
        this.user_card_type = user_card_type;
        this.user_credit_card_number = user_credit_card_number;
        this.user_name_of_credit_card = user_name_of_credit_card;
        this.user_csv_code = user_csv_code;
        this.user_credit_card_expiration_date_month = user_credit_card_expiration_date_month;
        this.user_credit_card_expiration_date_year = user_credit_card_expiration_date_year;
        this.user_email_fk = user_email_fk;
    }


    private String user_card_type;
    private String user_credit_card_number;
    private String user_name_of_credit_card;
    private int user_csv_code;
    private String user_credit_card_expiration_date_month;
    private String user_credit_card_expiration_date_year;

    @Id
    private String user_email_fk;



    public String getUser_card_type() {
        return user_card_type;
    }

    public void setUser_card_type(String user_card_type) {
        this.user_card_type = user_card_type;
    }

    public String getUser_credit_card_number() {
        return user_credit_card_number;
    }

    public void setUser_credit_card_number(String user_credit_card_number) {
        this.user_credit_card_number = user_credit_card_number;
    }

    public String getUser_name_of_credit_card() {
        return user_name_of_credit_card;
    }

    public void setUser_name_of_credit_card(String user_name_of_credit_card) {
        this.user_name_of_credit_card = user_name_of_credit_card;
    }

    public int getUser_csv_code() {
        return user_csv_code;
    }

    public void setUser_csv_code(int user_csv_code) {
        this.user_csv_code = user_csv_code;
    }

    public String getUser_credit_card_expiration_date_month() {
        return user_credit_card_expiration_date_month;
    }

    public void setUser_credit_card_expiration_date_month(String user_credit_card_expiration_date_month) {
        this.user_credit_card_expiration_date_month = user_credit_card_expiration_date_month;
    }

    public String getUser_credit_card_expiration_date_year() {
        return user_credit_card_expiration_date_year;
    }

    public void setUser_credit_card_expiration_date_year(String user_credit_card_expiration_date_year) {
        this.user_credit_card_expiration_date_year = user_credit_card_expiration_date_year;
    }

    public String getUser_email_fk() {
        return user_email_fk;
    }

    public void setUser_email_fk(String user_name_fk) {
        this.user_email_fk = user_name_fk;
    }















//end
}
