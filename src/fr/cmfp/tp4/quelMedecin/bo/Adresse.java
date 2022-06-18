package fr.cmfp.tp4.quelMedecin.bo;

public class Adresse {
	private String mentionsComplementaires;
	private int numeroRue;
	private String complementNumero;
	private String typeVoie;
	private String nomRue;
	private int codePostal;
	private String commune;
	
	public Adresse(int numeroRue, String complementNumero, String nomRue, int codePostal, String commune) {
		this.numeroRue = numeroRue;
		this.complementNumero = complementNumero;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.commune = commune;
	}
	
	public Adresse(String mentionsComplementaires, int numeroRue, String complementNumero, String typeVoie,
			String nomRue, int codePostal, String commune) {
		this.mentionsComplementaires = mentionsComplementaires;
		this.numeroRue = numeroRue;
		this.complementNumero = complementNumero;
		this.typeVoie = typeVoie;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.commune = commune;
	}

	public String getMentionsComplementaires() {
		return mentionsComplementaires;
	}

	public void setMentionsComplementaires(String mentionsComplementaires) {
		this.mentionsComplementaires = mentionsComplementaires;
	}

	public int getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(int numeroRue) {
		this.numeroRue = numeroRue;
	}

	public String getComplementNumero() {
		return complementNumero;
	}

	public void setComplementNumero(String complementNumero) {
		this.complementNumero = complementNumero;
	}

	public String getTypeVoie() {
		return typeVoie;
	}

	public void setTypeVoie(String typeVoie) {
		this.typeVoie = typeVoie;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	@Override
	public String toString() {
		String mc = (this.mentionsComplementaires != null) ? "mentionsComplementaires=\" + mentionsComplementaires" : "";
		String tv = (this.typeVoie != null) ? "\", typeVoie=\"\r\n" + " + typeVoie" : "";
		return "Adresse [" + mc + " numeroRue = " + numeroRue + ", complementNumero = " + complementNumero + tv + ","
				+ " nomRue = " + nomRue + ", codePostal = " + codePostal + ", commune = " + commune + "]";

	}

	public void afficher() {
		String mc = (this.mentionsComplementaires != null) ? "mentionsComplementaires=\" + mentionsComplementaires" : "";
		String tv = (this.typeVoie != null) ? "\", typeVoie=\"\r\n" + " + typeVoie" : "";
		System.out.printf(
				"Adresse [" + mc + " numeroRue = " + numeroRue + ", complementNumero = " + complementNumero + tv + ","
						+ " nomRue = " + nomRue + ", codePostal = %05d" + ", commune = " + commune + "]",
				this.codePostal);
		System.out.println();
	}
}
