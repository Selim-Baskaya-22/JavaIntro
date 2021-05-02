package Odev3;

public class Main {

	public static void main(String[] args) {
		Course course=new Course();
		course.setId(1);
		course.setCourseName("Backend Yazılım");
		
		Course course2=new Course();
		course2.setId(2);
		course2.setCourseName("Frontend Yazılım");
		
		Course[] courses= {course,course2};
		
		User user=new User();
		user.setId(1);
		user.setFirstName("Selim");
		user.setLastName("Başkaya");
		user.setAge(20);
		
		User user2=new User();
		user2.setId(2);
		user2.setFirstName("Engin");
		user2.setLastName("Demiroğ");
		user2.setAge(35);
		
		
		Student student=new Student();
		student.setId(1);
		student.setFirstName("Selim");
		student.setLastName("Başkaya");
		student.setAge(20);
		student.setGender("Erkek");
		student.setRegisteredCourses(courses);
		student.setCompletedRate("89.50");
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setAge(20);
		instructor.setGender("Erkek");
		instructor.setBiography(null);
		instructor.setCertificates("ITIL");
		
		UserManager userManager=new UserManager();
		userManager.add(student);
		userManager.add(instructor);
		System.out.println("-----------------");
		StudentManager studentManager=new StudentManager();
		studentManager.add(user);
		studentManager.registerStudent(student, course);
		System.out.println("-----------------");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(user2);
		instructorManager.addMultipleCourse(instructor, courses);
		
		
		
	}

}
