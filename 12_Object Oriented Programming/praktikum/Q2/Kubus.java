public class Kubus{
    private int sisi;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int Volume(){
        int Hasil;
        int Sisi = getSisi();
        Hasil = Sisi * Sisi * Sisi;
        return Hasil;
    }
}