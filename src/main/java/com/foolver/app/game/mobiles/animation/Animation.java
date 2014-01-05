package com.foolver.app.game.mobiles.animation;

import java.util.Date;

import com.foolver.app.game.misc.*;

public class Animation {

	private Rectangle spriteRectangle;

	private int numberOfFrames;
	private int frameOffsetX;
	private int frameOffsetY;
	private int destinationWidth;
	private int destinationHeight;
	private int animationDurationInMillis;
	private Date lastAnimationUpdate = new Date();

	public Animation(
			Direction startDirection,
			int sourceWidth,
			int sourceHeight,
			int numberOfFrames,
			int destinationWidth,
			int destinationHeight,
			int animationDurationInMillis){

		this.frameOffsetX = 0;
		this.frameOffsetY = startDirection.getIntValue();
		this.numberOfFrames = numberOfFrames;
		this.destinationWidth = destinationWidth;
		this.destinationHeight = destinationHeight;
		this.animationDurationInMillis = animationDurationInMillis;
		this.spriteRectangle = new Rectangle(frameOffsetX * sourceWidth, frameOffsetY * sourceHeight, sourceWidth,sourceHeight);

	}

	public void setDirection(Direction direction) {
		this.frameOffsetY = direction.getIntValue();
		spriteRectangle.setY(frameOffsetY * spriteRectangle.getHeight());
	}

	// TODO: a very simple solution
	public void animate(){
		Date now = new Date();
		if (lastAnimationUpdateIsTooOld(now)) {
			frameOffsetX = calculateNextHorizontalFrame();
			spriteRectangle.setX(frameOffsetX * spriteRectangle.getWidth());
			updateLastAnimationDate(now);
		}
	}

	private boolean lastAnimationUpdateIsTooOld(Date now) {
		return now.getTime() - this.lastAnimationUpdate.getTime() > animationDurationInMillis;
	}

	private int calculateNextHorizontalFrame() {
		return (frameOffsetX + 1) % numberOfFrames;
	}

	private void updateLastAnimationDate(Date now) {
		this.lastAnimationUpdate = now;
	}

	public int getXPosition(){
		return spriteRectangle.getX();
	}

	public int getYPosition(){
		return spriteRectangle.getY();
	}

	public int getWidth() {
		return spriteRectangle.getWidth();
	}

	public int getHeight() {
		return spriteRectangle.getHeight();
	}

	public int getDestinationWidth() {
		return this.destinationWidth;
	}

	public int getDestinationHeight(){
		return this.destinationHeight;
	}

}
