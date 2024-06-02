package com.nagp.votingservice.controller;

import com.nagp.votingservice.model.dto.CastVote;
import com.nagp.votingservice.model.dto.VotingStatus;
import com.nagp.votingservice.service.VotingServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
@Controller
@RequestMapping("/vote")
public class VotingController {

    @Autowired
    VotingServices votingServices;

    @GetMapping
    public String getVotingStatus(Model model){
        VotingStatus votingStatus = votingServices.getVotingStatus();
        model.addAttribute("data", votingStatus);
        return "voteResult";
    }

    @GetMapping("/cast")
    public String getVotingPage(Model model) {
        return "castVote";
    }

    @PostMapping
    public String castVote(@RequestBody CastVote castvote, Model model){
        votingServices.castVote(castvote);
        return "castVote";
    }
}
