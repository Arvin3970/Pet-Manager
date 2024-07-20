package org.arvin.user;

import org.arvin.mapper.user.UsersMapper;
import org.arvin.model.user.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UsersMapper usersMapper;

    public List<Users> getUsersMapper() {
        return usersMapper.queryUsers();
    }
}
