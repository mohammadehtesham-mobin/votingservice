package com.nagp.votingservice.controller;

import com.nagp.votingservice.model.dto.CastVote;
import com.nagp.votingservice.model.dto.VotingStatus;
import com.nagp.votingservice.service.VotingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vote")
public class VotingController {

    @Autowired
    VotingServices votingServices;

    @GetMapping
    public VotingStatus getVotingStatus(){
        return votingServices.getVotingStatus();
    }

    @PostMapping
    public String castVote(@RequestBody CastVote castvote){
        return votingServices.castVote(castvote);
    }
}
