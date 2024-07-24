package AccountsInfo.project.repositories;

import AccountsInfo.project.models.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoAccounts extends JpaRepository<BankAccount,Long>
{
}
