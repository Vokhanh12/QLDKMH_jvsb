package com.example.demo.Repository;

import com.example.demo.Entity.AccountsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountsEntity,Long> {

    AccountsEntity findByUsernameAndPassword(String username, String password);

}
