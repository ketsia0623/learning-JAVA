public class upper {
    public static void main(String[] args) {

        args = new String[]{"hello", "world", "java"};

        for (String arg : args) {
            System.out.println(arg.toUpperCase() + " ");
        }
    }
}
