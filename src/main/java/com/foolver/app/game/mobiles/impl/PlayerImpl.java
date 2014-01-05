package com.foolver.app.game.mobiles.impl;

import com.foolver.app.game.input.handlers.abstr.InputHandler;
import com.foolver.app.game.misc.*;
import com.foolver.app.game.mobiles.abstr.Player;
import com.foolver.app.game.mobiles.animation.Animation;
import com.foolver.app.integration.misc.CanvasWrapper;

public class PlayerImpl implements Player {

	private final String imageUrl = "http://s9.postimg.org/o14bxque7/walk_template.png";

	@SuppressWarnings("unused")
	private Position position = Position.getPositionZERO();

	private Animation animation = new Animation(Direction.SOUTH, 60, 110, 8, 40, 60, 100);

	@Override
	public void setPosition(Position position) {
		this.position = position;
	}

	@Override
	public void goToPosition(Position position) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {
		animation.animate();
	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		canvasWrapper.drawImage3(
				imageUrl,
				animation.getXPosition(),
				animation.getYPosition(),
				animation.getWidth(),
				animation.getHeight(),
				380, 200,
				animation.getDestinationWidth(),
				animation.getDestinationHeight());
	}

	@Override
	public void setDirection(Direction direction) {
		this.animation.setDirection(direction);
	}

}
