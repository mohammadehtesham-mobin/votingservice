package com.nagp.votingservice.service;

import com.nagp.votingservice.model.dto.CastVote;
import com.nagp.votingservice.model.dto.VotingStatus;
import org.springframework.stereotype.Service;

@Service
public interface VotingServices {
    VotingStatus getVotingStatus();

    String castVote(CastVote castvote);
}
