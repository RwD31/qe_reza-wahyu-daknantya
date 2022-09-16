public class Persegi {
    private int sisi;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int Keliling(){
        int Hasil;
        int Sisi = getSisi();
        Hasil = 4 * Sisi;
        return Hasil;
    }

    public int Luas(){
        int Hasil;
        int Sisi = getSisi();
        Hasil = Sisi * Sisi;
        return Hasil;
    }
}
