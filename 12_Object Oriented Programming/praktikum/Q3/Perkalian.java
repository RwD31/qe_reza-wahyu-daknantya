abstract class Kali{
    abstract int kali(int a, int b);
}

class Perkalian extends Kali{

    @Override
    int kali(int a, int b) {
        int Hasil;
        Hasil = a * b;
        return Hasil;
    }

}