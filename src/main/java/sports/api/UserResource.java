package sports.api;

import sports.controllers.UserController;
import sports.wrappers.UserListWrapper;

public class UserResource {
	
	//GET **/users
	public UserListWrapper userList(){
		return new UserController().userList();
	}
	
	//POST /users body="nick:email"
	public void createUser (String nick, String email) throws InvalidUserNickException{
		
	}
	
	
	//POST **/users/{nick}/sport body="sportName"
	/*public void createUser(String nick, String email) throws InvalidUserException{
		this.validateField(nick);
		new UserController().createUser(nick, email);
	}
	
	private void validateField(String field) throws InvalidUserException {
		if (field == null || field.isEmpty()) {
			throw new InvalidThemeFieldException(field);
		}*/
	}
	
	