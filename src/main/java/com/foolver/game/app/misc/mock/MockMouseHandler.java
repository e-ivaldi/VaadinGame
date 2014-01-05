package com.foolver.game.app.misc.mock;

import com.foolver.game.app.input.handlers.abstr.MouseHandler;
import com.foolver.game.app.misc.Position;

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
