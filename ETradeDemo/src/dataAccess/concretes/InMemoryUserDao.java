package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	List<User> users=new ArrayList<User>();

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı Eklendi: "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanıcı Silindi: "+user.getFirstName()+" "+user.getLastName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanıcı Güncellendi: "+user.getFirstName()+" "+user.getLastName());		
	}

	@Override
	public User get(int id) {
		for (User user:this.users) {
			if (user.getId()==id) {
				System.out.println("Kullanıcı: "+user.getFirstName()+" "+user.getLastName());
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
