package sports;

import sports.api.*;
import sports.exceptions.*;
import web.http.*;

public class Dispatcher {
	private UserResource userResource = new UserResource();
	private SportResource sportResource = new SportResource();

	private void responseError(HttpResponse response, Exception e) {
		response.setBody("{\"error\":\"" + e + "\"}");
		response.setStatus(HttpStatus.BAD_REQUEST);
	}

	public void doGet(HttpRequest request, HttpResponse response) {
		// **/themes
		if ("users".equals(request.getPath())) {
			response.setBody(userResource.userList().toString());
			// **/themes/{id}/overage
		/*} else if ("themes".equals(request.paths()[0]) && "overage".equals(request.paths()[2])) {
			try {
				response.setBody(userResource.themeOverage(Integer.valueOf(request.paths()[1])).toString());
			} catch (Exception e) {
				responseError(response, e);
			}*/
			// **/sports
		} else if ("sports".equals(request.getPath())) {
			response.setBody(sportResource.sportsList().toString());
		} else {
			responseError(response, new InvalidRequestException(request.getPath()));
		}
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		// POST **/themes body="nick:email"
		case "users":
			String nick = request.getBody().split(":")[0];
			String email = request.getBody().split(":")[1];
			// Injectar parámetros...
			try {
				userResource.createUser(String.valueOf(nick), String.valueOf(email));
				response.setStatus(HttpStatus.CREATED);
			} catch (InvalidUserFieldException e) {
				this.responseError(response, e);
			}
			break;
		// POST sports body="name"
		case "sports":
			String themeId = request.getBody().split(":")[0];
			String vote = request.getBody().split(":")[1];
			try {
				sportResource.createVote(Integer.valueOf(themeId), Integer.valueOf(vote));
				response.setStatus(HttpStatus.CREATED);
			} catch (Exception e) {
				responseError(response, e);
			}
			break;
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

	public void doPut(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

	public void doDelete(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

}
