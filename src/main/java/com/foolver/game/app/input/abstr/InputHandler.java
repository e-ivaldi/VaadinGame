package com.foolver.game.app.input.abstr;

public interface InputHandler {

	MouseHandler getMouseHandler();

	KeyboardHandler getKeyboardHandler();

	void setKeyboardHandler(KeyboardHandler keyboardHandler);

	void setMouseHandler(MouseHandler mouseHandler);
}
