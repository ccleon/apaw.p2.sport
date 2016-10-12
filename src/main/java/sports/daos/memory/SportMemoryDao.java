package sports.daos.memory;

import java.util.HashMap;
import java.util.List;

import sports.entities.Sport;
import sports.daos.SportDao;

public class SportMemoryDao extends GenericMemoryDao<Sport> implements SportDao{
	
	public SportMemoryDao() {
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
	public Sport findSportByName(String name) {
		List<Sport> sports = this.findAll();
		for (Sport sport : sports) {
			if (sport.getName().equals(name)) {
				return sport;
			}
		}
		return null;
	}

}
