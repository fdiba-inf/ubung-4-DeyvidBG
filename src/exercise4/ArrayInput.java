package exercise4;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int length = input.nextInt();
    int[] array = new int[length];

    for(int i = 0; i < length; i++) {
      array[i] = input.nextInt();
    }

    for(int i = 0; i < array.length; i++) {
      System.out.println(array[i]);
    }
  }
}

      