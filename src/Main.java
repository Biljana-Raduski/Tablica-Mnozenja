public class Main {
    public static void main(String[] args) {

        // Deklarisem niz brojeva koji su mnozioci
        int[] mnozioci = { 1, 2, 3 };


// Loop kroz brojeve od 1 do 10 za oba uslova
        for (int i = 1; i <= 10; i++) {
            for (int j : mnozioci) {
                System.out.print((i * j) + "\t"); // Stampa rezultat mnozenja promenljive i + j
                                          // "\t" prilikom ispisa rezultata pravi razmak izmedju kolona
            }
            System.out.println(); // Komanda za stampanje novog reda da ne bi sve ispisao u jednom nizu....
        }



    }
}