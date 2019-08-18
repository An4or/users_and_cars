package by.yakovtsev.aleksandr.dao;

import by.yakovtsev.aleksandr.model.Auto;
import by.yakovtsev.aleksandr.model.User;
import by.yakovtsev.aleksandr.util.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UserDaoImpl implements UserDao {
    public User findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(User.class, id);
    }

    public void save(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(user);
        tx1.commit();
        session.close();
    }

    public void update(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(user);
        tx1.commit();
        session.close();
    }

    public void delete(User user) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(user);
        tx1.commit();
        session.close();
    }

    public Auto findAutoById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Auto.class, id);
    }

    public List<User> findAll() {
        List<User> users = (List<User>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From User").list();
        return users;
    }

//    public User findById(int id) {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        User user = session.get(User.class, id);
//        session.close();
//        return user;
//    }
//
//    public void save(User user) {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        session.save(user);
//        transaction.commit();
//        session.close();
//    }
//
//    public void update(User user) {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        session.update(user);
//        transaction.commit();
//        session.close();
//    }
//
//    public void delete(User user) {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Transaction transaction = session.beginTransaction();
//        session.delete(user);
//        transaction.commit();
//        session.close();
//    }
//
//    public Auto findAutoById(int id) {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//        Auto auto = session.get(Auto.class, id);
//        session.close();
//        return auto;
//    }
//
//    public List<User> findAll() {
//        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
//
//        List<User> users = (List<User>) session.createQuery("From User").list();
//
//        session.close();
//        return users;
//    }
}
