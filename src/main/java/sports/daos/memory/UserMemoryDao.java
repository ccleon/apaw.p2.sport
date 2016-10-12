package sports.daos.memory;

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
			if (user.getNick() == nick) {
				return user;
			}
		}
		return null;
	}

}
