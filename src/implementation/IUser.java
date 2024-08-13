package implementation;

import java.util.List;

import entities.User;

public interface IUser {

	
	public void addUserInList(List<User>myListUsers);
	public User inPutUser();
	public User findUserByUserName(String name);
	public User findUserById(int age);
	public void findUser();
}
