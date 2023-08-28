package com.example.messenger.entities.repos;

import com.example.messenger.entities.Thread;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadRepo extends JpaRepository<Thread,Integer> {
}
