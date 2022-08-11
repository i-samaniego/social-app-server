package ServiceApp.Service;

import ServiceApp.Model.UserModel;
import ServiceApp.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    // TO GET ALL USERS
    public List<UserModel> getAllUsers(){
        return userRepo.findAllUsers();
    }
}
