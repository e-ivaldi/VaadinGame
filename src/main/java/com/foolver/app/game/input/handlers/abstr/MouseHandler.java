package com.foolver.app.game.input.handlers.abstr;

import com.foolver.app.game.misc.Position;

public interface MouseHandler {

	Position getPosition();

	Position getRelativePosition();

	Position getRelativePositionInTiles();
}
