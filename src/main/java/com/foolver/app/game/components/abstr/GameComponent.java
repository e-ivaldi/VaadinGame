package com.foolver.app.game.components.abstr;

import com.foolver.app.game.input.handlers.abstr.InputHandler;
import com.foolver.app.game.misc.GameTime;
import com.foolver.app.integration.misc.CanvasWrapper;

public interface GameComponent {

	public void update(GameTime gameTime, InputHandler inputHandler);

	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper);

}
