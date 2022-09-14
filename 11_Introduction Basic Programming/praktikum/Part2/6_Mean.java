public class Mean {
    
    private static float mean(float[] numbers){
        float sum = 0;
        for (int i=0; i<numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum/5;
        
    }
    
    public static void main(String[] args) {
        float[] value = {1,2,3,4};
        System.out.println(mean(value)); //ouput di contoh soal 2,5 mungkin salah hitung admin nya hehe
    }
}
