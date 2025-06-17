public class loops {
    public static void main(String[] args) {
        int[] numbersArray = {8, 4, 12, 20, 42};        // numbers that i will be iterating through
        System.out.println(numbersArray.length);
       
        // for loop 
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }

        // for each(enhanced for) loop
        for (int numElement : numbersArray) {
            System.out.println(numElement);
        }

        // while loop
        int i = 0;
        while (i < numbersArray.length) {
            System.out.println(numbersArray[i]);
            i++;
        }

        // do-while loop
        int j = 0;
        do {
            System.out.println(numbersArray[j]);
            j++;
        } while(j < numbersArray.length);

    }
}
