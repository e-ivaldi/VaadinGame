package com.foolver.game.app.states.impl;

import com.foolver.game.app.Game;
import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.app.misc.*;
import com.foolver.game.app.states.abstr.GameState;
import com.foolver.game.app.states.impl.SimpleGameStateFactory.GameStateID;
import com.foolver.game.integration.misc.*;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.external.org.slf4j.*;

public class MainState extends GameState {

	private final static Logger logger = LoggerFactory.getLogger(MainState.class);

	public MainState(Game game) {
		super(game);
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {
		if (inputHandler.getKeyboardHandler().isButtonClicked(KeyCode.ENTER)) {
			logger.info("button enter clicked");
			GameState playGameState = SimpleGameStateFactory.getGameState(GameStateID.PLAY);
			getGame().setGameState(playGameState);
		}
	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		clearAndDrawBackground(canvasWrapper);
		drawWelcomeScreen(canvasWrapper);
		super.draw(gameTime, inputHandler, canvasWrapper);
	}

	private void drawWelcomeScreen(CanvasWrapper canvasWrapper) {
		canvasWrapper.setFillStyle("white");
		canvasWrapper.setFont("30px Arial");
		canvasWrapper.fillText("Welcome to this game, let's have a look at how cool the brackground is.", 20, 150, 600);
		canvasWrapper.fillText("PRESS ENTER.", 20, 250, 700);
	}

	// TODO: getCss is slow? Color.BLACK.getCSS()
	private void clearAndDrawBackground(CanvasWrapper canvasWrapper) {
		canvasWrapper.clear();
		canvasWrapper.setFillStyle("black");
		canvasWrapper.fillRect(0, 0, Constants.CANVAS_WIDTH, Constants.CANVAS_HEIGHT);
	}

}
