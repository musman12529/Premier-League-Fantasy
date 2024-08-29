package com.example.demo.player;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;




@Repository
public interface playerRepository extends JpaRepository<player, String> {
    

}
