package SpringCrudBoot.repository;


import SpringCrudBoot.model.*;
import org.springframework.data.jpa.repository.*;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role getRoleByRole(String role);
}



//List<User> findAll();
//
//    List<User> findAll(User user);
//
//    List<User> findAllById(Iterable<ID> ids);
//
//    <S extends T> List<S> saveAll(Iterable<S> entities);
//
