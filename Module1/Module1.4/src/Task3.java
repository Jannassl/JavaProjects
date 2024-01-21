import java.util.Scanner;
public class Task3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna arrayn pituus: ");
        int size = Integer.parseInt(scanner.nextLine());
        int arr [] = new int[size];

        System.out.println("Syötä numerot: ");
        for(int i =0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int number : arr){
            //System.out.print(number+", ");

        }
    }
}
