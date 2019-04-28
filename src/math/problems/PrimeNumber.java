package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 100000.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        //int i = 0;
        //int num =0;

        String primeNumbers = " ";
        for (int i = 2; i<=100000; i++){
            int counter = 0;
            for (int num =i;num>=1;num--){
                if (i%num==0){
                    counter = counter +1;
                }
            }
            if (counter ==2){
              primeNumbers = primeNumbers + i +" ";

            }
        }
        System.out.println("prime numbers for 2 to 100000 are : ");
        System.out.println(primeNumbers);


    }

}
