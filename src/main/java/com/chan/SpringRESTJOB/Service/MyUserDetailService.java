package com.chan.SpringRESTJOB.Service;

import com.chan.SpringRESTJOB.Model.User;
import com.chan.SpringRESTJOB.Model.UserPrinciple;
import com.chan.SpringRESTJOB.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo;


    @Override
    public UserDetails loadUserByUsername(String sname) throws UsernameNotFoundException {
        System.out.println("Trying to find user: " + sname);
       User one = repo.findBysname(sname);
       if(one==null){
           System.out.println("User not found  404");
           throw  new UsernameNotFoundException("not found");
       }

        return new UserPrinciple(one);
    }


}
