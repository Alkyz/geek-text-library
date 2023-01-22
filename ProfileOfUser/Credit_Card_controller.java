package software1.softwareengineering1.controller;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;
        import software1.softwareengineering1.dto.JoinedTableProfCC;
        import software1.softwareengineering1.entity.profile_of_user;
        import software1.softwareengineering1.entity.profile_of_user_credit_card;
        import software1.softwareengineering1.repository.Credit_Card_repository;
        import software1.softwareengineering1.repository.profile_of_user_repository;

        import java.util.List;

@RestController
public class Credit_Card_controller {

//    @Autowired
//    private profile_of_user_repository profile_of_user_repository;
//
//    @Autowired
//    private Credit_Card_repository Credit_Card_repository;
//
//   @GetMapping("/get_CC")
//    public List<profile_of_user_credit_card> get_Credit_Card_attributes() {
//
//        return Credit_Card_repository.findAll();
//    }
//
//    @PostMapping("/CC_create")
//    public profile_of_user profile_of_user(@RequestBody JoinedTableProfCC joinedTableProfCC){
//       return profile_of_user_repository.save(joinedTableProfCC.getProfile_of_user());
//    }


}
