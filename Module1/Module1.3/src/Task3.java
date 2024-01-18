import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Anna ensimmäinen numero: ");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Anna toinen numero: ");
        int second = Integer.parseInt(scanner.nextLine());
        int i, j, flag;

        for( i = first; i <= second; i++) {
            if(i == 0 || i == 0)
                continue;
            flag = 1;

            for(j = 2; j <= i / 2; j++) {
                if(i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                System.out.println(i);
        }

    }
}
