package SpringCrudBoot.service;

import SpringCrudBoot.model.*;
import java.util.*;


public interface RoleService {

    void addRole(Role role);

    void updateRole(Role role);

    void deleteRoleById(Long id);

    List<Role> getAllRoles();

    Role getRoleByRole(String role);
}
