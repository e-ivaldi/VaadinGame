package com.foolver.game.app.states.impl;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.game.*;
import com.foolver.game.app.input.abstr.InputHandler;
import com.foolver.game.app.states.abstr.GameState;
import com.foolver.game.app.states.impl.SimpleGameStateFactory.GameStateID;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.external.org.slf4j.*;

public class MainState extends GameState {

	private final static Logger logger = LoggerFactory.getLogger(MainState.class);

	public MainState(Game game) {
		super(game);
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler ) {
		if(inputHandler.getKeyboardHandler().isButtonClicked(KeyCode.ENTER)){
			logger.info("button enter clicked");
			GameState playGameState = SimpleGameStateFactory.getGameState(GameStateID.PLAY);
			getGame().setGameState(playGameState);
		}
	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, Canvas canvas) {
		super.draw(gameTime, inputHandler, canvas);
		drawWelcomeScreen(canvas);
	}

	private void drawWelcomeScreen(Canvas canvas) {
		canvas.setFillStyle("white");
		canvas.setFont("30px Arial");
		canvas.fillText("Welcome to this game, let's have a look at how cool the brackground is.", 20, 150, 600);
		canvas.fillText("PRESS ENTER.", 20, 250, 700);
	}

}
