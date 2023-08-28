package com.example.messenger.entities.repos;

import com.example.messenger.entities.WorkSpace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkSpaceRepo extends JpaRepository<WorkSpace,Integer> {
}
