package com.foolver.game.app;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.states.abstr.GameState;
import com.vaadin.external.org.slf4j.*;

public class Game implements Component{

	private static final Logger logger = LoggerFactory.getLogger(Game.class);

	private GameState gameState;

	public Game(GameState gameState){
		setGameState(gameState);
	}

	public void setGameState(GameState gameState){
		this.gameState = gameState;
	}

	@Override
	public void update() {
		logger.info("game update");
		if(gameState != null)
			gameState.update();

	}

	@Override
	public void draw(Canvas canvas) {
		logger.info("game draw");
		if(gameState != null)
			gameState.draw(canvas);
	}

}
