package Main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[3];

        try{
            for (int i = 0; i < 4; i++){
                numeros[i] = i;
            }
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }


}
