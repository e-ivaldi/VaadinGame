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
		clearAndDrawBackground(canvas);
		drawMousePosition(inputHandler, canvas);
	}

	// TODO: getCss is slow? Color.BLACK.getCSS()
	private void clearAndDrawBackground(Canvas canvas) {
		canvas.clear();
		canvas.setFillStyle("black");
		canvas.fillRect(0, 0, Constants.CANVAS_WIDTH, Constants.CANVAS_HEIGHT);
	}

	// TODO: getCss is slow? Color.YELLOW.getCSS()
	private void drawMousePosition(InputHandler inputHandler, Canvas canvas) {
		canvas.setFillStyle("yellow");
		canvas.setFont("10px Arial");

		String mousePosition = prepareMousePositionString(inputHandler);
		String relativeMousePosition = prepareRelativeMousePositionString(inputHandler);
		canvas.fillText(mousePosition, 20, 50, 600);
		canvas.fillText(relativeMousePosition, 20, 70, 600);
	}

	private String prepareMousePositionString(InputHandler inputHandler) {
		return String.format("Mouse position : %s,%s ", inputHandler.getMouseHandler().getPosition().getX(), inputHandler.getMouseHandler().getPosition().getY());
	}

	private String prepareRelativeMousePositionString(InputHandler inputHandler) {
		return String.format("Mouse relative position : %s,%s ", inputHandler.getMouseHandler().getRelativePosition().getX(), inputHandler.getMouseHandler().getRelativePosition().getY());
	}

	protected Game getGame() {
		return this.game;
	}

}
