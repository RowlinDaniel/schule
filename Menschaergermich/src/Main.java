import java.util.Scanner;

public class Main {

	static int nAnzahl = 0;
	static String[] nNamen = new String[4];

	public static void anzahlholen() {
		Scanner in = new Scanner(System.in);
		System.out.println("Bitte geben Sie die Anzahl der Spieler ein: ");
		nAnzahl = in.nextInt();
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
		System.out.println("Bitte geben Sie die Spielernamen ein: ");
		Scanner in = new Scanner(System.in);
		for(int i = 1; i <= nAnzahl; i++){
			System.out.println("Name für Spieler: " + i + " bestimmen.");
			nNamen[i] = in.nextLine();
		}		
		in.close();
	}

}
