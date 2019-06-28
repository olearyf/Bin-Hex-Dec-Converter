public class ConverterTester{

    //test class for each method in the Converter class
    public Converter c = new Converter();
    public static int[] decvalues = {0, 1, 2, 5, 10, 20, 80, 100, 143, 255, 256,65, 97, 90, 122};
    public static String[] binvalues = {"10101010", "0001", "1", "0", "111", "1000", "11111111", "10001000", "011002"};
    public static String[] hexvalues = {"1", "2", "24", "134", "09", "AF", "7F", "E3", "CCC", "0000", "34B0"};

    public void testDecToBin(int[] values){
        System.out.println("Testing decimal to binary:");
        for(int i = 0; i<values.length;i++){
            System.out.println(values[i] + " = " + c.decToBin(values[i]));
        }
    }

    public void testBinToDec(String[] values2){
        System.out.println("Testing binary to decimal:");
        for(int n = 0; n<values2.length; n++){
            System.out.println(values2[n] + " = " + c.binToDec(values2[n]));
        }
    }

    public void testHexToDec(String[] values3){
        System.out.println("Testing hexadecimal to decimal:");
        for(int k = 0; k<values3.length; k++){
            System.out.println(values3[k] + " = " + c.hexToDec(values3[k]));
        }
    }
    public void testDecToHex(int[] values4){
        System.out.println("Testing decimal to hexadecimal:");
        for(int k = 0; k<values4.length; k++){
            System.out.println(values4[k] + " = " + c.decToHex(values4[k]));
        }
    }

    public void testBinToHex(String[] values5){
            System.out.println("Testing binary to hexadecimal:");
        for(int k = 0; k<values5.length; k++){
            System.out.println(values5[k] + " = " + c.binToHex(values5[k]));
        }
    }

    public void testHexToBin(String[] values6){
        System.out.println("Testing hexadecimal to binary:");
        for(int k = 0; k<values6.length; k++){
            System.out.println(values6[k] + " = " + c.hexToBin(values6[k]));
        }
    }

    public static void main(String args[]){
        ConverterTester ct = new ConverterTester();
        ct.testDecToBin(decvalues);
        ct.testBinToDec(binvalues);
        ct.testHexToDec(hexvalues);
        ct.testDecToHex(decvalues);
        ct.testBinToHex(binvalues);
        ct.testHexToBin(hexvalues);

    }

}
