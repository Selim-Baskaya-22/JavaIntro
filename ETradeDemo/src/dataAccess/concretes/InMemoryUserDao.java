package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	List<User> users=new ArrayList<User>();
	public InMemoryUserDao() {
		System.out.println("---Kullan�c�lar---");
		User user1=new User(1, "Selim", "Ba�kaya", "selimbaskaya34@gmail.com", "123456");
		User user2=new User(2, "Engin", "Demirog", "engindemirog34@gmail.com", "123123");

		
		users.add(user1);
		users.add(user2);

	}
	@Override
	public void add(User user) {
		System.out.println("Kullan�c� Eklendi: "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� Silindi: "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� G�ncellendi: "+user.getFirstName()+" "+user.getLastName());		
	}

	@Override
	public User get(int id) {
		User user = users.stream()
				.filter(u -> u.getId() == id)
				.findFirst()
				.orElse(null);
		System.out.println("Kullan�c� ad�: "+user.getFirstName());
		return user;
	}
	@Override
	public User getEmail(String mail) {
		User user = users.stream()
				.filter(u -> u.geteMail() == mail)
				.findFirst()
				.orElse(null);
		
		return user;
	}
	@Override
	public List<User> getAll() {
		for (User user : users) {
			System.out.println(user.getFirstName());
		}
		System.out.println("----------------");
		return this.users;
	}

}
