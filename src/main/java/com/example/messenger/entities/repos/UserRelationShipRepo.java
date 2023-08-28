package com.example.messenger.entities.repos;

import com.example.messenger.entities.UserRelationShip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRelationShipRepo extends JpaRepository<UserRelationShip,Integer> {
}
