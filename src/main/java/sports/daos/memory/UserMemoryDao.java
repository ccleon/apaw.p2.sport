package sports.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sports.daos.UserDao;
import sports.entities.User;

public class UserMemoryDao extends GenericMemoryDao<User> implements UserDao{
	
	public UserMemoryDao() {
		this.setMap(new HashMap<Integer,User>());
	}

	@Override
	protected Integer getId(User entity) {
		return entity.getId();
	}

	@Override
	protected void setId(User entity, Integer id) {
		entity.setId(id);
	}

	@Override
	public User findUserByNick(String nick) {
		List<User> users = this.findAll();
		for (User user : users) {
			if (user.getNick().equals(nick)) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> findUsersBySport(String sportName) {
		List<User> users = this.findAll();
		List<User> foundUsers = new ArrayList<>();
		for (User user : users){
			if (user.getSport().toString().contains(sportName)){
				foundUsers.add(user);
			}
		}
		return foundUsers;
	}

}
