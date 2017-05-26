 package com.designMode.Command.ex4;

public class BananaCommand extends Command{

	public BananaCommand(Peddler peddler) {
		super(peddler);
	}

	public void sail() {
		this.getPeddler().sailBanana();
	}

}
