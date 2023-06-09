import java.util.Scanner;

public class ciftSayiBulma {
    public static void main(String[] args) {
        int a,i;
        Scanner inp =new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        a = inp.nextInt();

        for(i=1;i<=a; i++ ){
            if(i%2 == 0){
                System.out.println(i);

            }

        }
    }
}
