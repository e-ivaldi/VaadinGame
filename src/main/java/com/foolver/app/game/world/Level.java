package com.foolver.app.game.world;

import java.util.*;

import com.foolver.app.game.components.abstr.GameComponent;
import com.foolver.app.game.input.handlers.abstr.InputHandler;
import com.foolver.app.game.misc.GameTime;
import com.foolver.app.integration.misc.CanvasWrapper;

public class Level implements GameComponent {

	private List<Layer> layerList = new ArrayList<>();

	public Level() {
		addLayersToLevel();
	}

	private void addLayersToLevel() {
		// TODO: wip, create a single layer with hardcoded values only for test
		Layer layer0 = new Layer(15, 20);
		layerList.add(layer0);
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {
		for (int i = 0; i < layerList.size(); i++)
			layerList.get(i).update(gameTime, inputHandler);
	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		for (int i = 0; i < layerList.size(); i++)
			layerList.get(i).draw(gameTime, inputHandler, canvasWrapper);
	}

}
