package com.foolver.game.integration.input.configurators;

import org.vaadin.hezamu.canvas.*;
import org.vaadin.hezamu.canvas.Canvas.CanvasClickListener;

import com.vaadin.shared.MouseEventDetails;

public class MouseHandlerConfigurator {

	int x, y;
	int relativeX, relativeY;

	public MouseHandlerConfigurator(Canvas canvas) {
		configurePositions(canvas);
	}

	private void configurePositions(Canvas canvas) {
		CanvasClickListener canvasClickListener = new CanvasClickListener() {
			@Override
			public void clicked(MouseEventDetails med) {
				x = med.getClientX();
				y = med.getClientY();
				relativeX = med.getRelativeX();
				relativeY = med.getRelativeY();
			}
		};
		canvas.addListener(canvasClickListener);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getRelativeX() {
		return relativeX;
	}

	public int getRelativeY() {
		return relativeY;
	}

}
