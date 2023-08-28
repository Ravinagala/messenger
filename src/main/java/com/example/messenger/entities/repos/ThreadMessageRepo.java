package com.example.messenger.entities.repos;

import com.example.messenger.entities.ThreadMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThreadMessageRepo extends JpaRepository<ThreadMessage,Integer> {

}
