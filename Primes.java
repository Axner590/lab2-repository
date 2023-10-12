public class Primes {
    public static void main(String[] args){
        for(int i = 2; i <= 100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    //This is the first change to the file. Just adding some commentary
    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
