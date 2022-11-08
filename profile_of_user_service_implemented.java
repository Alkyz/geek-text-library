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
        if(Objects.nonNull(profile_user_attributes.getUser_email()) && !"".equalsIgnoreCase(profile_user_attributes.getUser_email())){
            profile_of_user_DB.setUser_email(profile_user_attributes.getUser_email());
        }



        //user_password
        if(Objects.nonNull(profile_user_attributes.getUser_email()) && !"".equalsIgnoreCase(profile_user_attributes.getUser_email())){
            profile_of_user_DB.setUser_password(profile_user_attributes.getUser_password());
        }

        //user_Name
        if(Objects.nonNull(profile_user_attributes.getUser_email()) && !"".equalsIgnoreCase(profile_user_attributes.getUser_email())){
            profile_of_user_DB.setUser_name(profile_user_attributes.getUser_name());
        }

        //user_lastName
        if(Objects.nonNull(profile_user_attributes.getUser_email()) && !"".equalsIgnoreCase(profile_user_attributes.getUser_email())){
            profile_of_user_DB.setUser_lastName(profile_user_attributes.getUser_lastName());
        }

        //user_home_address
        if(Objects.nonNull(profile_user_attributes.getUser_email()) && !"".equalsIgnoreCase(profile_user_attributes.getUser_email())){
            profile_of_user_DB.setUser_home_address(profile_user_attributes.getUser_home_address());
        }


        //user_home_address_state
        if(Objects.nonNull(profile_user_attributes.getUser_email()) && !"".equalsIgnoreCase(profile_user_attributes.getUser_email())){
            profile_of_user_DB.setUser_home_address_state(profile_user_attributes.getUser_home_address_state());
        }

        //user_home_address_zip_code
        if(Objects.nonNull(profile_user_attributes.getUser_email()) && !"".equalsIgnoreCase(profile_user_attributes.getUser_email())){
            profile_of_user_DB.setUser_home_address_zip_code(profile_user_attributes.getUser_home_address_zip_code());
        }


        return Profile_of_user_repository.save(profile_user_attributes);
    }


}
