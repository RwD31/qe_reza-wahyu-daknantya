public class PersegiPanjang{
    private double panjang;
    private double lebar;

    public PersegiPanjang(){
        this.panjang = 0;
        this.lebar = 0;
    }

    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double Keliling(){
        double Hasil;
        double Panjang = getPanjang();
        double Lebar = getLebar();
        Hasil = Panjang * 2 + Lebar * 2;
        return Hasil;
    }

    public double Luas(){
        double Hasil;
        double Panjang = getPanjang();
        double Lebar = getLebar();
        Hasil = Panjang * Lebar;
        return Hasil;
    }
}