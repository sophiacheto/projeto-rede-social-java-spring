package conclusiondio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import conclusiondio.domain.model.User;
import conclusiondio.domain.repository.UserRepository;
import conclusiondio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userToCreate != null && userRepository.existsById(userToCreate.getId())) {
            throw new IllegalArgumentException("Already exists.");
        }
        return userRepository.save(userToCreate);
    }
}