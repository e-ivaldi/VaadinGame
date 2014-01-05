package com.foolver.game.app.states.abstr;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.components.abstr.GameComponent;
import com.foolver.game.app.game.*;
import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.utils.Constants;

public abstract class GameState implements GameComponent {

	private Game game;

	public GameState(Game game) {
		this.game = game;
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {

	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, Canvas canvas) {
		configureTextColorAndFont(canvas);
		drawMousePosition(inputHandler, canvas);
		drawMouseRelativePosition(inputHandler, canvas);
		drawMouseRelativePositionInTiles(inputHandler, canvas);
	}

	private void configureTextColorAndFont(Canvas canvas) {
		canvas.setFillStyle("yellow");
		canvas.setFont("10px Arial");
	}

	// TODO: getCss is slow? Color.YELLOW.getCSS()
	private void drawMousePosition(InputHandler inputHandler, Canvas canvas) {
		String mousePosition = prepareMousePositionString(inputHandler);
		canvas.fillText(mousePosition, 20, 50, 600);
	}

	private void drawMouseRelativePosition(InputHandler inputHandler, Canvas canvas) {
		String relativeMousePosition = prepareRelativeMousePositionString(inputHandler);
		canvas.fillText(relativeMousePosition, 20, 70, 600);
	}

	private void drawMouseRelativePositionInTiles(InputHandler inputHandler, Canvas canvas) {
		String relativeMousePositionInTiles = prepareRelativeMousePositionInTileString(inputHandler);
		canvas.fillText(relativeMousePositionInTiles, 20, 90, 600);
	}

	private String prepareMousePositionString(InputHandler inputHandler) {
		return String.format("Mouse position : %s,%s ", inputHandler.getMouseHandler().getPosition().getX(), inputHandler.getMouseHandler().getPosition().getY());
	}

	private String prepareRelativeMousePositionString(InputHandler inputHandler) {
		return String.format("Mouse relative position : %s,%s ", inputHandler.getMouseHandler().getRelativePosition().getX(), inputHandler.getMouseHandler().getRelativePosition().getY());
	}

	private String prepareRelativeMousePositionInTileString(InputHandler inputHandler) {
		return String.format("Mouse relative position in tiles : %s,%s ", inputHandler.getMouseHandler().getRelativePositionInTiles().getX(), inputHandler.getMouseHandler().getRelativePositionInTiles().getY());
	}

	protected Game getGame() {
		return this.game;
	}

}
