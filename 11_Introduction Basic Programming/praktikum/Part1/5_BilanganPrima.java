public class BilanganPrima {
    
    /**
     * primenumber
     */
    public static boolean primenumber(int number) {
        int i;
        int check = 0;
        for (i = 2; i <= number; i++){
            if (number % i == 0){
                check++;
            }
            break; 
        }
        
        if (check == 1){
            System.out.print(number + " ");
            return true;
        }else {
           System.out.print(number + " ");
           return false;
        } 
    }


    public static void main(String[] args) {
        System.out.println(primenumber(11));
        System.out.println(primenumber(13));
        System.out.println(primenumber(17));
        System.out.println(primenumber(20));
        System.out.println(primenumber(35));
    }
}
