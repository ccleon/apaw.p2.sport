package sports.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sports.daos.UserDao;
import sports.entities.User;

public class UserMemoryDao extends GenericMemeoryDao<User> implements UserDao{
	public UserDaoMemory() {
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
	public List<Integer> findValueByThemeId(int themeId) {
		List<Vote> votes = this.findAll();
		List<Integer> votesValue = new ArrayList<>();
		for (Vote vote : votes) {
			if (vote.getTheme().getId() == themeId) {
				votesValue.add(vote.getValue());
			}
		}
		return votesValue;
	}

}
