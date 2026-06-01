package nh.com.org.ProjectDefense.Service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import nh.com.org.ProjectDefense.Model.JobSeekerProfile;
import nh.com.org.ProjectDefense.Repo.JobSeekerProfileRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	JobSeekerProfileRepository jobSeekerRepo;
	
	//static List<JobSeekerProfile> jobSeekerProfile = new ArrayList<JobSeekerProfile>();

	
	@Override
	public JobSeekerProfile update(JobSeekerProfile jsp) {
		
		return jobSeekerRepo.save(jsp);
	}

	@Override
	public JobSeekerProfile create(JobSeekerProfile jsp) {
	
		return jobSeekerRepo.save(jsp);
	}


	@Override
	public JobSeekerProfile getOne(int user_account_id) {
		
		return jobSeekerRepo.findById(user_account_id).get();
	}

	@Override
	public List<JobSeekerProfile> getAll() {
	
		return jobSeekerRepo.findAll();
	}

	@Override
	public void deleteOne(int user_account_id) {
		
		 jobSeekerRepo.deleteById(user_account_id);
		 
	}

	
	

}
