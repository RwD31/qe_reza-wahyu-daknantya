public class Main {
    public static void main(String[] args) {
        Penjumlahan jml = new Penjumlahan();
        Pengurangan krg = new Pengurangan();
        Perkalian kl = new Perkalian();
        Pembagian bg = new Pembagian();

        System.out.println("Penjumlahan : " + jml.jumlah(3, 4));
        System.out.println("Pengurangan : " + krg.kurang(15, 4));
        System.out.println("Perkalian : " + kl.kali(10, 10));
        System.out.println("Pembagian : " + bg.bagi(12, 3));
    }

}
