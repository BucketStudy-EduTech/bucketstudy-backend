package com.BucketStudy.Service;

import com.BucketStudy.Model.Challenge;
import com.BucketStudy.Repo.ChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChallengeService {

    @Autowired
    private ChallengeRepository challengeRepository;

    public List<Challenge> getAllChallenges() {
        return challengeRepository.findAll();
    }

    public Optional<Challenge> getChallengeById(String id) {
        return challengeRepository.findById(id);
    }

    public Challenge createChallenge(Challenge challenge) {
        return challengeRepository.save(challenge);
    }

    public Challenge updateChallenge(String id, Challenge updatedChallenge) {
        return challengeRepository.findById(id).map(challenge -> {
            challenge.setTitle(updatedChallenge.getTitle());
            challenge.setDescription(updatedChallenge.getDescription());
            challenge.setPrizePool(updatedChallenge.getPrizePool());
            challenge.setRegistrationFee(updatedChallenge.getRegistrationFee());
            challenge.setTeamSize(updatedChallenge.getTeamSize());
            challenge.setStartDate(updatedChallenge.getStartDate());
            challenge.setEndDate(updatedChallenge.getEndDate());
            return challengeRepository.save(challenge);
        }).orElseThrow(() -> new RuntimeException("Challenge not found with id: " + id));
    }

    public void deleteChallenge(String id) {
        challengeRepository.deleteById(id);
    }
}

