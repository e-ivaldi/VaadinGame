package com.foolver.app.game.states.impl;

import java.util.*;

import com.foolver.app.game.Game;
import com.foolver.app.game.components.abstr.GameComponent;
import com.foolver.app.game.input.handlers.abstr.InputHandler;
import com.foolver.app.game.misc.GameTime;
import com.foolver.app.game.mobiles.*;
import com.foolver.app.game.mobiles.abstr.Player;
import com.foolver.app.game.mobiles.impl.PlayerImpl;
import com.foolver.app.game.states.abstr.GameState;
import com.foolver.app.game.world.Level;
import com.foolver.app.integration.misc.CanvasWrapper;

public class PlayState extends GameState {

	private List<GameComponent> gameComponents = new ArrayList<GameComponent>();

	public PlayState(Game game) {
		super(game);
		createGameComponents();
	}

	private void createGameComponents() {
		gameComponents = addNewLevelToGameComponents();
		gameComponents = addNewPlayerToGameComponents();
	}

	private List<GameComponent> addNewPlayerToGameComponents() {
		Player player = new PlayerImpl();
		gameComponents.add(player);
		return gameComponents;
	}

	private List<GameComponent> addNewLevelToGameComponents() {
		Level level = new Level();
		gameComponents.add(level);
		return gameComponents;
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {
		for(int i=0;i<gameComponents.size();i++)
			gameComponents.get(i).update(gameTime, inputHandler);
	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		for(int i=0;i<gameComponents.size();i++)
			gameComponents.get(i).draw(gameTime, inputHandler, canvasWrapper);
		super.draw(gameTime, inputHandler, canvasWrapper);
	}

}
