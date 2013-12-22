package com.foolver.game.config.ui;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.game.Game;
import com.foolver.game.app.input.configurators.*;
import com.foolver.game.app.input.handlers.abstr.*;
import com.foolver.game.app.input.handlers.impl.*;
import com.foolver.game.app.launcher.GameLauncher;
import com.foolver.game.app.states.abstr.GameState;
import com.foolver.game.app.states.impl.*;
import com.foolver.game.app.states.impl.SimpleGameStateFactory.GameStateID;
import com.foolver.game.utils.Constants;
import com.vaadin.annotations.Push;
import com.vaadin.server.*;
import com.vaadin.ui.*;

@Push
public class MainUI extends UI {

	private static final String PAGE_TITLE = "The game";
	private static final long serialVersionUID = -152735180021558969L;

	@Override
	protected void init(VaadinRequest request) {
		//TODO this method does too many things and is too long
		setPageTitle();
		Layout mainLayout = createMainLayout();
		setContent(mainLayout);
		Canvas canvas = createCanvas(mainLayout);
		mainLayout = addCanvasToMainLayout(canvas, mainLayout);

		final InputHandler inputHandler = createInputHandler(mainLayout, canvas);
		final Game game = new Game(inputHandler);

		SimpleGameStateFactory.initialize(game);
		GameState gameState = SimpleGameStateFactory.getGameState(GameStateID.MAIN);
		game.setGameState(gameState);


		startGameThread(game, canvas);
	}

	private Layout addCanvasToMainLayout(Canvas canvas, Layout mainLayout) {
		mainLayout.addComponent(canvas);
		return mainLayout;
	}

	private Canvas createCanvas(Layout layout) {
		Canvas canvas = new Canvas();
		canvas.setWidth(getPxOfInteger(Constants.CANVAS_WIDTH));
		canvas.setHeight(getPxOfInteger(Constants.CANVAS_HEIGHT));
		return canvas;
	}

	private InputHandler createInputHandler(Layout layout, Canvas canvas) {
		KeyboardHandlerConfigurator keyboardHandlerConfigurator = new KeyboardHandlerConfigurator(layout);
		MouseHandlerConfigurator mouseHandlerConfigurator = new MouseHandlerConfigurator(canvas);
		KeyboardHandler keyboardHandler = new KeyboardHandlerImpl(keyboardHandlerConfigurator);
		MouseHandler mouseHandler = new MouseHandlerImpl(mouseHandlerConfigurator);
			return new InputHandlerImpl(mouseHandler,keyboardHandler);
	}

	private String getPxOfInteger(int number) {
		return number + "px";
	}

	private Layout createMainLayout() {
		VerticalLayout mainLayout = new VerticalLayout();
		mainLayout.setSpacing(true);
		mainLayout.setMargin(true);
		return mainLayout;
	}

	private void setPageTitle() {
		Page.getCurrent().setTitle(PAGE_TITLE);
	}

	protected synchronized void startGameThread(Game game, Canvas canvas) {
		Thread gameLauncher = new GameLauncher(this, game, canvas);
		gameLauncher.start();
	}

}
