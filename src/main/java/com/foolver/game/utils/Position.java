package com.foolver.game.utils;

public class Position {

	private int x;
	private int y;

	public static final Position ZERO = new Position(0, 0);

	public Position(int x, int y) {
		setPosition(x, y);
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
