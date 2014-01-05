package com.foolver.game.app.world;

import com.foolver.game.app.components.abstr.GameComponent;
import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.app.misc.*;
import com.foolver.game.integration.misc.*;

public class Tile implements GameComponent {

	private String imageUrl = "http://static3.wikia.nocookie.net/__cb20070125212061/tibia/en/images/a/a3/Cobbled_Pavement_Tile.gif";
	private Position position = Position.getPositionZERO();

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {

	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		canvasWrapper.drawImage2(imageUrl, position.getX() * Constants.TILE_WIDTH, position.getY() * Constants.TILE_HEIGHT, Constants.TILE_WIDTH, Constants.TILE_HEIGHT);

		canvasWrapper.beginPath();

		canvasWrapper.rect(position.getX() * Constants.TILE_WIDTH, position.getY() * Constants.TILE_HEIGHT, Constants.TILE_WIDTH, Constants.TILE_HEIGHT);

		canvasWrapper.setLineWidth(1d);
		canvasWrapper.setStrokeStyle("red");
		canvasWrapper.stroke();
	}

	public void setPosition(int x, int y) {
		position.setPosition(x, y);
	}

}
