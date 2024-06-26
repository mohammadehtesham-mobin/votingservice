package com.nagp.votingservice.model.entity;

import com.nagp.votingservice.model.enums.VotingParticipants;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vote {
    @Id
    @Enumerated(EnumType.STRING)
    private VotingParticipants id;
    private int count;
}
