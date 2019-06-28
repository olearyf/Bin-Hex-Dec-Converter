public class Converter {

    // note: add functionality for negatives
    //include in the gui error handling

    //initialize variables to be used by the methods
    int dec;
    String binTemp, binFinal, hexTemp;


    //converts decimal to binary
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

    //binary to decimal
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

    //hex to decimal
    public int hexToDec(String hexadecimal){
        dec = 0;
        hexTemp = "";
        for(int n = hexadecimal.length()-1;n>=0;n--){
            hexTemp += hexadecimal.charAt(n);
        }
        for(int i = 0; i<=hexTemp.length()-1; i++){
            if(Character.isDigit(hexTemp.charAt(i))){
                dec += Character.getNumericValue(hexTemp.charAt(i))*Math.pow(16,i);
            }
            if(Character.isLetter(hexTemp.charAt(i))){
                char c = hexTemp.charAt(i);
                switch(c){
                    case 'A':
                        dec += 10*Math.pow(16, i);
                        break;
                    case 'B':
                        dec += 11*Math.pow(16,i);
                        break;
                    case 'C':
                        dec += 12*Math.pow(16,i);
                        break;
                    case 'D':
                        dec+= 13*Math.pow(16,i);
                        break;
                    case 'E':
                        dec += 14*Math.pow(16,i);
                        break;
                    case 'F':
                        dec += 15*Math.pow(16,i);
                        break;
                }
            }
        }
        return dec;
    }

    //decimal to hex using other methods
    public String decToHex(int decimal){
        binTemp = decToBin(decimal);
        hexTemp = binToHex(binTemp);
        return hexTemp;
    }

    //hex to decimal using other methods
   public String hexToBin(String hexadecimal){
        int dec = hexToDec(hexadecimal);
        String binTemp = decToBin(dec);
        return binTemp;

    }

    //binary to hex
    public String binToHex(String binary){
        hexTemp = "";
        binTemp = binary;
        int templength = binary.length();
        if((binary.length()%4) != 0){
            for(int i = 0; i< 4-(templength%4); i++){
                binTemp = "0" + binTemp;
            }
        }
        int length = binTemp.length()/4;
        String[] quad = new String[length];
        int index = 0;
        if(length ==1){
            quad[0] = binTemp;
            if (binToDec(quad[0]) > 9) {
                switch (binToDec(quad[0])) {
                    case 10:
                        hexTemp = hexTemp + "A";
                        break;
                    case 11:
                        hexTemp = hexTemp + "B";
                        break;
                    case 12:
                        hexTemp = hexTemp + "C";
                        break;
                    case 13:
                        hexTemp = hexTemp + "D";
                        break;
                    case 14:
                        hexTemp = hexTemp + "E";
                        break;
                    case 15:
                        hexTemp = hexTemp + "F";
                        break;
                }
            } else {
                hexTemp = hexTemp + Integer.toString(binToDec(quad[0]));
            }
        }
        else {
            for (int i = 0; i < quad.length; i++) {
                quad[i] = binTemp.substring(index, index + 4);
                index += 4;
            }
            /*for(int i = 0; i<quad.length;i++){
                System.out.println(quad[i]);
            }*/

            for (int n = 0; n < quad.length; n++) {
                if (binToDec(quad[n]) > 9) {
                    switch (binToDec(quad[n])) {
                        case 10:
                            hexTemp = hexTemp + "A";
                            break;
                        case 11:
                            hexTemp = hexTemp + "B";
                            break;
                        case 12:
                            hexTemp = hexTemp + "C";
                            break;
                        case 13:
                            hexTemp = hexTemp + "D";
                            break;
                        case 14:
                            hexTemp = hexTemp + "E";
                            break;
                        case 15:
                            hexTemp = hexTemp + "F";
                            break;
                    }
                } else {
                    hexTemp = hexTemp + Integer.toString(binToDec(quad[n]));
                }

            }
        }
        return hexTemp;
    }

}
