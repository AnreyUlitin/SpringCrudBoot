package SpringCrudBoot.service;

import SpringCrudBoot.model.*;
import java.util.*;


public interface UserService {

    void addUser(User user);

    void updateUser(User user);

    void deleteUserById(Long id);

    Optional<User> getUserById(Long id);

    User getUserByname(String username);

    List<User> getAllUsers();
}