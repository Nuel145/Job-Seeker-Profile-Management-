package nh.com.org.ProjectDefense.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "job_seeker_profile")
public class JobSeekerProfile {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name= "user_account_id")
	private int  user_account_id;
	
	@Column(name="employment_type")
	private String employment_type;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;
	
	public JobSeekerProfile () {}
	
	public JobSeekerProfile(int id, String employment_type, String first_name, String last_name, String email,
			String phone, String city, String state, String country) {
		super();
		this.user_account_id = id;
		this.employment_type = employment_type;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getId() {
		return user_account_id;
	}

	public void setId(int id) {
		this.user_account_id = id;
	}

	public String getEmployment_type() {
		return employment_type;
	}

	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "JobSeekerProfile [user_account_id=" + user_account_id + ", employment_type=" + employment_type + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", email=" + email + ", phone=" + phone + ", city=" + city + ", state="
				+ state + ", country=" + country + "]";
	}

	
	}
	

	
	

