package com.foolver.game.app.input.handlers.abstr;

import com.foolver.game.app.misc.Position;

public interface MouseHandler {

	Position getPosition();

	Position getRelativePosition();

	Position getRelativePositionInTiles();
}
