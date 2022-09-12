import java.util.Scanner;

public class FaktorBilangan {
    public static void main(String[] args) {

        int bilangan;

        try (Scanner a = new Scanner(System. in )) {
            System.out.println("Masukkan angka");
            bilangan = a.nextInt();
            System.out.println("Faktor-faktornya:");
            int kurang = 0;
            for (int z = 0; z <= bilangan; z++) {
                kurang--;
                    if (bilangan % kurang == 0) {
                        int y;
                        for ( y = kurang; y >= 1; y--) {
                            kurang--;
                        System.out.print(kurang + " " );
                        }
                    }
                
            }
        }
    }
}
