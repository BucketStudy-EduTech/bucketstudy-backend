package com.BucketStudy.Service;

import com.BucketStudy.Model.Internship;
import com.BucketStudy.Repo.InternshipRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternshipService {

	@Autowired
    private  InternshipRepository internshipRepository;

    public InternshipService(InternshipRepository internshipRepository) {
        this.internshipRepository = internshipRepository;
    }

    public List<Internship> getAllInternships() {
        return internshipRepository.findAll();
    }

    public Optional<Internship> getInternshipById(String id) {
        return internshipRepository.findById(id);
    }

    public Internship createInternship(Internship internship) {
        return internshipRepository.save(internship);
    }

    public Internship updateInternship(String id, Internship updatedInternship) {
        return internshipRepository.findById(id)
                .map(existing -> {
                    existing.setTitle(updatedInternship.getTitle());
                    existing.setCompany(updatedInternship.getCompany());
                    existing.setDuration(updatedInternship.getDuration());
                    existing.setRequirements(updatedInternship.getRequirements());
                    existing.setApplicationDeadline(updatedInternship.getApplicationDeadline());
                    existing.setSelectedStudent(updatedInternship.getSelectedStudent());
                    existing.setStatus(updatedInternship.getStatus());
                    return internshipRepository.save(existing);
                })
                .orElseThrow(() -> new RuntimeException("Internship not found"));
    }

    public void deleteInternship(String id) {
        internshipRepository.deleteById(id);
    }

    // --- New Methods ---
    public List<Internship> getInternshipByTitle(String title) {
        return internshipRepository.findByTitleIgnoreCase(title);
    }

    public List<Internship> getInternshipByCompany(String company) {
        return internshipRepository.findByCompanyIgnoreCase(company);
    }


}

