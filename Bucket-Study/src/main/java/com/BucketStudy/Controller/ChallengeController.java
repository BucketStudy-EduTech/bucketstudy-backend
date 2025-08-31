package com.BucketStudy.Controller;

import com.BucketStudy.Model.Challenge;
import com.BucketStudy.Service.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/challenges")
public class ChallengeController {

    @Autowired
    private ChallengeService challengeService;

    @GetMapping("/getAllChallenges")
    public ResponseEntity<List<Challenge>> getAllChallenges() {
        return ResponseEntity.ok(challengeService.getAllChallenges());
    }

    @GetMapping("/getChallengeById/{id}")
    public ResponseEntity<Challenge> getChallengeById(@PathVariable String id) {
        return challengeService.getChallengeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/CreateChallenge")
    public ResponseEntity<Challenge> createChallenge(@RequestBody Challenge challenge) {
        return ResponseEntity.ok(challengeService.createChallenge(challenge));
    }

    @PutMapping("/updateChallenge/{id}")
    public ResponseEntity<Challenge> updateChallenge(@PathVariable String id, @RequestBody Challenge challenge) {
        return ResponseEntity.ok(challengeService.updateChallenge(id, challenge));
    }

    @DeleteMapping("/deleteChallenge/{id}")
    public ResponseEntity<Void> deleteChallenge(@PathVariable String id) {
        challengeService.deleteChallenge(id);
        return ResponseEntity.noContent().build();
    }
}

