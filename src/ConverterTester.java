public class ConverterTester{

    public static void main(String args[]){
        Converter c = new Converter();
        int[] values = {0, 1, 2, 5, 10, 20, 80, 100, 143, 255, 256};
        for(int i = 0; i<values.length;i++){
            System.out.println(values[i] + " = " + c.decToBin(values[i]));
        }
    }

}
