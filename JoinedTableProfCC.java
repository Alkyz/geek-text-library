package software1.softwareengineering1.dataTransferObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import software1.softwareengineering1.entity.profile_of_user;


@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString
public class JoinedTableProfCC {

    private profile_of_user user_credit_card;

}
