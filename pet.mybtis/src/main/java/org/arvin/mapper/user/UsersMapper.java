package org.arvin.mapper.user;


import org.arvin.model.user.Users;

import java.util.List;

/**
* @author yeling
* @description 针对表【users】的数据库操作Mapper
* @createDate 2024-03-17 23:23:03
* @Entity user.domain.Users
*/
public interface UsersMapper {
    List<Users> queryUsers();
}




