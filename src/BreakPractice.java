public class BreakPractice {
    public static void main(String[] args) {
        int i, j;
    //newloop: for (i = 1; i < 4; i++) {
    for (i = 1; i < 4; i++) {
        j = 1;
        while (j < 4) {
            if (j % 2 == 0) {
                //break newloop;      // exits the outer for-loop entirely
                break;
            }
            j++;
            System.out.println("inner");
        }
        System.out.println("outer");
    }

    }
}
