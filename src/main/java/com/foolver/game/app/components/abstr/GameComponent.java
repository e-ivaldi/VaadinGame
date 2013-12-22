package com.foolver.game.app.components.abstr;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.game.app.game.GameTime;
import com.foolver.game.app.input.handlers.abstr.InputHandler;

public interface GameComponent {

	public void update(GameTime gameTime, InputHandler inputHandler);

	public void draw(GameTime gameTime, InputHandler inputHandler, Canvas canvas);

}
