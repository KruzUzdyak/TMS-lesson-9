package repeat.arrays;

import java.util.Arrays;

public class StringArray {

    public static void main(String[] args) {
        String[] string1 = new String[5];
        string1[0] = "a0";
        string1[1] = "b1"; // remove
        string1[2] = "c2";
        string1[3] = "d3"; // remove
        string1[4] = "f4";

        System.out.println(Arrays.toString(string1));

        // code
        int count = 0;

        for (int  index=0; index  < string1.length; index++) {
            String arrayElem = string1[index];
            if (!arrayElem.equals("b1") && !arrayElem.equals("d3")){
                count++;
            }
        }

        String[] string2 = new String[count];
        int index = 0;
        for (int i=0; i< string1.length; i++) {
            String arrayElem = string1[i];
            if (!arrayElem.equals("b1") && !arrayElem.equals("d3")){
                string2[index] = arrayElem;
                index++;
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(string2));

//        String stringAt1 = string1[1];
//        String stringAt2 = string1[2];
//        String stringAt3 = string1[3];
//        String stringAt4 = string1[4];

    }
}
