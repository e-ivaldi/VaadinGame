package com.foolver.app.game.misc.mock;

import com.foolver.app.game.input.handlers.abstr.MouseHandler;
import com.foolver.app.game.misc.Position;

public class MockMouseHandler implements MouseHandler {

	@Override
	public Position getPosition() {
		return Position.getPositionZERO();
	}

	@Override
	public Position getRelativePosition() {
		return Position.getPositionZERO();
	}

	@Override
	public Position getRelativePositionInTiles() {
		return Position.getPositionZERO();
	}

}
