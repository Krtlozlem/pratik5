import java.util.Scanner;

public class sayiOrt {
    public static void main(String[] args) {
        int lastNum,i,ortakSayiAdet=0;
        double total = 0,ort;
        Scanner inp =new Scanner(System.in);
        System.out.print("lütfen bir sayı giriniz: ");
        lastNum =inp.nextInt();



        for(i=0; i<=lastNum; i++){
            if(i%3==0 && i%4==0){
                ortakSayiAdet++;
                total += i;
                System.out.println(i);

            }
            ort = total/ortakSayiAdet;
            System.out.println("Girilen sayıya kadar, 3 ve 4'e tam bölünen sayılar toplamı: " + total);
            System.out.println("Girilen sayıya kadar, 3 ve 4'e tam bölünen sayılar ortalaması: " + ort);
        }

    }
}
