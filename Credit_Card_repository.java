package software1.softwareengineering1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import software1.softwareengineering1.entity.profile_of_user_credit_card;

@Repository
public interface Credit_Card_repository extends JpaRepository<profile_of_user_credit_card, String> {
}
