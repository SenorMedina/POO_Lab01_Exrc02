import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Exercise_02 {

	public static void main(String[] args) {
		
			final int NB_PARTIS = 3,
					  NB_BUREAUX = 10;
			
			int tabTotParti[] = new int [NB_PARTIS];
			int tabTotBureau[] = new int [NB_BUREAUX];
			int noParti,
				noBureau,
				nbVotes;
			
			traiterLesVotes(noParti, noBureau, nbVotes);
			traiterLesVotants(noBureau, nbVotes);
			
			
			
			System.exit(0);
	}

	public static void tableaux (int noParti, int nbVotes, int noBureau, int noVotants) throws IOException {		
			
			BufferedReader fichier = new BufferedReader(
							new FileReader("votes.txt"));
			String ligne;
			String tab[] = new String[3];
			
			while ((ligne = fichier.readLine()) != null)
				{
				tab = ligne.split(" ");		
					noBureau = Integer.parseInt(tab[0]);
					noParti = Integer.parseInt(tab[1]);
					nbVotes = Integer.parseInt(tab[2]);
				}
			fichier.close();
	}	
			
	public static void resultats () {	
		
			JTextArea sortie = new JTextArea();
					
			sortie.append("PARTI\tTOTAL DES VOTES\n");
			sortie.append("\nBUREAU\tTOTAL DES VOTANTS\n");
			
			

			
									
					
			JOptionPane.showMessageDialog(null, sortie, "RÉSULTATS DE L'ÉLECTION",
					JOptionPane.PLAIN_MESSAGE); 
		}

}