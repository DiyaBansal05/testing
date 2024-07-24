package AccountsInfo.project.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Nominee {
    @Id
    @GeneratedValue
    @Column(name="nom_id")
    Long nominee_id;
    String name;
    Date dob;
    String email;
    String mobile;
    @OneToMany(cascade= CascadeType.ALL)
    List<BankAccount> acc;

}
