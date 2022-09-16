public class Main {
    public static void main(String[] args) {
        Balok blk = new Balok(0,0,0);
        Kubus kbs = new Kubus();
        Tabung tbg = new Tabung(0, 0);

        blk.setPanjang(3);
        blk.setLebar(6);
        blk.setTinggi(10);
        kbs.setSisi(10);
        tbg.setR(7);
        tbg.setTinggi(10);

        System.out.println("VOLUME");
        System.out.println("Kubus : " + kbs.Volume());
        System.out.println("Balok : " + blk.Volume());
        System.out.println("Tabung : " + tbg.Volume());
    }
}
