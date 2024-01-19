import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0;

        while(sc.hasNext()){
            int a = sc.nextInt();
            maior = 0;

            for(int i = 0; i < a; i++){
                int b = sc.nextInt();
                if(b > maior){
                    maior = b;
                }
            }

            if (maior < 10) {
                System.out.println("1");
            } else if (maior >= 10 && maior < 20) {
                System.out.println("2");
            } else if (maior >= 20) {
                System.out.println("3");
            }
    

        }

        sc.close();
    }
}