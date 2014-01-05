package com.foolver.game.test.app.world;

import org.junit.*;

import com.foolver.game.app.world.Layer;

public class LayerTest {

	@Test
	public void layerTest(){
		int rows = 1;
		int columns = 2;
		Layer layer = new Layer(rows,columns);
		Assert.assertEquals(rows, layer.getRows());
		Assert.assertEquals(columns, layer.getColumns());
	}

}
