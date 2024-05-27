package com.nagp.votingservice.service;

import com.nagp.votingservice.dao.VoteRepo;
import com.nagp.votingservice.model.dto.CastVote;
import com.nagp.votingservice.model.dto.VotingStatus;
import com.nagp.votingservice.model.entity.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VotingServicesImpl implements VotingServices{

    @Autowired
    VoteRepo voteRepo;
    @Override
    public String castVote(CastVote castvote) {
        Optional<Vote> voteOptional = voteRepo.findById(castvote.getVotingParticipants());

        Vote vote=null;
        if(voteOptional.isPresent()) {
            vote = voteOptional.get();
            vote.setCount(vote.getCount() + 1);
        }
        else {
            vote = new Vote(castvote.getVotingParticipants(), 1);
        }

        voteRepo.save(vote);

        return "Voting Submitted";
    }

    @Override
    public VotingStatus getVotingStatus() {

        List<Vote> voteList = voteRepo.findAll();
        VotingStatus voteStatus =  new VotingStatus();
        for(Vote vote:voteList) {
            switch (vote.getId()){
                case AWS -> voteStatus.setAws(vote.getCount());
                case GCP -> voteStatus.setGcp(vote.getCount());
                case OC -> voteStatus.setOc(vote.getCount());
                case AZURE -> voteStatus.setAzure(vote.getCount());
            }
        }
        return voteStatus;
    }


}
