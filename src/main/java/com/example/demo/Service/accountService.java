package com.example.demo.Service;


import com.example.demo.Entity.accounts;
import com.example.demo.Repository.accountRepository;
import org.springframework.stereotype.Service;

@Service
public class accountService {

    private accountRepository userRepository;

    public accountService(accountRepository userRepository) {
        this.userRepository = userRepository;
    }

    public accounts login(String username, String password){
        return userRepository.findByUsernameAndPassword(username,password);
    }

}
