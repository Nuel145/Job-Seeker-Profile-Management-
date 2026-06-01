package nh.com.org.ProjectDefense.Service;

import java.util.List;

import nh.com.org.ProjectDefense.Model.JobSeekerProfile;

public interface ProjectService {

JobSeekerProfile create (JobSeekerProfile jsp);

JobSeekerProfile update (JobSeekerProfile jsp);

JobSeekerProfile getOne(int user_account_id);
	
List<JobSeekerProfile> getAll();
	
void deleteOne (int id);
}
