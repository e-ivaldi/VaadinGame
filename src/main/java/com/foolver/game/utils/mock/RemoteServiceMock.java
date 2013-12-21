package com.foolver.game.utils.mock;

import com.foolver.game.remote.RemoteService;

public class RemoteServiceMock implements RemoteService {

	@Override
	public boolean login(String username, String password) {
		return (username.equals("emanuele") && password.equals("emanuele"));
	}

}
