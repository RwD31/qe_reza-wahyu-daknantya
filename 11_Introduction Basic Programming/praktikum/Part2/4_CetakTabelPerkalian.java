public class TabelPerkalian {
    
    public static void cetakTabelPerkalian(int n){
        for (int i = 1; i <= n; i++) {
 
            for(int j = 1; j <= n; j++){
 
                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        cetakTabelPerkalian(9);
        System.out.println();
        cetakTabelPerkalian(3);
    }
}
