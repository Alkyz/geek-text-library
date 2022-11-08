package software1.softwareengineering1.service;
import org.springframework.data.jpa.repository.Query;
import software1.softwareengineering1.entity.profile_of_user;

import java.util.List;
public interface profile_of_user_service {

//TAKE OUT {} INTERFACES HAVE NO BODIES.

    public profile_of_user update_profile_attributes(String user_id, profile_of_user profile_user_attributes);

    public void deleteProfileByUserEmailID(String User_ID);

    public profile_of_user Save_user_controller(profile_of_user profile_user);

    public List<profile_of_user> fetchingList();

    public profile_of_user fetchingListByID(String user_id);

}
