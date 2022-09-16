abstract class Jumlah{
    abstract int jumlah(int a, int b);
}

class Penjumlahan extends Jumlah{

    @Override
    int jumlah(int a, int b) {
        int Hasil;
        Hasil = a +b;
        return Hasil;
    }
    
}