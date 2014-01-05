package com.foolver.game.app.components.abstr;

import com.foolver.game.app.input.handlers.abstr.InputHandler;
import com.foolver.game.app.misc.GameTime;
import com.foolver.game.integration.misc.CanvasWrapper;

public interface GameComponent {

	public void update(GameTime gameTime, InputHandler inputHandler);

	public void draw(GameTime gameTime, InputHandler inputHandler, CanvasWrapper canvasWrapper);

}
