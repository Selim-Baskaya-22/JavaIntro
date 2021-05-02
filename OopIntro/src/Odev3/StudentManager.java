package Odev3;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		super.add(user);
		System.out.println("Öğrenci Eklendi");
	}

	public void registerStudent(Student student, Course course) {
		System.out.println(student.getFirstName() + " Adlı öğrenci " + course.getCourseName() + " kursuna kayıt oldu!");
	}

	public void registerDelete(Student student, Course course) {
		System.out.println(student.getFirstName() + " Adlı öğrenci " + course.getCourseName() + " kursundan silindi!");
	}
}
