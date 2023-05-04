package com.example.demo.Repository;

import com.example.demo.Entity.accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accountRepository extends JpaRepository<accounts,Long> {

    accounts findByUsernameAndPassword(String username, String password);

}
