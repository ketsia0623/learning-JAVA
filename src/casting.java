
public class casting {
    static int num1;           //doesn't have to be initialized ince its a class variable

        public static void main(String[] args) {
            System.out.println(num1);

            float num2 = num1 * 2;          //has to be initialized since its a local var, widening casting
            System.out.println(num2);

            short num3 = (short) ((short) num2 + 80);      //narrowing casting, uses the cast operator
            System.out.println(num3);

            char letter = (char) num3;          //narrowing casting, uses the cast operator
            System.out.println(letter);
            
    }
}
