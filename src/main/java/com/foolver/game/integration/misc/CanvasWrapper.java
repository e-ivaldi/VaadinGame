package com.foolver.game.integration.misc;

public interface CanvasWrapper {

	void drawImage2(String imageUrl, int i, int j, int tileWidth, int tileHeight);

	void setLineWidth(double d);

	void setStrokeStyle(String string);

	void fillText(String relativeMousePosition, int i, int j, int k);

	void setFillStyle(String string);

	void clear();

	void setFont(String string);

	void fillRect(int i, int j, int canvasWidth, int canvasHeight);

	void stroke();

	void beginPath();

	void rect(int i, int j, int tileWidth, int tileHeight);

}
