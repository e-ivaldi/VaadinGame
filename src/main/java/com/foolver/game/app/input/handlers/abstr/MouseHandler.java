package com.foolver.game.app.input.handlers.abstr;

import com.foolver.game.utils.Position;

public interface MouseHandler {

	Position getPosition();

	Position getRelativePosition();

	Position getRelativePositionInTiles();
}
