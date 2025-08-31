package com.BucketStudy.Repository;

import com.BucketStudy.Model.Internship;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternshipRepository extends MongoRepository<Internship, String> {

    // Find by exact title
    List<Internship> findByTitleIgnoreCase(String title);

    // Find by exact company name
    List<Internship> findByCompanyIgnoreCase(String company);

}

