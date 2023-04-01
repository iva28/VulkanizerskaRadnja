package auto_radnje.gume;

import java.util.Objects;

public class AutoGuma {

	private String markamodel = null;
	private int precnik = -1;
	private int sirina = -1;
	private int visina = -1;

	public AutoGuma() {
	}

	public AutoGuma(String markamodel, int precnik, int sirina, int visina) {
		super();
		this.markamodel = markamodel;
		this.precnik = precnik;
		this.sirina = sirina;
		this.visina = visina;
	}

	public String getMarkamodel() {
		return markamodel;
	}

	public void setMarkamodel(String markamodel) {
		if (markamodel == null)
			throw new NullPointerException("Morate uneti marku i model");
		
		if (markamodel.length() < 3)
			throw new IllegalArgumentException("Marka i model moraju sadrzati bar 3 znaka");
		this.markamodel = markamodel;
	}

	public int getPrecnik() {
		return precnik;
	}

	public void setPrecnik(int precnik) {
		if (precnik < 13 && precnik > 22)
			throw new IllegalArgumentException("Precnik van opsega");
		this.precnik = precnik;
	}

	public int getSirina() {
		return sirina;
	}

	public void setSirina(int sirina) {
		if (sirina < 135 && sirina > 355)
			throw new IllegalArgumentException("Sirina van opsega");
		this.sirina = sirina;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new IllegalArgumentException("Visina van opsega");
		this.visina = visina;
	}

	@Override
	public String toString() {
		return "AutoGuma [markamodel=" + markamodel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(markamodel, precnik, sirina, visina);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		return Objects.equals(markamodel, other.markamodel) && precnik == other.precnik && sirina == other.sirina
				&& visina == other.visina;
	}

	
	
}
