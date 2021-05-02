package Odev3;

public class Student extends User{
	private Course[] registeredCourses;
	private String completedRate;
	
	public Course[] getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(Course[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	public String getCompletedRate() {
		return "%"+completedRate;
	}
	public void setCompletedRate(String completedRate) {
		this.completedRate = completedRate;
	}
	
	
}
