package sports.api;

import sports.exceptions.InvalidUserNickException;
import sports.controllers.UserController;
import sports.wrappers.UserListWrapper;

public class UserResource {
	
	//GET /users
	public UserListWrapper userList(){
		return new UserController().userList();
	}
	
	//POST /users body="nick:email"
	public void createUser (String nick, String email) throws InvalidUserNickException{
		if (!new UserController().createUser(nick, email)) {
			throw new InvalidUserNickException("" + nick);
		}
	}
}
	
	