package com.foolver.game.app.misc.mock;

import com.foolver.game.remote.RemoteService;

public class RemoteServiceMock implements RemoteService {

	@Override
	public boolean login(String username, String password) {
		return (username.equals("emanuele") && password.equals("emanuele"));
	}

}
