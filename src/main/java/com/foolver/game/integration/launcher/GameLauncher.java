package com.foolver.game.integration.launcher;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.Game;
import com.foolver.game.app.input.handlers.abstr.*;
import com.foolver.game.app.input.handlers.impl.*;
import com.foolver.game.app.states.abstr.GameState;
import com.foolver.game.app.states.impl.*;
import com.foolver.game.app.states.impl.SimpleGameStateFactory.GameStateID;
import com.foolver.game.integration.input.configurators.*;
import com.foolver.game.integration.misc.*;
import com.vaadin.external.org.slf4j.*;
import com.vaadin.ui.*;

public class GameLauncher extends Thread {

	private static final Logger logger = LoggerFactory.getLogger(GameLauncher.class);
	private static final int PAUSE_TIME_MS = 333;

	private UI ui;
	private Game game;
	private CanvasWrapper canvasWrapper;

	public GameLauncher(UI ui, Canvas canvas, Layout layout) {
		this.ui = ui;
		this.game = new Game(createInputHandler(layout, canvas));
		this.canvasWrapper = new CanvasWrapperImpl(canvas);

		createAndConfigureInitialGameState();
	}

	private void createAndConfigureInitialGameState() {
		SimpleGameStateFactory.initialize(game);
		GameState gameState = SimpleGameStateFactory.getGameState(GameStateID.MAIN);
		game.setGameState(gameState);
	}

	private InputHandler createInputHandler(Layout layout, Canvas canvas) {
		KeyboardHandlerConfigurator keyboardHandlerConfigurator = new KeyboardHandlerConfigurator(layout);
		MouseHandlerConfigurator mouseHandlerConfigurator = new MouseHandlerConfigurator(canvas);
		KeyboardHandler keyboardHandler = new KeyboardHandlerImpl(keyboardHandlerConfigurator);
		MouseHandler mouseHandler = new MouseHandlerImpl(mouseHandlerConfigurator);
		return new InputHandlerImpl(mouseHandler, keyboardHandler);
	}

	@Override
	public void run() {
		startLoop();
	}

	private void startLoop() {
		while (true) {
			updateGameLogic();
			updateGameDraw();
			sleepGame();
		}
	}

	private void updateGameLogic() {
		ui.access(new Runnable() {
			@Override
			public void run() {
				game.update();
			}
		});
	}

	private void updateGameDraw() {
		ui.access(new Runnable() {
			@Override
			public void run() {
				game.draw(canvasWrapper);
			}
		});

	}

	private void sleepGame() {
		try {
			sleep(PAUSE_TIME_MS);
		} catch (InterruptedException e) {
			logger.error("unable to sleep the application", e);
		}
	}
}
