package Odev3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " adlý kullanýcý baþarýyla eklendi!");
	}

	public void addMultiple(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " adlý kulllanýcý silindi!");
	}

	public void deleteMultiple(User[] users) {
		for (User user : users) {
			delete(user);
		}
	}
}
