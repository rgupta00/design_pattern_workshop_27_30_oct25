package com.dp.behavioural.e.template_dp2;
public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Building Glass Walls");
	}

	@Override
	public void buildPillars() {
		System.out.println("Building Pillars with glass coating");
	}

}