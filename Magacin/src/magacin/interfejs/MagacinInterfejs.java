package magacin.interfejs;

import magacin.Artikal;

public interface MagacinInterfejs {
	void dodajArtikal(Artikal artikal);
	Artikal izbaciArtikal(Artikal artikal);
	Artikal pronadjiArtikal(long sifra);
}
