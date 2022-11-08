package software1.softwareengineering1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software1.softwareengineering1.entity.profile_of_user_credit_card;
import software1.softwareengineering1.repository.Credit_Card_repository;

import java.util.List;
import java.util.Objects;

@Service
public class Credit_Card_service_implemented implements Credit_Card_service{

    @Autowired
    private Credit_Card_repository Credit_Card_repository_variable;


    @Override
    public profile_of_user_credit_card update_profile_Credit_Card(String user_name_fk_variable, profile_of_user_credit_card user_card) {
        profile_of_user_credit_card user_CC_DB = fetchingListByID_CC(user_name_fk_variable);

        //card type
        if(Objects.nonNull(user_card.getUser_email_fk()) && !"".equalsIgnoreCase(user_card.getUser_email_fk())){
            user_CC_DB.setUser_card_type(user_card.getUser_card_type());
        }

        //card number
        if(Objects.nonNull(user_card.getUser_email_fk()) && !"".equalsIgnoreCase(user_card.getUser_email_fk())){
            user_CC_DB.setUser_credit_card_number(user_card.getUser_credit_card_number());
        }

        //expir. month
        if(Objects.nonNull(user_card.getUser_email_fk()) && !"".equalsIgnoreCase(user_card.getUser_email_fk())){
            user_CC_DB.setUser_credit_card_expiration_date_month(user_card.getUser_credit_card_expiration_date_month());
        }

        //year
        if(Objects.nonNull(user_card.getUser_email_fk()) && !"".equalsIgnoreCase(user_card.getUser_email_fk())){
            user_CC_DB.setUser_credit_card_expiration_date_year(user_card.getUser_credit_card_expiration_date_year());
        }

        //csv
        if(Objects.nonNull(user_card.getUser_email_fk()) && !"".equalsIgnoreCase(user_card.getUser_email_fk())){
            user_CC_DB.setUser_csv_code(user_card.getUser_csv_code());
        }

        //card name
        if(Objects.nonNull(user_card.getUser_email_fk()) && !"".equalsIgnoreCase(user_card.getUser_email_fk())){
            user_CC_DB.setUser_name_of_credit_card(user_card.getUser_name_of_credit_card());
        }

        //user_email_fk
        if(Objects.nonNull(user_card.getUser_email_fk()) && !"".equalsIgnoreCase(user_card.getUser_email_fk())){
            user_CC_DB.setUser_email_fk(user_card.getUser_email_fk());
        }


        return Credit_Card_repository_variable.save(user_card);


    }

    @Override
    public void delete_user_CC(String user_delete_CC) {
        Credit_Card_repository_variable.deleteById(user_delete_CC);
    }

    @Override
    public profile_of_user_credit_card Save_user_CC(profile_of_user_credit_card save_user_CC) {
        return Credit_Card_repository_variable.save(save_user_CC);
    }

    @Override
    public List<profile_of_user_credit_card> fetchingListOfCC() {
        return Credit_Card_repository_variable.findAll();
    }

    @Override
    public profile_of_user_credit_card fetchingListByID_CC(String user_CC) {
        return Credit_Card_repository_variable.findById(user_CC).get();
    }
}
