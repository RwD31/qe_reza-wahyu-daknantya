abstract class Kurang{
    abstract int kurang(int a, int b);
}

class Pengurangan extends Kurang{

    @Override
    int kurang(int a, int b) {
        int Hasil;
        Hasil = a - b;
        return Hasil;
    }
    
}