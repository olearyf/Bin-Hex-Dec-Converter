public class Converter {

    int dec, binNum;
    String hex, bin;
    String binTemp, binFinal;

    public Converter(){

    }

    public String decToBin(int decimal){
        dec = decimal;
        binTemp = "";
        binFinal = "";
        if(dec>0) {
            while (dec > 0) {
                if (dec % 2 == 0) {
                    binTemp += "0";
                }
                if (dec % 2 == 1) {
                    binTemp += "1";
                }
                dec = dec / 2;
            }
        }
        else if(dec == 0){
            binTemp = "0";
        }
        else if(dec<0){
            //add in 2's complement
            //maybe in another method? have 2's for all?
            //read more about it

        }
        //add in space between quads?
        for(int i = binTemp.length()-1; i>=0; i--){
            binFinal += binTemp.charAt(i);
        }
        return binFinal;
    }

    public int binToDec(String binary){
        dec = 0;
        binTemp = "";
        for(int i = binary.length()-1;i>=0; i--){
            binTemp += binary.charAt(i);
        }
        for(int k = 0; k<binTemp.length();k++){
            if(binTemp.charAt(k) == '1'){
                dec += Math.pow(2, k);
            }
        }
        return dec;
    }

    /**public int hexToDec(String hexadecimal){
    }

    public String decToHex(int decimal){
        dec = decimal;
        return hex;
    }

    public String hexToBin(String hexadecimal){

    }

    public String binToHex(String binary){

    }
     **/
}
