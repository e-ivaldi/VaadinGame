package com.foolver.game.app.world;

import java.util.*;

import com.foolver.game.app.components.abstr.GameComponent;
import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.app.misc.GameTime;
import com.foolver.game.integration.misc.CanvasWrapper;

public class Level implements GameComponent {

	private List<Layer> level = new ArrayList<>();

	public Level() {
		addLayersToLevel();
	}

	private void addLayersToLevel() {
		// TODO: wip, create a single layer with hardcoded values only for test
		Layer layer0 = new Layer(15, 20);
		level.add(layer0);
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {
		for (int i = 0; i < level.size(); i++)
			level.get(i).update(gameTime, inputHandler);
	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		for (int i = 0; i < level.size(); i++)
			level.get(i).draw(gameTime, inputHandler, canvasWrapper);
	}

}
