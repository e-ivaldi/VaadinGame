package com.foolver.game.app.states.abstr;

import com.foolver.game.app.Game;
import com.foolver.game.app.components.abstr.GameComponent;
import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.app.misc.GameTime;
import com.foolver.game.integration.misc.CanvasWrapper;

public abstract class GameState implements GameComponent {

	private Game game;

	public GameState(Game game) {
		this.game = game;
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {

	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		configureTextColorAndFont(canvasWrapper);
		drawMousePosition(inputHandler, canvasWrapper);
		drawMouseRelativePosition(inputHandler, canvasWrapper);
		drawMouseRelativePositionInTiles(inputHandler, canvasWrapper);
	}

	private void configureTextColorAndFont(CanvasWrapper canvasWrapper) {
		canvasWrapper.setFillStyle("yellow");
		canvasWrapper.setFont("10px Arial");
	}

	// TODO: getCss is slow? Color.YELLOW.getCSS()
	private void drawMousePosition(InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		String mousePosition = prepareMousePositionString(inputHandler);
		canvasWrapper.fillText(mousePosition, 20, 50, 600);
	}

	private void drawMouseRelativePosition(InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		String relativeMousePosition = prepareRelativeMousePositionString(inputHandler);
		canvasWrapper.fillText(relativeMousePosition, 20, 70, 600);
	}

	private void drawMouseRelativePositionInTiles(InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		String relativeMousePositionInTiles = prepareRelativeMousePositionInTileString(inputHandler);
		canvasWrapper.fillText(relativeMousePositionInTiles, 20, 90, 600);
	}

	private String prepareMousePositionString(InputHandler inputHandler) {
		return String.format("Mouse position : %s,%s ", inputHandler.getMouseHandler().getPosition().getX(), inputHandler.getMouseHandler().getPosition().getY());
	}

	private String prepareRelativeMousePositionString(InputHandler inputHandler) {
		return String.format("Mouse relative position : %s,%s ", inputHandler.getMouseHandler().getRelativePosition().getX(), inputHandler.getMouseHandler().getRelativePosition().getY());
	}

	private String prepareRelativeMousePositionInTileString(InputHandler inputHandler) {
		return String.format("Mouse relative position in tiles : %s,%s ", inputHandler.getMouseHandler().getRelativePositionInTiles().getX(), inputHandler.getMouseHandler()
				.getRelativePositionInTiles().getY());
	}

	protected Game getGame() {
		return this.game;
	}

}
