package com.foolver.app.game.misc;

public enum Direction {
	SOUTH_WEST(0),
	SOUTH(1),
	SOUTH_EST(2),
	WEST(3),
	EST(4),
	NORT_WEST(5),
	NORTH(6),
	NORT_EST(7);

	private int value;

	Direction(int value) {
		this.value = value;
	}

	public int getIntValue(){
		return value;
	}
}
