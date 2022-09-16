public class Main{
    public static void main(String[] args) {
        Segitiga sgt = new Segitiga();
        Persegi p = new Persegi();
        PersegiPanjang psp = new PersegiPanjang();

        sgt.setAlas(3);
        sgt.setTinggi(4);
        p.setSisi(4);
        psp.setPanjang(7);
        psp.setLebar(8);

        System.out.println("KELILING");
        System.out.println("Persegi : " + p.Keliling());
        System.out.println("Segitiga : " + sgt.Keliling());
        System.out.println("Persegi Panjang : " + psp.Keliling());

        System.out.println("LUAS");
        System.out.println("Persegi : " + p.Luas());
        System.out.println("Segitiga : " + sgt.Luas());
        System.out.println("Persegi Panjang : " + psp.Luas());
    }
}