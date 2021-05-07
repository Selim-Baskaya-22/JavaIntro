package business.abstracts;

import entities.concretes.User;

public interface AuthService {
	boolean validate(User user);
	boolean login(User user);
}
