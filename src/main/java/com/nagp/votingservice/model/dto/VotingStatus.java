package com.nagp.votingservice.model.dto;

import lombok.Data;

@Data
public class VotingStatus {
    private int aws;
    private int gcp;
    private int azure;
    private int oc;
}
