package com.foolver.game.app;

import org.vaadin.hezamu.canvas.Canvas;

import com.vaadin.external.org.slf4j.*;
import com.vaadin.ui.UI;

public class GameLauncher extends Thread{

	private static final Logger logger = LoggerFactory.getLogger(GameLauncher.class);
	private static final int PAUSE_TIME_MS = 167;

	private UI ui;
	private Game game;
	private Canvas canvas;

	public GameLauncher(UI ui, Game game, Canvas canvas){
		this.ui = ui;
		this.game = game;
		this.canvas = canvas;
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
				game.draw(canvas);
			}
		});
	}

	private void sleepGame() {
		try {
			sleep(PAUSE_TIME_MS);
		} catch (InterruptedException e) {
			logger.error("unable to sleep the application",e);
		}
	}
}
