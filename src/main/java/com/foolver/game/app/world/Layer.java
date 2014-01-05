package com.foolver.game.app.world;

import com.foolver.game.app.components.abstr.GameComponent;
import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.app.misc.GameTime;
import com.foolver.game.integration.misc.CanvasWrapper;

public class Layer implements GameComponent {

	private Tile[][] tileMatrix;

	public Layer(int rows, int columns) {
		createLayer(rows, columns);
	}

	public int getRows() {
		return tileMatrix.length;
	}

	public int getColumns() {
		return tileMatrix[0].length;
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {

	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper) {
		for (int row = 0; row < getRows(); row++) {
			for (int column = 0; column < getColumns(); column++) {
				tileMatrix[row][column].draw(gameTime, inputHandler, canvasWrapper);
			}
		}
	}

	private void createLayer(int rows, int columns) {
		tileMatrix = new Tile[rows][columns];
		for (int row = 0; row < getRows(); row++) {
			for (int column = 0; column < getColumns(); column++) {
				Tile tile = new Tile();
				tile.setPosition(column, row);
				tileMatrix[row][column] = tile;
			}
		}
	}

}
