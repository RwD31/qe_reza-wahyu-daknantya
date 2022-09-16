public class Tabung {
    private double r;
    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    private double tinggi;

    public Tabung(double r, double tinggi){
        this.r = 0;
        this.tinggi = 0;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double Volume(){
        double Hasil;
        double phi = 3.14;
        double R = getR();
        double LuasAlas = phi * R * R;
        double Tinggi = getTinggi();
        Hasil = LuasAlas * Tinggi;
        return Hasil;
    }
}
