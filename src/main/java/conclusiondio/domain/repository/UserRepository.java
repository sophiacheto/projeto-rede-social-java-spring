package conclusiondio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import conclusiondio.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {  

    boolean existsByUsername(String username);
}
