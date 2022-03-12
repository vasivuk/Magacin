package magacin;

import java.util.LinkedList;
import java.util.List;

import magacin.interfejs.MagacinInterfejs;

public class Magacin implements MagacinInterfejs{
	
	List<Artikal> artikli = new LinkedList<Artikal>();

	@Override
	public void dodajArtikal(Artikal noviArtikal) {
		for (Artikal a : artikli) {
			if(a.equals(noviArtikal)) {
				a.setKolicina(a.getKolicina()+1);
				return;
			}
		}
		artikli.add(noviArtikal);
	}

	@Override
	public Artikal izbaciArtikal(Artikal artikal) {
		Artikal izbaceniArtikal;
		for (Artikal a : artikli) {
			if(a.equals(artikal)) {
				izbaceniArtikal = a;
				artikli.remove(a);
				return izbaceniArtikal;
			}
		}
		throw new NullPointerException("Artikal ne postoji u magacinu!");
	}

	@Override
	public Artikal pronadjiArtikal(long sifra) {
		for (Artikal artikal : artikli) {
			if(artikal.getSifra() == sifra) {
				return artikal;
			}
		}
		throw new NullPointerException("Artikal ne postoji u magacinu!");
	}
}
