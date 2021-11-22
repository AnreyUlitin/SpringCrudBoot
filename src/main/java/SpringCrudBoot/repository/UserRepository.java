package SpringCrudBoot.repository;


import SpringCrudBoot.model.*;
import org.springframework.data.jpa.repository.*;

public interface UserRepository extends JpaRepository<User, Long> {
    User getByUsername(String username);
}
