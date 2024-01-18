import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Monta nimeä generoidaan? : ");
        int koko = scanner.nextInt();


        String[] firstNames = {"Jan", "Jere", "Pekka", "Kalle", "Simo"};
        String[] lastNames = {"Svensson", "Ollikainen", "Nieminen", "Tyni", "Vesala"};

        for(int i = 0; i <= koko -1; i++) {
            int eka = (int)(Math.random()* firstNames.length);
            int toka = (int)(Math.random()*lastNames.length);

            System.out.println(firstNames[eka]+ " "+ lastNames[toka]+ ".");
        }


    }
}
