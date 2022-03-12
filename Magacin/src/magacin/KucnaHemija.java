package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal{
	Date rokTrajanja;
	
	public Date getRokTrajanja() {
		return rokTrajanja;
	}
	
	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "KucnaHemija: " + super.toString() + "rokTrajanja=" + rokTrajanja;
	}
}
