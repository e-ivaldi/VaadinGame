package com.foolver.game.utils.mock;

import com.foolver.game.app.input.handlers.abstr.MouseHandler;
import com.foolver.game.utils.Position;

public class MockMouseHandler implements MouseHandler {

	@Override
	public Position getPosition() {
		return Position.getPositionZERO();
	}

	@Override
	public Position getRelativePosition() {
		return Position.getPositionZERO();
	}

}
