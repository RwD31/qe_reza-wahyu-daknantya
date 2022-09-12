import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {

        int bilangan;

        try (Scanner a = new Scanner(System. in )) {
            System.out.println("Masukkan angka");
            bilangan = a.nextInt();
            System.out.println("Faktor-faktornya:");
            int tambah = 0;
            for (int z = 0; z <= bilangan; z++) {
                tambah++;
                if (bilangan % tambah == 0) {
                    System.out.print(tambah + " " );
                }
            }
        }
    }
}
