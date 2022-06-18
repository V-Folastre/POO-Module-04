package fr.cmfp.tp4.quelMedecin.bo;

import java.time.LocalTime;
import java.util.Arrays;

public class MedecinGeneraliste {
	private String nom;
	private String prenom;
	private String telephone;
	private static int prixConsult;
	private Adresse adresse;
	private Creneau[]creneau = new Creneau[17];	
	
	public void ajouterCreneau(LocalTime heureDebut, int dureeMinute) {
		int position = 0;
		if (heureDebut.getHour() == 9 && heureDebut.getMinute() == 00) {
			position = 0;
		}
		if (heureDebut.getHour() == 9 && heureDebut.getMinute() == 15) {
			position = 1;
		}
		if (heureDebut.getHour() == 9 && heureDebut.getMinute() == 30) {
			position = 2;
		}
		if (heureDebut.getHour() == 9 && heureDebut.getMinute() == 45) {
			position = 3;
		}
		if (heureDebut.getHour() == 10 && heureDebut.getMinute() == 00) {
			position = 4;
		}
		if (heureDebut.getHour() == 10 && heureDebut.getMinute() == 15) {
			position = 5;
		}
		if (heureDebut.getHour() == 10 && heureDebut.getMinute() == 30) {
			position = 6;
		}
		if (heureDebut.getHour() == 10 && heureDebut.getMinute() == 45) {
			position = 7;
		}
		if (heureDebut.getHour() == 11 && heureDebut.getMinute() == 00) {
			position = 8;
		}
		if (heureDebut.getHour() == 11 && heureDebut.getMinute() == 15) {
			position = 9;
		}
		if (heureDebut.getHour() == 11 && heureDebut.getMinute() == 30) {
			position = 10;
		}
		if (heureDebut.getHour() == 11 && heureDebut.getMinute() == 45) {
			position = 11;
		}
		if (heureDebut.getHour() == 14 && heureDebut.getMinute() == 00) {
			position = 12;
		}
		if (heureDebut.getHour() == 14 && heureDebut.getMinute() == 30) {
			position = 13;
		}
		if (heureDebut.getHour() == 15 && heureDebut.getMinute() == 00) {
			position = 14;
		}
		if (heureDebut.getHour() == 15 && heureDebut.getMinute() == 30) {
			position = 15;
		}
		if (heureDebut.getHour() == 16 && heureDebut.getMinute() == 00) {
			position = 16;
		}
		if (heureDebut.getHour() == 16 && heureDebut.getMinute() == 30) {
			position = 17;
		}
		this.creneau[position] = new Creneau(heureDebut, dureeMinute, this);
	}

	public MedecinGeneraliste(String nom, String prenom, String telephone, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.adresse = adresse;
	}

	
	public MedecinGeneraliste(String nom, String prenom, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public Adresse adresse() {
		return adresse;
	}
	
	public static int getPrixConsult() {
		return prixConsult;
	}

	public static void setPrixConsult(int prixConsult) {
		prixConsult = prixConsult;
	}


	public void afficher() {
		System.out.println("MedecinGeneraliste [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", adresse="
				+ adresse + ", creneaux=" + Arrays.toString(creneau) + "]");
	}

	@Override
	public String toString() {
		return "MedecinGeneraliste [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", adresse="
				+ adresse + "]";
	}

	

		
}
