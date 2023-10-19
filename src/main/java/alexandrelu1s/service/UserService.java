package alexandrelu1s.service;

import alexandrelu1s.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
