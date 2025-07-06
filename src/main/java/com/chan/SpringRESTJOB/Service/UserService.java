package com.chan.SpringRESTJOB.Service;

import com.chan.SpringRESTJOB.Model.User;
import com.chan.SpringRESTJOB.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;
     private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public User register(User user) {
        user.setPass(encoder.encode(user.getPass()));
        System.out.println(user.getPass());
        return repo.save(user);
    }

    public List<User> getAllUsers() {
        return  repo.findAll();
    }
}
