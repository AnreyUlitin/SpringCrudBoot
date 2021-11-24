package SpringCrudBoot.repository;


import SpringCrudBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User getByUsername(String username);
}
