import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int scaner = new Scanner(System.in).nextInt();
        for(int i = 1;i <= scaner; i++){
            for(int j = scaner; j >= 1; j--){
                if(i * j == scaner){
                    System.out.println(i + " * " + j);
                }
            }
        }
    }
}
