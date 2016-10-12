package sports.daos.memory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sports.daos.UserDao;
import sports.daos.SportDao;

public class SportMemoryDao extends GenericMemoryDao<Sport> implements UserDao{
	
	public SportDaoMemory() {
		this.setMap(new HashMap<Integer,Sport>());
	}

	@Override
	protected Integer getId(Sport entity) {
		return entity.getId();
	}

	@Override
	protected void setId(Sport entity, Integer id) {
		entity.setId(id);
	}

	@Override
	public List<Integer> findValueBySportId(int sportId) {
		List<Sport> sports = this.findAll();
		List<Integer> sportsValue = new ArrayList<>();
		for (Sport sport : sports) {
			if (sport.getTheme().getId() == sportId) {
				sportssValue.add(sport.getValue());
			}
		}
		return sportValue;
	}

}
