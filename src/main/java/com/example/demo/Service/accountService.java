package com.example.demo.Service;


import com.example.demo.Entity.AccountsEntity;
import com.example.demo.Repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class accountService {

    private AccountRepository userRepository;

    public accountService(AccountRepository userRepository) {
        this.userRepository = userRepository;
    }

    public AccountsEntity login(String username, String password){
        return userRepository.findByUsernameAndPassword(username,password);
    }

}
