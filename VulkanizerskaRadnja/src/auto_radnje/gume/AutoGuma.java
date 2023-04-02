package auto_radnje.gume;

import java.util.Objects;
/**
 * Predstavlja podatke o gumi
 * 
 * @author Iva Stanisic
 *
 *@version 1.0.0
 */
public class AutoGuma {
	/**
	 * Marka i model gume kao String.
	 */
	private String markaModel = null;
	/**
	 * Precnik kao int.
	 */
	private int precnik = -1;
	/**
	 * Sirina kao int.
	 */
	private int sirina = -1;
	/**
	 * Visina kao int.
	 */
	private int visina = -1;

	/**
	 * Prazan konstruktor klase AutoGuma.
	 */
	public AutoGuma() {
	}

	/**
	 * Parametrizovani konstruktor. 
	 * 
	 * Postavlja sve atribute objekta na prosledjene vrednosti
	 * 
	 * @param markamodel nova vrednost za markaModel
	 * @param precnik nova vrednost za precnik
	 * @param sirina nova vrednost za sirinu
	 * @param visina nova vrednost za visinu
	 */
	public AutoGuma(String markamodel, int precnik, int sirina, int visina) {
		super();
		this.markaModel = markamodel;
		this.precnik = precnik;
		this.sirina = sirina;
		this.visina = visina;
	}
	
	/**
	 * Vraca ime marke i modela.
	 * 
	 * @return ime marke i modela kao String.
	 */
	public String getMarkamodel() {
		return markaModel;
	}

	
	/**
	 * Postavlja vrednost atributa markaModel.
	 * 
	 * MarkaModel ne sme biti null niti String manji od 3 karaktera.
	 * 
	 * @param markamodel nova vrednost za markaModel gume.
	 * 
	 * @throws NullPointerException ako se unese null vrednost za markaModel
	 * @throws IllegalArgumentException ako se unese String manji od 3 karaktera
	 */
	public void setMarkamodel(String markamodel) {
		if (markamodel == null)
			throw new NullPointerException("Morate uneti marku i model");
		
		if (markamodel.length() < 3)
			throw new IllegalArgumentException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markamodel;
	}

	/**
	 * Vraca precnik gume.
	 * 
	 * @return precnik gume kao int 
	 */
	public int getPrecnik() {
		return precnik;
	}
	
	/**
	 * Postavlja vrednost atrinuta precnik.
	 * 
	 * Precnik ne sme biti manji od 13 i veci od 22
	 * 
	 * @param precnik nova vrednost za precnik gume
	 * 
	 * @throws IllegalArgumentException ako se unese vrednost van opsega za precnik gume
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new IllegalArgumentException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Vraca sirinu gume.
	 * 
	 * @return sirinu gume kao int
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Postavlja vrednost atributa sirina.
	 * 
	 * Sirina ne sme biti manja od 135 i veca od 355
	 * 
	 * @param sirina nova vrednost atributa sirina gume
	 * 
	 * @throws IllegalArgumentException ako se unese vrednost van opsega za sirinu gume
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new IllegalArgumentException("Sirina van opsega");
		this.sirina = sirina;
	}
	
	
/**
 * Vraca visinu gume.
 * 
 * @return visinu kao int
 */
	public int getVisina() {
		return visina;
	}
/**
 * Postavlja vrednost atributa visina.
 * 
 * Visina ne sme biti manja od 25 ili veca od 95 
 * 
 * @param visina nova vrednost za visinu gume
 * 
 * @throws IllegalArgumentException ako se unese vredsnost van opsega za opseg visine gume
 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new IllegalArgumentException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markamodel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Racuna hash code na osnovu marke, modela, precnika, sirine i visine gume
	 * 
	 * @return hash code izracunat na osnovu marke, modela, precnika, sirine i visine gume
	 */
	@Override
	public int hashCode() {
		return Objects.hash(markaModel, precnik, sirina, visina);
	}

	/**
	 * Poredi dve gume prema marki, modelu, precniku, visini i sirini
	 * 
	 * @return
	 * <ul>
	 * <li> true - ako je unet isti objekat ili ako su svi atributi isti.</li>
	 * <li> false - ako je unet null objekat ili ako objekat nije klase AutoGuma. </li>
	 * 
	 * </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		return Objects.equals(markaModel, other.markaModel) && precnik == other.precnik && sirina == other.sirina
				&& visina == other.visina;
	}

	
	
}
