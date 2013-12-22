package com.foolver.game.app.input.impl;

import org.vaadin.hezamu.canvas.*;
import org.vaadin.hezamu.canvas.Canvas.CanvasClickListener;

import com.foolver.game.utils.Position;
import com.vaadin.shared.MouseEventDetails;

public class MouseHandlerConfigurator {

	private Position position = Position.getPositionZERO();
	private Position relativePosition = Position.getPositionZERO();

	public MouseHandlerConfigurator(Canvas canvas) {
		configurePositions(canvas);
	}

	private void configurePositions(Canvas canvas) {
		CanvasClickListener canvasClickListener = new CanvasClickListener(){
			@Override
			public void clicked(MouseEventDetails med) {
				position.setPosition(med.getClientX(), med.getClientY());
				relativePosition.setPosition(med.getRelativeX(), med.getRelativeY());
			}
		};
		canvas.addListener(canvasClickListener);
	}

	public Position getPosition() {
		return position;
	}

	public Position getRelativePosition() {
		return relativePosition;
	}

}
