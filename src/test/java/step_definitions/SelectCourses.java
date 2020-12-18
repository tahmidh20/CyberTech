package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.CyberTechHomepage;
import techBase.BaseClass;

public class SelectCourses extends BaseClass {
	CyberTechHomepage cb;
	
	public SelectCourses() {
		super();
		cb = new CyberTechHomepage(); 
		}
	
	@Given("user is in the Cyber Tech homepage")
	public void user_is_in_the_cyber_tech_homepage() {
		initialization();
	    
	}

	@When("user clicks on Select Courses")
	public void user_clicks_on_select_courses() {
		cb.clickSelectCourses();
	    
	}

	@Then("user clicks on first course in the Marketing Category")
	public void user_clicks_on_first_course_in_the_marketing_category() {
	    cb.NutritionClass_1();
	}

	@And("user provides name, email, phone number to join the demo class")
	public void user_provides_name_email_phone_number_to_join_the_demo_class() {
	   
		// course 1
		cb.nameTxtField(prop.getProperty("name"));
	    cb.emailTxtField(prop.getProperty("EmailAddress"));
	    cb.phoneTxtField(prop.getProperty("Phone"));
	    cb.JoinDemo();
	}
	    
	
	@Then("user continues to repeat the same steps for the rest of the courses in the Marketing Category")
	public void user_continues_to_repeat_the_same_steps_for_the_rest_of_the_courses_in_the_marketing_category() {
		
		// course 2
	    cb.clickSelectCourses();
	    cb.NutritionClass_2();
	    cb.nameTxtField(prop.getProperty("name"));
	    cb.emailTxtField(prop.getProperty("EmailAddress"));
	    cb.phoneTxtField(prop.getProperty("Phone"));
	    cb.JoinDemo();
	  
	    // course 3
	    cb.clickSelectCourses();
	    cb.PHPclass();
	    cb.nameTxtField(prop.getProperty("name"));
	    cb.emailTxtField(prop.getProperty("EmailAddress"));
	    cb.phoneTxtField(prop.getProperty("Phone"));
	    cb.JoinDemo();
	   
	    // course 4
	    cb.clickSelectCourses();
	    cb.WordPress();
	    cb.nameTxtField(prop.getProperty("name"));
	    cb.emailTxtField(prop.getProperty("EmailAddress"));
	    cb.phoneTxtField(prop.getProperty("Phone"));
	    cb.JoinDemo();
	
	}
	
	@Then("user closes browser")
	public void user_closes_browser() {
		
		tearDown();
	}
	
}
	






	
		
		
	  
	    
	


