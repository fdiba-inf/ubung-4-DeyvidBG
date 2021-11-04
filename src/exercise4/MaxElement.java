package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int length = input.nextInt();
    int[] array = new int[length];

    for(int i = 0; i < length; i++) {
      array[i] = input.nextInt();
    }

    int max = -99999;

    for(int i = 0; i < array.length; i++) {
      if(array[i] > max) {
        max = array[i];
      }
    }

    System.out.println("Max number: " + max);

  }
}

      