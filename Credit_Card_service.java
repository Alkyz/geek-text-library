package software1.softwareengineering1.service;

import software1.softwareengineering1.entity.profile_of_user_credit_card;

import java.util.List;


public interface Credit_Card_service {

    public profile_of_user_credit_card update_profile_Credit_Card(String user_name_fk_variable, profile_of_user_credit_card user_card);

    public void delete_user_CC(String user_delete_CC);

    public profile_of_user_credit_card Save_user_CC(profile_of_user_credit_card save_user_CC);

    public List<profile_of_user_credit_card> fetchingListOfCC();

    public profile_of_user_credit_card fetchingListByID_CC(String user_CC);


}
