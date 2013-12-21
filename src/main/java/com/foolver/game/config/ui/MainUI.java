package com.foolver.game.config.ui;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.game.Game;
import com.foolver.game.app.input.abstr.InputHandler;
import com.foolver.game.app.input.impl.InputHandlerImpl;
import com.foolver.game.app.launcher.GameLauncher;
import com.foolver.game.app.states.abstr.GameState;
import com.foolver.game.app.states.impl.MainState;
import com.foolver.game.utils.Constants;
import com.foolver.game.utils.mock.MockInputHandler;
import com.vaadin.annotations.Push;
import com.vaadin.server.*;
import com.vaadin.ui.*;

@Push
public class MainUI extends UI {

	private static final String PAGE_TITLE = "The game";
	private static final long serialVersionUID = -152735180021558969L;

	private VerticalLayout layout;
	private Canvas canvas;

	private GameState gameState = new MainState();
	//TODO: using a mock inputhandler
	private final Game game = new Game(gameState, new MockInputHandler());

	@Override
	protected void init(VaadinRequest request) {
		setPageTitle();
		configureMainLayout();
		setContent(layout);
		configureCanvas();
		startGameThread();
	}

	private void configureCanvas() {
		canvas = new Canvas();
		canvas.setWidth(getPxOfInteger(Constants.CANVAS_WIDTH));
		canvas.setHeight(getPxOfInteger(Constants.CANVAS_HEIGHT));
		layout.addComponent(canvas);
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

	protected synchronized void startGameThread() {
		Thread gameLauncher = new GameLauncher(this, game, canvas);
		gameLauncher.start();
	}

}
