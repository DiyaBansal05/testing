package AccountsInfo.project.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.engine.internal.Cascade;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "accountDetails", uniqueConstraints = {@UniqueConstraint(columnNames = "accNo")})

public class BankAccount
{
    @Id
    @GeneratedValue
    Long acc_id;
   @Column(unique = true)
    private String accNo;
    private String acctype;
    private String bnkName;
   @ManyToOne(cascade=CascadeType.ALL)
   @JoinColumn(name="acc_fk" , referencedColumnName = "nom_id")
   private Nominee nominee;

}
