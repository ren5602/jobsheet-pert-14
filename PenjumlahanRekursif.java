import java.util.Scanner;
public class PenjumlahanRekursif {
    // Fungsi Rekursif
    static int penjumlahanRekursif(int n) {

        if (n == 1) {
            System.out.print("1");
            return 1;
        }else{
            int hasil = n + penjumlahanRekursif(n - 1);
            System.out.print(" + " + n);
            return hasil;
        }
    }
    // Fungsi Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input nilai
        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        // Memanggil fungsi rekursif
        int hasilPenjumlahan = penjumlahanRekursif(n);
        System.out.println(" = " + hasilPenjumlahan);

        sc.close();
    }
}
