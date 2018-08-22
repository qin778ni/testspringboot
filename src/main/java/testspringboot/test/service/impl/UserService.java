package testspringboot.test.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import testspringboot.test.dao.IUserDao;
import testspringboot.test.service.IUserService;

/**
 * @author:ms.y
 * @create 2018/7/30-11:13
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public boolean findUserById(String id){
       return userDao.findUserById(id)==null?false:true;
    }


}
