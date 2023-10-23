package conclusiondio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import conclusiondio.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>  {  
}
