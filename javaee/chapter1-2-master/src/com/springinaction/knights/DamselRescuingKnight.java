package com.springinaction.knights;

public class DamselRescuingKnight implements Knight {

	private RescueDamselQuest quest;
	
	public DamselRescuingKnight() {
		this.quest=new RescueDamselQuest();
	}
	@Override
	public void embarkOnQuest() {
		// TODO Auto-generated method stub
		quest.embark();

	}

}