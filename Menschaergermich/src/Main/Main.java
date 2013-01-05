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
		System.out.println("Regeln: 2-4 Spieler erlaubt.");
		System.out.println("Gewonnen hat, wer zuerst 80 erreicht.");
		anzahlholen();
		namenholen();
		spielen();
		in.close();
	}

	private static void spielen() {
		do {

			in.nextLine();
			for (int i = 0; i < nNamen.length; i++) {
				System.out.println("Spieler " + (i + 1) + " ist dran.");
				nWuerfel[i] = wuerfeln();
				in.nextLine();
				System.out.println("Spieler " + (i + 1) + " würfelt: "
						+ nWuerfel[i]);
				nPosition[i] = nPosition[i] + nWuerfel[i];
				if (nPosition[i] == 80) {
					System.out.println("Spieler " + (i + 1) + " hat gewonnen.");
					return;
				}
				if (nPosition[i] > 80) {
					nPosition[i] = nPosition[i] - nWuerfel[i];
					System.out.println("Spieler " + (i + 1)
							+ " hat zu hoch gewürfelt. Er muss genau "
							+ (80 - nPosition[i]) + " wuerfeln");

				}
			}
			for (int i = 0; i < nNamen.length; i++) {
				System.out.println(nNamen[i] + " befindet sich auf Position "
						+ nPosition[i] + ".");
			}

		} while (true);
	}

	// private static boolean pruefen() {
	// for (int i : nPosition) {
	// if (i >= 80) {
	// i = 80;
	// return false;
	// }
	// }
	// return true;
	// }

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
		i = (int) (Math.random() * 6 + 1);
		return i;
	}

}
