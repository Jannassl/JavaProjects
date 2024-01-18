import java.util.Scanner;
public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int eka, toka;
        int pisteet = 0;
        int kerrat = 1;
        System.out.println("Anna vastaus laskuihin: ");
        while(pisteet <10){
            eka = (int)(Math.random()*10)+1;
            toka = (int)(Math.random()*10)+1;
            // Random numerot toimivat

            System.out.println("Kierros: "+kerrat+"/10");
            System.out.println(eka + " * "+ toka + " = ");
            int oikeaVastaus = eka * toka;
            int kayttajaVastaus = Integer.parseInt(scanner.nextLine());
            if(kerrat ==10){
                pisteet -= pisteet;
                System.out.println("Uudestaan!");
            }

            else if(kayttajaVastaus == oikeaVastaus) {
                System.out.println("Oikea vastaus!");
                pisteet++;
            }
            else if(kayttajaVastaus != oikeaVastaus) {
                System.out.println("Väärin meni");
            }
            else if(kerrat== 10 && pisteet== 10){
                break;
            }
            kerrat++;


        }
        System.out.println("Onneksi olkoon olet mestari!");
    }
}
