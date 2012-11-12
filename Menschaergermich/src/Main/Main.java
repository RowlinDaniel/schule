package Main;

import java.util.Scanner;

public class Main {

	static int nAnzahl = 0;
	static String[][] nNamen = new String[4][];

	public static void anzahlholen() {
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Anzahl der Spieler ein: ");
		nAnzahl = in.nextInt();
		if(nAnzahl > 4){
			System.out.println("Fehler. Max. 4 Spieler erlaubt.");
			anzahlholen();
		}
		in.close();
	}

	public static void main(String[] args) {
		System.out.println("Willkommen bei Mensch ärgere dich nicht 0.1");
		anzahlholen();
		namenholen();
		spielen();

	}

	private static void spielen() {
	}

	private static void namenholen() {
		Scanner in2 = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Spielernamen ein: ");
		for (int i = 0; i < nAnzahl; i++) {
			System.out.println("Name für Spieler: " + (i + 1) + " bestimmen:");
			nNamen[0][] = in2.nextLine();
		}
	}

}
