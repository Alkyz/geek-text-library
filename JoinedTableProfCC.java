package software1.softwareengineering1.dto;

import jdk.jfr.DataAmount;
import software1.softwareengineering1.entity.profile_of_user;
import software1.softwareengineering1.entity.profile_of_user_credit_card;
import software1.softwareengineering1.repository.profile_of_user_repository;



public class JoinedTableProfCC {
    public software1.softwareengineering1.entity.profile_of_user getProfile_of_user() {
        return profile_of_user;
    }

    public void setProfile_of_user(software1.softwareengineering1.entity.profile_of_user profile_of_user) {
        this.profile_of_user = profile_of_user;
    }

    private profile_of_user profile_of_user;
}
