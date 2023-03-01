package ru.shungin.sprigboot.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.shungin.sprigboot.springboot.dao.UserDao;
import ru.shungin.sprigboot.springboot.model.User;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    UserServiceImp (UserDao userDaoImp) {
        this.userDaoImp = userDaoImp;
    }

   private UserDao userDaoImp;

    @Override
    @Transactional
    public void add(User user) {
        userDaoImp.add(user);
    }

    @Override
    public List<User> getAllUsers() {

        return userDaoImp.getAllUsers();
    }

    @Override
    @Transactional
    public User update(int id, User user) {
        return userDaoImp.update(id, user);
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(int id) {
        return userDaoImp.getUserById(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
       userDaoImp.delete(id);
    }

}
