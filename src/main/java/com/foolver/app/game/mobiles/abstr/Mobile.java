package com.foolver.app.game.mobiles.abstr;

import com.foolver.app.game.components.abstr.GameComponent;
import com.foolver.app.game.misc.*;

public interface Mobile extends GameComponent {

	void setPosition(Position position);

	void goToPosition(Position position);

	void setDirection(Direction direction);
}
