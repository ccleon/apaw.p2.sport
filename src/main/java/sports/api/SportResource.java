package sports.api;

import sports.controllers.SportController;
import sports.exceptions.InvalidSportException;

public class SportResource {

	//POST /sports	body="name"
	public void createSport(String name) throws InvalidSportException{
		if (!new SportController().createSport(name)) {
			throw new InvalidSportException("" + name);
		}
		
		
	}

}
