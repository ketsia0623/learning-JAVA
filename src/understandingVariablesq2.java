


public class understandingVariablesq2 {
    
    

    public static void main(String[] args) {
        Data data1 = new Data();     //object reference v 
        Data data2 = data1;          // primitive       // value of data1(not address) **whenever data1 changes, data2 updates to that value

        int int1 = 0;           // primitive
        int int2 = int1;        // primitive        // value of data1(not address)

        data1.value = 1;            // data2 also becomes 1
        int1 = 1;                   // int2 stays 0, can't update its value

        System.out.println(data2.value);        // 1
        System.out.println(int2);               // 0
        System.out.println(int1);   
    }


}
