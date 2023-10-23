package conclusiondio.service;

import conclusiondio.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);
}
