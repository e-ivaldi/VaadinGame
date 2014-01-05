package com.foolver.app.game.states.impl;

import java.util.*;

import com.foolver.app.game.Game;
import com.foolver.app.game.states.abstr.GameState;

public class SimpleGameStateFactory {

	private static SimpleGameStateFactory simpleGameStateFactory = new SimpleGameStateFactory();

	private SimpleGameStateFactory(){

	}

	public static SimpleGameStateFactory getInstance(){
		return simpleGameStateFactory;
	}

	public static void initialize(Game game){
		states.put(GameStateID.MAIN, new MainState(game));
		states.put(GameStateID.LOGIN, new LoginState(game));
		states.put(GameStateID.PLAY, new PlayState(game));
	}

	public enum GameStateID {
		MAIN, LOGIN, PLAY;
	}

	private static Map<GameStateID, GameState> states = new HashMap<>();

	static {

	}

	public static GameState getGameState(GameStateID gameStateID) {
		// TODO: decide how to handle the fact that the map could be empty
		return states.get(gameStateID);
	}
}
