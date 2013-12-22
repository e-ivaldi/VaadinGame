package com.foolver.game.app.input.impl;

import com.vaadin.ui.Button;

public class ButtonExtended extends Button {

	private static final long serialVersionUID = 6415420498081609056L;

	private boolean isClicked = false;

	public boolean isClicked() {
		boolean result = isClicked;
		isClicked = false;
		return result;
	}

	public void setClicked() {
		this.isClicked = true;
	}
}
