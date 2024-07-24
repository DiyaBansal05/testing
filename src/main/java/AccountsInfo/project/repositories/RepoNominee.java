package AccountsInfo.project.repositories;

import AccountsInfo.project.models.Nominee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoNominee extends JpaRepository<Nominee,Long>
{
}
