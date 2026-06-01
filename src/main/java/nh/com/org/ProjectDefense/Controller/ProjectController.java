package nh.com.org.ProjectDefense.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import nh.com.org.ProjectDefense.Model.JobSeekerProfile;
import nh.com.org.ProjectDefense.Service.ProjectService;

@RestController
@RequestMapping("/backend/data")
public class ProjectController {

	@Autowired
	ProjectService projectService;
	
	//localhost:8080/backend/data/
		@GetMapping ("/")
		public List <JobSeekerProfile> getAllStudent() {
			return projectService.getAll();
		}
		
		//localhost:8080/backend/data/save
		@PostMapping ("/save")
		public JobSeekerProfile save(@RequestBody JobSeekerProfile jsp) {
			return projectService.create(jsp);
		}
		
		
		//localhost:8080/backend/data/update/6
		@PutMapping ("/update/{id}")
		public JobSeekerProfile update(@PathVariable int id, @RequestBody JobSeekerProfile jsp) {
			jsp.setId(id);
			return projectService.update(jsp);
		}
		
		
		//localhost:8080/backend/data/getOne/6
		@GetMapping ("/getOne/{id}")
		public JobSeekerProfile getOne(@PathVariable int id) {
			return projectService.getOne(id);
		}
		
		
		//localhost:8080/backend/data/delete/5
		@DeleteMapping("/delete/{id}")
		public void delete(@PathVariable int id) {
			projectService.deleteOne(id);
			 System.out.println("This profile has been deleted successfully");
			 
			 return;
			
		}
	
	
}
