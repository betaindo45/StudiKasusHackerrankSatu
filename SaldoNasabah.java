import java.util.Scanner;

public class SaldoNasabah {
    private static final Scanner inp = new Scanner(System.in);
    public static void main(String[] args) {
        long Saldo = inp.nextLong();
        long inputSetoran = inp.nextLong();

        double totalSaldo = hitungBulanan(Saldo,inputSetoran);
        System.out.printf("%.1f\n", totalSaldo);
    }
    public static double hitungBulanan(long Saldo,long inputSetoran){
        long totalSaldoAwal = Saldo+inputSetoran;
        totalSaldoAwal -= 7000;

        return totalSaldoAwal + (totalSaldoAwal*(0.05/100));
    }
}

