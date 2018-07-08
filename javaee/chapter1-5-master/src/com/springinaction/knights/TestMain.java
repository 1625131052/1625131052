package com.springinaction.knights;

public class TestMain {
	public static void main(String[] args) {
		BraveKnight knight=new BraveKnight(new SlayDragonQuest(System.out));
		knight.embarkOnQuest();
	}
}
