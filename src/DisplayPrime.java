import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong so nguyen to muon in ra: ");
        int n = sc.nextInt();
        System.out.printf("%d so nguyen to dau tien la: \n", n);
        int cout = 0; // dem so so nguyen to.
        int i = 2;
        while (cout < n){
            if (isPrimeNumber(i)){
                System.out.print(i + " ");
                cout++;
            }
            i++;
        }
    }
    // check so nguyen to.
    public static boolean isPrimeNumber(int n){
        if (n < 2) {
            return false;
        }
        int squareRoot = (int)Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
