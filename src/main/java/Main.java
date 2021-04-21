import Services.UserService;
import models.Auto;
import models.Users;

public class Main {
    public static void main(String[] args) {
        try {
            UserService userService=new UserService();
            Users users=new Users("Nikita",18);
            userService.saveUsers(users);
            Auto auto=new Auto("Ferrari");
            users.addAuto(auto);
            auto.setUsers(users);
            userService.update(users);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
