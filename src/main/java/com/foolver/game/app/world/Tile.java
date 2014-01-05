package com.foolver.game.app.world;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.components.abstr.GameComponent;
import com.foolver.game.app.game.GameTime;
import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.utils.*;

public class Tile implements GameComponent {

	private String imageUrl = "http://img717.imageshack.us/img717/488/grass.png";
	private Position position = Position.getPositionZERO();

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {

	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, Canvas canvas) {
		canvas.drawImage2(
				imageUrl,
				position.getX() * Constants.TILE_WIDTH,
				position.getY() * Constants.TILE_HEIGHT,
				Constants.TILE_WIDTH,
				Constants.TILE_HEIGHT);

		canvas.beginPath();

		canvas.rect(
				position.getX() * Constants.TILE_WIDTH,
				position.getY() * Constants.TILE_HEIGHT,
				Constants.TILE_WIDTH,
				Constants.TILE_HEIGHT);


		canvas.setLineWidth(1d);
		canvas.setStrokeStyle("red");
		canvas.stroke();
	}

	public void setPosition(int x, int y){
		position.setPosition(x, y);
	}

}
