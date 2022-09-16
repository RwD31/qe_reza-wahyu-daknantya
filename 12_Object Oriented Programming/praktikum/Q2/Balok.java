public class Balok {
    private int panjang;
    private int lebar;
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi){
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
    }

    public int getPanjang() {
        return panjang;
    }
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    
    public int getLebar() {
        return lebar;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int Volume(){
        int Hasil;
        int Panjang = getPanjang();
        int Lebar = getLebar();
        int Tinggi = getTinggi();
        Hasil = Panjang * Lebar * Tinggi;
        return Hasil;
    }
    
}
