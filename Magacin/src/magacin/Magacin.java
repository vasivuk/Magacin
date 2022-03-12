package magacin;

import java.util.LinkedList;
import java.util.List;

import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs{
	
	List<Artikal> artikli = new LinkedList<Artikal>();

	@Override
	public void dodajArtikal(Artikal artikal) {
		for (Artikal a : artikli) {
			if(a.getSifra() == artikal.getSifra()) {
				a.setKolicina(a.getKolicina()+1);
				return;
			}
		}
		artikli.add(artikal);
	}

	@Override
	public Artikal izbaciArtikal(Artikal artikal) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Artikal pronadjiArtikal(long sifra) {
		// TODO Auto-generated method stub
		return null;
	}
}
