import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.print("Doğum tarihinizi giriniz: ");
        int yil= inp.nextInt();

       int kalan=yil%12;

       if(kalan==0){
           System.out.print("Çin zoydağı burcunuz:Maymun");
        }
        if(kalan==1){
            System.out.print("Çin zoydağı burcunuz:Horoz");
        }
        if(kalan==2){
            System.out.print("Çin zoydağı burcunuz:Köpek");
        }
        if(kalan==3){
            System.out.print("Çin zoydağı burcunuz:Domuz");
        }
        if(kalan==4){
            System.out.print("Çin zoydağı burcunuz:Fare");
        }
        if(kalan==5){
            System.out.print("Çin zoydağı burcunuz:Öküz");
        }
        if(kalan==6){
            System.out.print("Çin zoydağı burcunuz:Kaplan");
        }
        if(kalan==7){
            System.out.print("Çin zoydağı burcunuz:Tavşan");
        }
        if(kalan==8){
            System.out.print("Çin zoydağı burcunuz:Ejderha");
        }
        if(kalan==9){
            System.out.print("Çin zoydağı burcunuz:Yılan");
        }
        if(kalan==10){
            System.out.print("Çin zoydağı burcunuz:At");
        }
        if(kalan==11){
            System.out.print("Çin zoydağı burcunuz:Koyun");
        }


    }
}