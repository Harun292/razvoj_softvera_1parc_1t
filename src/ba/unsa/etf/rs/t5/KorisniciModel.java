package ba.unsa.etf.rs.t5;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici = FXCollections.observableArrayList();
    private SimpleObjectProperty<Korisnik> trenutniKorisnik = new SimpleObjectProperty<>();

    public KorisniciModel() {
    }

    public void napuni() {
        korisnici.add(new Korisnik("Vedran", "Ljubović", "vljubovic@etf.unsa.ba", "vljubovic", "test"));
        korisnici.add(new Korisnik("Amra", "Delić", "adelic@etf.unsa.ba", "adelic", "test"));
        korisnici.add(new Korisnik("Tarik", "Sijerčić", "tsijercic1@etf.unsa.ba", "tsijercic", "test"));
        korisnici.add(new Korisnik("Rijad", "Fejzić", "rfejzic1@etf.unsa.ba", "rfejzic", "test"));
        trenutniKorisnik.set(null);
    }

    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    public void setKorisnici(ObservableList<Korisnik> korisnici) {
        this.korisnici = korisnici;
    }

    public Korisnik getTrenutniKorisnik() {
        return trenutniKorisnik.get();
    }

    public SimpleObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorisnik;
    }

    public void setTrenutniKorisnik(Korisnik trenutniKorisnik) {
        this.trenutniKorisnik.set(trenutniKorisnik);
    }

    public void setTrenutniKorisnik(int i) {
        this.trenutniKorisnik.set(korisnici.get(i));
    }
    public void izbrisi(Korisnik k)
    {
        int broj=korisnici.indexOf(k);
        korisnici.remove(broj);
        if(korisnici.size()-1!=0)
            trenutniKorisnik.set(korisnici.get(korisnici.size()-1));
        else
        {
         trenutniKorisnik.set(null);
        }
    }
}
