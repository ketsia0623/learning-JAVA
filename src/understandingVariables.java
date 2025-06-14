public class understandingVariables {

    int int1 = 0;
    int int2 = 0;

    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data();

        data1.value = 0;
        data2.value = 0;

        understandingVariables uv = new understandingVariables();

        System.out.println(uv.int1 == uv.int2); // true
        System.out.println(data1 == data2);     // false (different objects)
        System.out.println(data1.value == data2.value); // true (same int value)
    }
}