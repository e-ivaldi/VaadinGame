package com.foolver.game.integration.misc;

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
	public void setLineWidth(double d) {
		canvas.setLineWidth(d);
	}

	@Override
	public void setStrokeStyle(String rgb) {
		canvas.setStrokeStyle(rgb);
	}

	@Override
	public void fillText(String relativeMousePosition, int i, int j, int k) {
		canvas.fillText(relativeMousePosition, i,j,k);
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
		canvas.clear();

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
}
