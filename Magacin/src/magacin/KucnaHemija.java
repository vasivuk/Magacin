package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal{
	Date rokTrajanja;
	
	public Date getRokTrajanja() {
		return rokTrajanja;
	}
	
	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja == null || rokTrajanja.before(new Date())) {
			throw new IllegalArgumentException("Rok trajanja ne sme biti null, i mora biti nakon danasnjeg datuma");
		}
		this.rokTrajanja = rokTrajanja;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "KucnaHemija: " + super.toString() + "rokTrajanja=" + rokTrajanja;
	}
}
