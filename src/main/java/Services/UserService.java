package Services;

import DAO.UserDao;
import models.Auto;
import models.Users;

import java.util.List;

public class UserService {
    private UserDao userDao=new UserDao();

    public UserService(){
    }

    public Users findUSers(int id){
        return userDao.findById(id);
    }
    public void saveUsers(Users users){
        userDao.save(users);
    }
    public void update(Users users){
        userDao.update(users);
    }
    public void delete(Users users){
        userDao.delete(users);
    }
    public Auto findAutoById(int id){
        return userDao.findAutoById(id);
    }
    public List<Users> findAllUsers(){
        return userDao.findAll();
    }

}
