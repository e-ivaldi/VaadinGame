package com.foolver.game.config.ui;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.game.Game;
import com.foolver.game.app.input.abstr.*;
import com.foolver.game.app.input.impl.*;
import com.foolver.game.app.launcher.GameLauncher;
import com.foolver.game.app.states.abstr.GameState;
import com.foolver.game.app.states.impl.*;
import com.foolver.game.app.states.impl.SimpleGameStateFactory.GameStateID;
import com.foolver.game.utils.Constants;
import com.foolver.game.utils.mock.MockMouseHandler;
import com.vaadin.annotations.Push;
import com.vaadin.server.*;
import com.vaadin.ui.*;

@Push
public class MainUI extends UI {

	private static final String PAGE_TITLE = "The game";
	private static final long serialVersionUID = -152735180021558969L;

	private VerticalLayout layout;
	private Canvas canvas;

	@Override
	protected void init(VaadinRequest request) {
		final InputHandler inputHandler = new InputHandlerImpl();
		final Game game = new Game(inputHandler);

		SimpleGameStateFactory.initialize(game);
		GameState gameState = SimpleGameStateFactory.getGameState(GameStateID.MAIN);
		game.setGameState(gameState);


		setPageTitle();
		configureMainLayout();
		setContent(layout);
		configureCanvas();
		configureInputHandlers(inputHandler);
		startGameThread(game);
	}

	private void configureCanvas() {
		canvas = new Canvas();
		canvas.setWidth(getPxOfInteger(Constants.CANVAS_WIDTH));
		canvas.setHeight(getPxOfInteger(Constants.CANVAS_HEIGHT));
		layout.addComponent(canvas);
	}

	private void configureInputHandlers(InputHandler inputHandler) {
		KeyboardHandlerConfigurator keyboardHandlercongiruator = new KeyboardHandlerConfigurator(layout);
		KeyboardHandler keyboardHandler = new KeyboardHandlerImpl(keyboardHandlercongiruator);
		MouseHandler mouseHandler = new MockMouseHandler();
		inputHandler.setKeyboardHandler(keyboardHandler);
		inputHandler.setMouseHandler(mouseHandler);
	}

	private String getPxOfInteger(int number) {
		return number + "px";
	}

	private VerticalLayout configureMainLayout() {
		layout = new VerticalLayout();
		layout.setSpacing(true);
		layout.setMargin(true);
		return layout;
	}

	private void setPageTitle() {
		Page.getCurrent().setTitle(PAGE_TITLE);
	}

	protected synchronized void startGameThread(Game game) {
		Thread gameLauncher = new GameLauncher(this, game, canvas);
		gameLauncher.start();
	}

}
