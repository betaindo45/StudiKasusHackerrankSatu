import java.util.Scanner;
/**
 * HitungLuas
 */
public class HitungLuas {

    private static final Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        byte pilihan = inp.nextByte();

        switch (pilihan){
            case 1: //Luas Persegi
                int inputSisi = inp.nextInt();
                PersegiLuas(inputSisi);
                break;
            case 2: //Luas Segitiga
                int inputAlas = inp.nextInt();
                int inputTinggi = inp.nextInt();
                SegitigaLuas(inputAlas, inputTinggi);
                break;
            case 3:
                int inputJariJari = inp.nextInt();
                LingkaranLuas(inputJariJari);
                break;
        }

    }
    private static void PersegiLuas(int sisi){
        int hasil = (int) Math.pow(sisi , 2);
        System.out.println(hasil);

    }
    private static void SegitigaLuas(int alas, int tinggi){
        double hasil = alas*tinggi/2;
        System.out.println((int)hasil);
    }
    private static void LingkaranLuas(int JariJari){
        double hasil;
        if(JariJari % 7 == 0){
            hasil = 22/7*Math.pow(JariJari,2);
        }else{
            hasil = 3.14*Math.pow(JariJari,2);
        }
        System.out.println(hasil);
    }
}

