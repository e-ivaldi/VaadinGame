package com.foolver.app.game.misc;

public class Position {

	private int x;
	private int y;

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

	public static Position getPositionZERO(){
		return new Position(0,0);
	}
}
