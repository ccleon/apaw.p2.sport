package sports.daos;

import sports.entities.Sport;

public interface SportDao extends GenericDao<Sport, Integer>{
	Sport findSportByName(String sport);
}
