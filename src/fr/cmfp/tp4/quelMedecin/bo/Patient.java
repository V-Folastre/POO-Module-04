package fr.cmfp.tp4.quelMedecin.bo;

import java.time.LocalDate;

public class Patient {

	private String nom;
	private String prenom;
	private String telephone;
	private char sexe;
	private long numeroSecu;
	private LocalDate dateNaissance;
	private String commentaires;
	private Adresse adresse;
	
	public Patient(String nom, String prenom, String telephone, char sexe, long numeroSecu, LocalDate dateNaissance,
			String commentaires) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.sexe = sexe;
		this.numeroSecu = numeroSecu;
		this.dateNaissance = dateNaissance;
		this.commentaires = commentaires;
	}

	public Patient(String nom, String prenom, String telephone, char sexe, long numeroSecu, LocalDate dateNaissance,
			String commentaires, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.sexe = sexe;
		this.numeroSecu = numeroSecu;
		this.dateNaissance = dateNaissance;
		this.commentaires = commentaires;
		this.adresse = adresse;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		System.out.println("Choississez M ou F");
		if (sexe == 'M' || sexe == 'F') {
			this.sexe = sexe;
		} else {
			System.err.println("Erreur!");
		}
	}

	public Adresse adresse() {
		return adresse;
	}
	
	public long getNumeroSecu() {
		return numeroSecu;
	}

	public void setNumeroSecu(long numeroSecu) {
		this.numeroSecu = numeroSecu;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		System.out.println("Allérgies, antécédents médicaux...");
		this.commentaires = commentaires;
	}

	public void afficher() {
		System.out.println( "Patient [nom = " + nom + ", prenom = " + prenom + ", adresse = " + adresse + 
				", telephone = " + telephone + ", sexe = " + sexe + ", numeroSecu = " + numeroSecu +
				", dateNaissance = " + dateNaissance + ", commentaires = " + commentaires + "]");
	}


	public String toString() {
		return "Patient [nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", sexe=" + sexe
				+ ", numeroSecu=" + numeroSecu + ", dateNaissance=" + dateNaissance + ", commentaires=" + commentaires
				+ "]";
	}
	
}
