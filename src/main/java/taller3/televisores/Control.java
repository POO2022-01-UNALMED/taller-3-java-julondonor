package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		tv.setControl(this);
		this.tv = tv;
	}
	
	public void turnOn() {
		if(tv instanceof TV) {
			tv.turnOn();
		}
	}
	public void turnOff() {
		if(tv instanceof TV) {
			tv.turnOff();
		}
	}
	public void canalUp() {
		if(tv instanceof TV) {
			tv.canalUp();
		}
	}
	public void canalDown() {
		if(tv instanceof TV) {
			tv.canalDown();
		}
	}
	public void volumenUp() {
		if(tv instanceof TV) {
			tv.volumenUp();
		}
	}
	public void volumenDown() {
		if(tv instanceof TV) {
			tv.volumenDown();
		}
	}
	public void setCanal(int canal) {
		if(tv instanceof TV) {
			tv.setCanal(canal);
		}
	}
	
	public TV getTv() {
		return tv;
	}
	public void setTv(TV tv) {
		this.tv = tv;
	}
}
