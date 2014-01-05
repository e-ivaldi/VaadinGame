package com.foolver.app.integration.misc;

import org.vaadin.hezamu.canvas.Canvas;

public class CanvasWrapperImpl implements CanvasWrapper {

	private Canvas canvas;

	public CanvasWrapperImpl(Canvas canvas){
		this.canvas = canvas;
	}

	@Override
	public void drawImage2(String url, int x, int y, int imgWidth, int imgHeight) {
		canvas.drawImage2(url, x, y, imgWidth, imgHeight);
	}

	@Override
	public void setLineWidth(double width) {
		canvas.setLineWidth(width);
	}

	@Override
	public void setStrokeStyle(String rgb) {
		canvas.setStrokeStyle(rgb);
	}

	@Override
	public void fillText(String relativeMousePosition, int x, int y, int maxWidth) {
		canvas.fillText(relativeMousePosition, x, y, maxWidth);
	}

	@Override
	public void setFillStyle(String color) {
		canvas.setFillStyle(color);

	}

	@Override
	public void clear() {
		canvas.clear();
	}

	@Override
	public void setFont(String string) {
		canvas.setFont(string);

	}

	@Override
	public void fillRect(int x, int y, int width, int height) {
		canvas.fillRect(x, y, width, height);
	}

	@Override
	public void stroke() {
		canvas.stroke();
	}

	@Override
	public void beginPath() {
		canvas.beginPath();
	}

	@Override
	public void rect(int i, int j, int width, int height) {
		canvas.rect(i, j, width, height);
	}

	@Override
	public void drawImage3(String url, int sourceX, int sourceY, int sourceWidth, int sourceHeight, int destX, int destY, int destWidth, int destHeight) {
		canvas.drawImage3(url, sourceX, sourceY, sourceWidth, sourceHeight, destX, destY, destWidth, destHeight);
	}
}
