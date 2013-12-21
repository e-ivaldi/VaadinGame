package com.foolver.game.config.ui;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.*;
import com.foolver.game.app.states.abstr.GameState;
import com.foolver.game.app.states.impl.MainState;
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

	private final Game game = new Game(gameState);

	@Override
	protected void init(VaadinRequest request) {
		setPageTitle();
		configureMainLayout();
		setContent(layout);
		configureCanvas();
		startGameThread();
	}

	private void configureCanvas() {
		addCanvasToMainLayout();

	}

	private void addCanvasToMainLayout() {
		canvas = new Canvas();
		canvas.setHeight(getPxOfInteger(800));
		canvas.setWidth(getPxOfInteger(600));
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
		Thread gameLauncher = new GameLauncher(this,game,canvas);
		gameLauncher.start();
	}

}
