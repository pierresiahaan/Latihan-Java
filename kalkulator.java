import java.util.Scanner;

class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        System.out.println("Hai aku adalah Kalkulator") ;

        System.out.print("Masukkan angka : ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan operasi (+, -, *, /) :");
        char operasi = input.next().charAt(0);

        System.out.print("Masukkan angka :");
        double angka2 = input.nextDouble();

        double hasil = 0;

        switch (operasi) {
            case '+' :
               hasil = angka1 + angka2;
               break;
            case '-' :
               hasil = angka1 - angka2;
               break;
            case '*' :
                hasil = angka1 * angka2;
                break;
            case '/' :
                hasil = angka1 / angka2;
                break;
            default:
            System.out.println("Operasi yang dimasukkan tidak valid.");
            return;
        }

        System.out.println("Hasilnya adalah :" + hasil);
        System.out.println("Selamat mencoba lagi :)");
    }

}

