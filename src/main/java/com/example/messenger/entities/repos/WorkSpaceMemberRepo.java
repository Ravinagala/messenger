package com.example.messenger.entities.repos;


import com.example.messenger.entities.WorkSpaceMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkSpaceMemberRepo extends JpaRepository<WorkSpaceMember,Integer> {
}
