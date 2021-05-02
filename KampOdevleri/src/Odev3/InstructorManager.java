package Odev3;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		super.add(user);
		System.out.println("��retmen Eklendi!");
	}

	public void addCourse(Instructor instructor, Course course) {
		System.out.println(instructor.getFirstName() + " adl� e�itmen " + course.getCourseName() + " kursunu veriyor!");
	}

	public void addMultipleCourse(Instructor instructor, Course[] courses) {
		for (Course course : courses) {
			addCourse(instructor, course);
		}
	}

	public void deleteCourse(Instructor instructor, Course course) {
		System.out.println(
				instructor.getFirstName() + " adl� e�itmen " + course.getCourseName() + " kursunu iptal etti!");
	}
}
