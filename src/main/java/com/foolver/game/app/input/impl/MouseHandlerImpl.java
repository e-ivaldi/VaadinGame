package com.foolver.game.app.input.impl;

import com.foolver.game.app.input.abstr.MouseHandler;
import com.foolver.game.utils.Position;
import com.vaadin.shared.MouseEventDetails;

public class MouseHandlerImpl implements MouseHandler {

	private MouseEventDetails mouseEventDetails;
	private Position position;
	private Position relativePosition;

	public MouseHandlerImpl(MouseEventDetails mouseEventDetails){
		this.mouseEventDetails = mouseEventDetails;
	}

	@Override
	public Position getPosition() {
		position.setPosition(
				mouseEventDetails.getClientX(),
				mouseEventDetails.getClientY());
		return position;
	}

	@Override
	public Position getRelativePosition() {
		relativePosition.setPosition(
				mouseEventDetails.getRelativeX(),
				mouseEventDetails.getRelativeY());
		return relativePosition;
	}
}
