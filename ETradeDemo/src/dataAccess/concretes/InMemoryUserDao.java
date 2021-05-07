package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	List<User> users=new ArrayList<User>();

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
		for (User user:this.users) {
			if (user.getId()==id) {
				System.out.println("Kullan�c�: "+user.getFirstName()+" "+user.getLastName());
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

}
