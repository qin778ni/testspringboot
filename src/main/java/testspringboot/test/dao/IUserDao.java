package testspringboot.test.dao;

import testspringboot.test.domain.User;

/**
 * @author:ms.y
 * @create 2018/7/30-11:13
 */
public interface IUserDao {

    User findUserById(String id);
}
