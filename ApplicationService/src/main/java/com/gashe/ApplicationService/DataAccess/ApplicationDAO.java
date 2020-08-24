package com.JSTS.ApplicationMicroservice.DataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.JSTS.ApplicationMicroservice.model.JobApplicationModel;

@Repository
public interface ApplicationDAO extends JpaRepository<JobApplicationModel , Integer>{
	
}
