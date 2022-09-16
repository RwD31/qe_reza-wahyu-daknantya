public class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(){
        this.alas = 0;
        this.tinggi = 0;
    }

    public double getAlas() {
        return alas;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double Keliling(){
        double Hasil;
        double Alas = this.getAlas();
        Hasil = Alas * 3;
        return Hasil;
    }

    public double Luas(){
        double Hasil;
        double Alas = this.getAlas();
        double Tinggi = this.getTinggi();
        Hasil = (0.5) * Alas  * Tinggi;
        return Hasil;
    }
}
