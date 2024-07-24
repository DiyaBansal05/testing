package AccountsInfo.project.repositories;

import AccountsInfo.project.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepoAllUsers extends JpaRepository<Users,Long>
{
    public Optional<Users> findByEmail(String email) ;

}
