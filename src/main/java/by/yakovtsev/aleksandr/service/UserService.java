package by.yakovtsev.aleksandr.service;

import by.yakovtsev.aleksandr.dao.UserDao;
import by.yakovtsev.aleksandr.dao.UserDaoImpl;
import by.yakovtsev.aleksandr.model.Auto;
import by.yakovtsev.aleksandr.model.User;

import java.util.List;

public class UserService {

    private UserDao userDao = new UserDaoImpl();

    public UserService(){}

    public User findUser(int id) {
        return userDao.findById(id);
    }

    public void saveUser(User user) {
        userDao.save(user);
    }

    public void deleteUser(User user) {
        userDao.delete(user);
    }

    public void updateUser(User user) {
        userDao.update(user);
    }

    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    public Auto findAutoById(int id) {
        return userDao.findAutoById(id);
    }
}
