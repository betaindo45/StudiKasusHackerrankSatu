import java.util.Scanner;

public class SuratKaisar {
    private static final Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        String input = inp.nextLine();
        int geser = inp.nextInt();
        System.out.println(sandiEncrypt(input,geser));
    }
    public static String sandiEncrypt(String kalimat, int input){
        char[] encoded = new char[kalimat.length()];
        String kalimat2 = kalimat.toLowerCase();
        for (int i = 0; i < kalimat.length(); i++) {
            encoded[i] = kalimat2.charAt(i);
        }
        int[] ASCII =  new int[kalimat.length()];
        for (int i = 0; i < kalimat.length(); i++) {
            if (encoded[i] + input > 122){
                ASCII[i] = 97 + input;
            }else{
                ASCII[i] = encoded[i] + input;
            }
        }
        char[] hasil = new char[kalimat.length()];
        for (int i = 0; i < kalimat.length(); i++) {
            hasil[i] = (char)ASCII[i];
        }
        String hasilFinal = "";
        for (int i = 0; i < kalimat.length(); i++) {
            if(kalimat.charAt(i) <= 90){
                hasilFinal += hasil[i];
                hasilFinal = hasilFinal.toUpperCase();
                hasilFinal.replaceAll("null","");
            }else{
                hasilFinal += hasil[i];
            }
        }
        return hasilFinal;
    }
}

