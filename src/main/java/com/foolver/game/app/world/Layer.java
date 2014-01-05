package com.foolver.game.app.world;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.components.abstr.GameComponent;
import com.foolver.game.app.game.GameTime;
import com.foolver.game.app.input.handlers.abstr.InputHandler;

public class Layer implements GameComponent {

	private Tile[][] layer;

	public Layer(int rows, int columns){
		createLayer(rows, columns);
	}

	public int getRows(){
		return layer.length;
	}

	public int getColumns(){
		return layer[0].length;
	}

	@Override
	public void update(GameTime gameTime, InputHandler inputHandler) {

	}

	@Override
	public void draw(GameTime gameTime, InputHandler inputHandler, Canvas canvas) {
		for (int row = 0; row < getRows(); row++) {
			for (int column = 0; column < getColumns(); column++) {
				layer[row][column].draw(gameTime, inputHandler, canvas);
			}
		}
	}

	private void createLayer(int rows, int columns) {
		layer = new Tile[rows][columns];
		for (int row = 0; row < getRows(); row++) {
			for (int column = 0; column < getColumns(); column++) {
				Tile tile = new Tile();
				tile.setPosition(column, row);
				layer[row][column] = tile;
			}
		}
	}


}
