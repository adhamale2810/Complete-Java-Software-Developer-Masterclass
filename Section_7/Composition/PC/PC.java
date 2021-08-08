package Section_7.Composition.PC;

public class PC {
	private Case theCase;
	private Monitor monitor;
	private Motherboard motherboard;

	public PC(Case thecase, Monitor monitor, Motherboard motherboard) {
		this.theCase = thecase;
		this.monitor = monitor;
		this.motherboard = motherboard;
	}

	public void powerUp(){
		theCase.pressPowerButton();
		powerLogo();
	}

	private void powerLogo(){
		monitor.drawPixelAt(10, 20, "green");
	}
}