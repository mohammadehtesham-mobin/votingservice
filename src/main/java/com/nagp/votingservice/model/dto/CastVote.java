package com.nagp.votingservice.model.dto;

import com.nagp.votingservice.model.enums.VotingParticipants;
import lombok.Data;

@Data
public class CastVote {
    VotingParticipants votingParticipants;
}
