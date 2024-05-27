package com.nagp.votingservice.dao;


import com.nagp.votingservice.model.entity.Vote;
import com.nagp.votingservice.model.enums.VotingParticipants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepo extends JpaRepository<Vote, VotingParticipants> {
}
