 package com.designMode.Command.ex4;

public class AppleCommand extends Command {

	public AppleCommand(Peddler peddler) {
		super(peddler);
	}

	public void sail() {
		this.getPeddler().sailApple();
	}
	
}
