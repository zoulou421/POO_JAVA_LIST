package implementation;

import java.util.ArrayList;
import java.util.List;

import entities.User;

public class TestApp {

	public static void main(String[] args) {
		IUser iUser=new UserImpl();
		
		List<User>myList=new ArrayList<>();
		
		
		User u=new User();
		u.setAge(10);
		u.setName("Mamadou");
		
		u.setAge(12);
		u.setName("Binta");
		
		myList.add(u);
		iUser.addUserInList(myList);
		
		
	}

}
