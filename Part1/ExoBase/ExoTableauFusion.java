package com.company.Part1.ExoBase;
import java.util.Arrays;

public class ExoTableauFusion {
    public static void main(String[] args){
        int[] Array1 = {5,16,1,4};
        int[] Array2 = {50,16,72,28,49};
        int lenArray1 = Array1.length;
        int lenArray2 = Array2.length;
        int[] concate = new int[lenArray1 + lenArray2];
        System.arraycopy(Array1, 0, concate, 0, lenArray1);
        System.arraycopy(Array2, 0, concate, lenArray1, lenArray2);
        Arrays.sort(concate);
        System.out.println("concatenated Array"+ Arrays.toString(concate));

    }
}
