package com.foolver.app.vaadin.ui;

import org.vaadin.hezamu.canvas.Canvas;

import com.foolver.app.integration.launcher.GameLauncher;
import com.foolver.app.integration.misc.Constants;
import com.vaadin.annotations.Push;
import com.vaadin.server.*;
import com.vaadin.shared.communication.PushMode;
import com.vaadin.ui.*;

@Push(PushMode.AUTOMATIC)
public class MainUI extends UI {

	private static final String PAGE_TITLE = "The game";
	private static final long serialVersionUID = -152735180021558969L;

	@Override
	protected void init(VaadinRequest request) {
		// TODO this method does too many things and is too long
		setPageTitle();
		Layout mainLayout = createMainLayout();
		setContent(mainLayout);
		Canvas canvas = createCanvas(mainLayout);
		mainLayout = addCanvasToMainLayout(canvas, mainLayout);

		startGameThread(canvas, mainLayout);
	}

	private Layout addCanvasToMainLayout(Canvas canvas, Layout mainLayout) {
		mainLayout.addComponent(canvas);
		return mainLayout;
	}

	private Canvas createCanvas(Layout layout) {
		Canvas canvas = new Canvas();
		canvas.setWidth(getPxOfInteger(Constants.CANVAS_WIDTH));
		canvas.setHeight(getPxOfInteger(Constants.CANVAS_HEIGHT));
		return canvas;
	}

	private String getPxOfInteger(int number) {
		return number + "px";
	}

	private Layout createMainLayout() {
		VerticalLayout mainLayout = new VerticalLayout();
		mainLayout.setSpacing(true);
		mainLayout.setMargin(true);
		return mainLayout;
	}

	private void setPageTitle() {
		Page.getCurrent().setTitle(PAGE_TITLE);
	}

	protected synchronized void startGameThread(Canvas canvas, Layout layout) {
		Thread gameLauncher = new GameLauncher(this, canvas, layout);
		gameLauncher.start();
	}

}
