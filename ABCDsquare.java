import java.util.Scanner;
public class ABCDsquare{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <=num; i++) {
            for (int j = 0; j <=4; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.err.println();
        } 

        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4; j++) {
                System.err.print((char)(i+96));
            }
            System.err.println();
        }


    }
}
