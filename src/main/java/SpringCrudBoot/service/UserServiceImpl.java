package SpringCrudBoot.service;

import SpringCrudBoot.model.*;
import SpringCrudBoot.repository.*;
import java.util.List;
import java.util.Optional;
import javax.transaction.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;


@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User getUserByname(String username) {
        return userRepository.getByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

