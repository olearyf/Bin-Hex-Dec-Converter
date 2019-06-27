public class ConverterTester{

    public static void main(String args[]){
        Converter c = new Converter();
        //int[] values = {0, 1, 2, 5, 10, 20, 80, 100, 143, 255, 256};
        int[] values = {65, 97, 90, 122};
        System.out.println("Testing decimal to binary:");
        for(int i = 0; i<values.length;i++){
            System.out.println(values[i] + " = " + c.decToBin(values[i]));
        }
        String[] values2 = {"10101010", "0001", "1", "0", "111", "1000", "11111111", "10001000", "011002"};
        System.out.println("Testing binary to decimal:");
        for(int n = 0; n<values2.length; n++){
            System.out.println(values2[n] + " = " + c.binToDec(values2[n]));
        }
    }

}
