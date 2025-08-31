package com.BucketStudy.Controller;

import com.BucketStudy.Model.Internship;
import com.BucketStudy.Service.InternshipService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/internships")
public class InternshipController {

    private final InternshipService internshipService;

    public InternshipController(InternshipService internshipService) {
        this.internshipService = internshipService;
    }

    @GetMapping("/getAllinternships")
    public ResponseEntity<List<Internship>> getAllInternships() {
        return ResponseEntity.ok(internshipService.getAllInternships());
    }

    @GetMapping("/getInternshipById/{id}")
    public ResponseEntity<Internship> getInternshipById(@PathVariable String id) {
        return internshipService.getInternshipById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/createInternship")
    public ResponseEntity<Internship> createInternship(@RequestBody Internship internship) {
        return ResponseEntity.ok(internshipService.createInternship(internship));
    }

    @PutMapping("/updateInternship/{id}")
    public ResponseEntity<Internship> updateInternship(@PathVariable String id, @RequestBody Internship internship) {
        return ResponseEntity.ok(internshipService.updateInternship(id, internship));
    }

    @DeleteMapping("/deleteInternship/{id}")
    public ResponseEntity<Void> deleteInternship(@PathVariable String id) {
        internshipService.deleteInternship(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/title/{title}")
    public ResponseEntity<List<Internship>> getByTitle(@PathVariable String title) {
        return ResponseEntity.ok(internshipService.getInternshipByTitle(title));
    }

    @GetMapping("/company/{company}")
    public ResponseEntity<List<Internship>> getByCompany(@PathVariable String company) {
        return ResponseEntity.ok(internshipService.getInternshipByCompany(company));
    }

   
}

