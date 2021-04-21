package DAO;

import models.Auto;
import models.Users;
import org.hibernate.Session;
import org.hibernate.Transaction;
import untils.HibernateSessionFactory;

import java.util.List;

public class UserDao {
    public Users findById(int id){
        return HibernateSessionFactory.getSessionFactory().openSession().get(Users.class,id);
    }

    public void save(Users users){
        Session session=HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.save(users);
        transaction.commit();
        session.close();
    }
    public void update(Users users){
        Session session=HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction=session.beginTransaction();
        session.update(users);
        transaction.commit();
        session.close();
    }
    public void delete(Users users){
        Session session=HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction= session.beginTransaction();
        session.delete(users);
        transaction.commit();
        session.close();
    }
    public Auto findAutoById(int id){
        return HibernateSessionFactory.getSessionFactory().openSession().get(Auto.class,id);
    }
    public List<Users> findAll(){
        List<Users> usersList=(List<Users>) HibernateSessionFactory.getSessionFactory().openSession().createQuery("from Users ").list();
        return usersList;
    }


}
