package com.foolver.game.app.states.impl;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.game.*;
import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.app.states.abstr.GameState;
import com.foolver.game.app.world.Level;

public class PlayState extends GameState {

	private Level level = new Level();

	public PlayState(Game game) {
		super(game);
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler ) {

	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, Canvas canvas) {
		level.draw(gameTime, inputHandler, canvas);
		super.draw(gameTime, inputHandler, canvas);
		//canvas.setFillStyle("white");
		//canvas.setFont("30px Arial");
		//canvas.fillText("This is the PlayState", 20, 150, 600);
	}

}
