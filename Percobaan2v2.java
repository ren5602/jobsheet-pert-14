import java.util.Scanner;
public class Percobaan2v2 {
    static int hitungPangkat(int x, int y){
        if (y == 0){
            return 1;
        }else{
            System.out.print(x);
            if (y > 1){
                System.out.print("x");
            }
            return x * hitungPangkat(x, y-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("pangkat: ");
        int pangkat = sc.nextInt();
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = "+hasil);
    }
}
