public class UbahHuruf {
    
    private static void ubahHuruf(String s){
        String hasil = "";
        int jumlah = s.length();
        int jumlahHuruf = jumlah - 1;

        for (int i = 0; i < jumlah; i++) {
            hasil = hasil + s.charAt(jumlahHuruf);
            jumlahHuruf--;
        }

        System.out.println(hasil);
    }
    
    public static void main(String[] args) {
        ubahHuruf("SEPULSA OKE");
        ubahHuruf("ALTERRA ACADEMY");
        ubahHuruf("INDONESIA");
        ubahHuruf("GOLANG");
        ubahHuruf("PROGRAMMER");
    }
}
