package fr.cmfp.tp4.quelMedecin.bo;

import java.time.LocalDate;

public class RendezVous {
	private LocalDate date;
	private Patient patient;
	private Creneau creneau;
	
	public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
		super();
		this.creneau = creneau;
		this.patient = patient;
		this.date = date;
		this.patient = patient;
		
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Creneau getCreneau() {
		return creneau;
	}

	public void setCreneau(Creneau creneau) {
		this.creneau = creneau;
	}


	public void afficher() {
		System.out.println("RendezVous [date=" + date + ", patient=" + patient + ", creneau=" + creneau + "]");
	}	
}
