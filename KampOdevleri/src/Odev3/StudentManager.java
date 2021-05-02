package Odev3;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		super.add(user);
		System.out.println("��renci Eklendi");
	}

	public void registerStudent(Student student, Course course) {
		System.out.println(student.getFirstName() + " Adl� ��renci " + course.getCourseName() + " kursuna kay�t oldu!");
	}

	public void registerDelete(Student student, Course course) {
		System.out.println(student.getFirstName() + " Adl� ��renci " + course.getCourseName() + " kursundan silindi!");
	}
}
