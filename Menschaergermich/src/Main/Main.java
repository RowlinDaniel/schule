package Main;

import java.util.Scanner;

public class Main {

	static int nAnzahl = 0;
	static String[] nNamen;
	static int[] nPosition;
	static int[] nWuerfel;
	static String name;
	static Scanner in = new Scanner(System.in);

	public static void anzahlholen() {
		System.out.println("Bitte geben Sie die Anzahl der Spieler ein: ");
		nAnzahl = in.nextInt();
		if (nAnzahl > 4 || nAnzahl <= 1) {
			System.out.println("Fehler. 2-4 Spieler erlaubt.");
			anzahlholen();
		}
		nNamen = new String[nAnzahl];
		nPosition = new int[nAnzahl];
		nWuerfel = new int[nAnzahl];
	}

	public static void main(String[] args) {
		System.out.println("Willkommen bei Mensch ärgere dich nicht 0.1");
		anzahlholen();
		namenholen();
		spielen();
in.close();
	}

	private static void spielen() {
		in.nextLine();
		for (int i = 0; i < nNamen.length; i++) {
			System.out.println("Spieler " + (i + 1) + " ist dran.");
			in.nextLine();
			nWuerfel[i] = wuerfeln();
			System.out.println("Spieler " + (i + 1) + " würfelt: " + nWuerfel[i]);
			nPosition[i] = nPosition[i] + nWuerfel[i];
			in.nextLine();
		}
		for(int i = 0; i < nNamen.length; i++){
			System.out.println(nNamen[i] + " befindet sich auf Position " + nPosition[i] + ".");
		}
	}

	private static void namenholen() {
		System.out.println("Bitte geben Sie die Spielernamen ein: ");
		for (int i = 0; i < nNamen.length; i++) {
			System.out.println("Name für Spieler: " + (i + 1) + " bestimmen:");
			name = in.next();
			nNamen[i] = name;
		}
	}

	private static int wuerfeln() {
		int i = 0;
		return i;
	}

}
