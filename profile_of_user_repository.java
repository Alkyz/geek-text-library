package software1.softwareengineering1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import software1.softwareengineering1.entity.profile_of_user;

import java.util.List;

@Repository
public interface profile_of_user_repository extends JpaRepository<profile_of_user, String> {
      /* @Query(value = "SELECT new software1.softwareengineering1.entity.Credit_Card(CC.user_card_type, CC.user_credit_card_number, " +
    "CC.user_name_of_credit_card, CC.user_csv_code, CC.user_credit_card_expiration_date_month, " +
    "CC.user_credit_card_expiration_date_year,CCA.user_email_fk) FROM "
     + "profile_of_user CC JOIN CC.Credit_Card CCA WHERE CC.user_email_fk = :CCAID")

      public Credit_Card getJoinData(@Param("CCAID") String CCAID);
*/

 @Query(value = "SELECT s "
     + "FROM profile_of_user s WHERE s.UserName = ?1")
    public profile_of_user findByUserName(String UserName);

}
