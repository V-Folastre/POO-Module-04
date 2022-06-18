package fr.cmfp.tp4.quelMedecin.bo;

import java.time.LocalTime;
import java.util.Arrays;

public class Creneau {
	private LocalTime heureDebut;
	private int dureeMinute;
	private MedecinGeneraliste medecinGeneraliste;
	
	public Creneau(LocalTime heureDebut, int dureeMinute,
			MedecinGeneraliste medecinGeneraliste) {
		this.heureDebut = heureDebut;
		this.dureeMinute = dureeMinute;
		this.medecinGeneraliste = medecinGeneraliste;
	}

	public LocalTime getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(LocalTime heureDebut) {
		this.heureDebut = heureDebut;
	}

	public int getDureeMinute() {
		return dureeMinute;
	}

	public void setDureeMinute(int dureeMinute) {
		this.dureeMinute = dureeMinute;
		}

	public void afficher() {
		System.out.println("Creneau [heureDebut=" + heureDebut + ", dureeMinute="
				+ dureeMinute + ", medecinGeneraliste=" + medecinGeneraliste + "]");
	}

	public MedecinGeneraliste getMedecinGeneraliste() {
		return null;		
	}

	public String toString() {
		return "Creneau [heureDebut=" + heureDebut + ", dureeMinute=" + dureeMinute + ", medecinGeneraliste="
				+ medecinGeneraliste + "]";
	}
	
}
