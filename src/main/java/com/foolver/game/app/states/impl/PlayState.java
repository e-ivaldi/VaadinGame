package com.foolver.game.app.states.impl;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.states.abstr.GameState;

public class PlayState implements GameState {

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(Canvas canvas) {
		canvas.clear();
		canvas.setFillStyle("pink");
		canvas.fillRect(0, 0, 800, 600);
		canvas.setFillStyle("black");
		canvas.setFont("30px Arial");
		canvas.fillText("main screensdasdasadsaddfssdfds", 50, 50, 200);
	}

}
