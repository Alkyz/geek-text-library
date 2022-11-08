package software1.softwareengineering1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software1.softwareengineering1.entity.profile_of_user;
import software1.softwareengineering1.repository.profile_of_user_repository;

import java.util.List;
import java.util.Objects;

@Service
public class profile_of_user_service_implemented implements profile_of_user_service{
    @Autowired
    private profile_of_user_repository Profile_of_user_repository;

    @Override
    public profile_of_user Save_user_controller(profile_of_user profile_user) {
        return Profile_of_user_repository.save(profile_user);
    }

    @Override
    public List<profile_of_user> fetchingList() {
        return Profile_of_user_repository.findAll();
    }

    @Override
    public profile_of_user fetchingListByID(String user_id) {
        return Profile_of_user_repository.findById(user_id).get();
    }

    @Override
    public void deleteProfileByUserEmailID(String User_ID) {
        Profile_of_user_repository.deleteById(User_ID);
    }

    @Override
    public profile_of_user update_profile_attributes(String user_id, profile_of_user profile_user_attributes) {
        profile_of_user profile_of_user_DB = fetchingListByID(user_id);

        //user_email
        if(Objects.nonNull(profile_user_attributes.getUserEmail()) && !"".equalsIgnoreCase(profile_user_attributes.getUserEmail())){
            profile_of_user_DB.setUserEmail(profile_user_attributes.getUserEmail());
        }



        //user_password
        if(Objects.nonNull(profile_user_attributes.getUserEmail()) && !"".equalsIgnoreCase(profile_user_attributes.getUserEmail())){
            profile_of_user_DB.setUserPassword(profile_user_attributes.getUserPassword());
        }

        //user_Name
        if(Objects.nonNull(profile_user_attributes.getUserEmail()) && !"".equalsIgnoreCase(profile_user_attributes.getUserEmail())){
            profile_of_user_DB.setUserName(profile_user_attributes.getUserName());
        }

        //user_lastName
        if(Objects.nonNull(profile_user_attributes.getUserEmail()) && !"".equalsIgnoreCase(profile_user_attributes.getUserEmail())){
            profile_of_user_DB.setUserLastName(profile_user_attributes.getUserLastName());
        }

        //user_home_address
        if(Objects.nonNull(profile_user_attributes.getUserEmail()) && !"".equalsIgnoreCase(profile_user_attributes.getUserEmail())){
            profile_of_user_DB.setUserHomeAddress(profile_user_attributes.getUserHomeAddress());
        }


        //user_home_address_state
        if(Objects.nonNull(profile_user_attributes.getUserEmail()) && !"".equalsIgnoreCase(profile_user_attributes.getUserEmail())){
            profile_of_user_DB.setUserHomeAddressState(profile_user_attributes.getUserHomeAddressState());
        }

        //user_home_address_zip_code
        if(Objects.nonNull(profile_user_attributes.getUserEmail()) && !"".equalsIgnoreCase(profile_user_attributes.getUserEmail())){
            profile_of_user_DB.setUserHomeAddressZipCode(profile_user_attributes.getUserHomeAddressZipCode());
        }


        return Profile_of_user_repository.save(profile_user_attributes);
    }
}
