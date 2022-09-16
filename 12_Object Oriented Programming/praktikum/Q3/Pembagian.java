abstract class Bagi{
    abstract int bagi(int a, int b);
}

class Pembagian extends Bagi{

    @Override
    int bagi(int a, int b) {
        int Hasil;
        Hasil = a / b;
        return Hasil;
    }

}