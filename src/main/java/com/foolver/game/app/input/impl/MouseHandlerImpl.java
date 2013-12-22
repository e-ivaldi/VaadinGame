package com.foolver.game.app.input.impl;

import com.foolver.game.app.input.abstr.MouseHandler;
import com.foolver.game.utils.Position;

public class MouseHandlerImpl implements MouseHandler {

	private MouseHandlerConfigurator mouseHandlerConfigurator;

	public MouseHandlerImpl(MouseHandlerConfigurator mouseHandlerConfigurator) {
		this.mouseHandlerConfigurator = mouseHandlerConfigurator;
	}

	@Override
	public Position getPosition() {
		return mouseHandlerConfigurator.getPosition();
	}

	@Override
	public Position getRelativePosition() {
		return mouseHandlerConfigurator.getRelativePosition();
	}
}
