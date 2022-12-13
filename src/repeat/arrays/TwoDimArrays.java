package repeat.arrays;

import java.util.Arrays;

public class TwoDimArrays {

    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"00", "01", "02"},
                {"10", "11", "12"},
                {"20", "21", "22"}};

        int[] rowLength = new int[] {0, 0, 0};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                String elemArray = arr1[i][j];
                if (!elemArray.equals("00") && !elemArray.equals("11")) {
                    rowLength[i]++;
                }
            }
        }

        System.out.println(Arrays.toString(rowLength));

        String[][] arr2 = new String[arr1.length][];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println();
            System.out.println(Arrays.toString(arr2[i]));

            int length = rowLength[i];
            arr2[i] = new String[length];

            System.out.println();
            System.out.println(Arrays.toString(arr2[i]));
        }

        for (int i = 0; i < arr1.length; i++) {
            int count = 0;
            for (int j = 0; j < arr1[i].length; j++) {
                String elemArray = arr1[i][j];
                if (!elemArray.equals("00") && !elemArray.equals("11")) {
                    arr2[i][count] = elemArray;
                    count++;
                }
            }

        }
        System.out.println();
        for (String[] print : arr2){
            System.out.println(Arrays.toString(print));
        }
    }
}
