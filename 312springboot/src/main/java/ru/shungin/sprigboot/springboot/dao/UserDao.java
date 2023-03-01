package ru.shungin.sprigboot.springboot.dao;



import ru.shungin.sprigboot.springboot.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    List <User> getAllUsers ();
    User update(int id, User user);
    void delete(int id);
    User getUserById (int id);
}
