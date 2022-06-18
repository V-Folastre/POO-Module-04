package fr.cmfp.tp4.quelMedecin.test;

import java.time.LocalDate;
import java.time.LocalTime;

import fr.cmfp.tp4.quelMedecin.bo.Adresse;
import fr.cmfp.tp4.quelMedecin.bo.Creneau;
import fr.cmfp.tp4.quelMedecin.bo.MedecinGeneraliste;
import fr.cmfp.tp4.quelMedecin.bo.Patient;
import fr.cmfp.tp4.quelMedecin.bo.RendezVous;



public class TestRDV {

	public static void main(String[] args) {
		Adresse sh = new Adresse("ZAC du CMFP", 221, "B", "avenue", "Baker Street", 29200, "BREST");
		MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", sh);
		new Creneau(LocalTime.of(9, 15), 15, melanie);
		new Creneau(LocalTime.of(9, 30), 15, melanie);
		new Creneau(LocalTime.of(9, 45), 15, melanie);
		new Creneau(LocalTime.of(10, 30), 15, melanie);
		new Creneau(LocalTime.of(10, 45), 15, melanie);
		new Creneau(LocalTime.of(11, 15), 15, melanie);
		new Creneau(LocalTime.of(11, 30), 15, melanie);
		Creneau c1 = new Creneau(LocalTime.of(11, 45), 15, melanie);
		new Creneau(LocalTime.of(14, 0), 30, melanie);
		new Creneau(LocalTime.of(14, 30), 30, melanie);
		new Creneau(LocalTime.of(15, 0), 30, melanie);
		new Creneau(LocalTime.of(15, 30), 30, melanie);
		new Creneau(LocalTime.of(16, 0), 30, melanie);
		new Creneau(LocalTime.of(16, 30), 30, melanie);
		System.out.println("__________________________ Rendez-Vous ___________________________");
		Adresse nio = new Adresse(19, null, "rue de monc", 44200, "Nantes");
		Patient adhemar = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 192112192020142l,
				LocalDate.of(1992, 11, 21), null, nio);
		RendezVous rdv = new RendezVous(c1, adhemar, LocalDate.of(2020, 5, 23));
		rdv.afficher();
	}

}
