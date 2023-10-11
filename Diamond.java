import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    double input;
    int i, j, as;
    int row = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number");
    input = scan.nextInt();
    double spaces = (input / 2);
    System.out.println(spaces);
    double uptomiddle = Math.ceil(spaces);
    int numberofasteriks = 1;
    double downtoend = input - uptomiddle;

    //Code for Odd
    //Top Half Odd
    if (input % 2 == 1){
      for (i = 0; i < uptomiddle; i++){
        for (j = 0; j < spaces - 1; j++){
          System.out.print(" ");
        }
        spaces--;
        row++;
        if (row == 1){
          System.out.print("*");
        }
        else{
          for(as = 0; as < numberofasteriks; as++)
            System.out.print("*");
        }
        for (j = 0; j < spaces; j++){
          System.out.print(" ");
        }
        numberofasteriks += 2;
        System.out.println();
        //Bottom Half Odd
      }
      numberofasteriks -= 2;
      for (i = 0; i < downtoend; i++){
        numberofasteriks -= 2;
        for (j = 0; j < spaces + 1; j++)
          System.out.print(" ");
        spaces++;
        row++;
        if (row == input){
          System.out.print("*");
        }
        else{
          for(as = 0; as < numberofasteriks; as++)
            System.out.print("*");
        }
        for (j = 0; j < spaces; j++){
          System.out.print(" ");
        }
        System.out.println();
      }
    }
    //Code for Even
    //Code for Top Half Even
    else{
      for (i = 0; i < uptomiddle; i++){
        for (j = 0; j < spaces - 1; j++)
          System.out.print(" ");
        spaces--;
        row++;
        if (row == 1){
          System.out.print(" *");
        }
        else{
          for (as = 0; as < numberofasteriks; as++)
            System.out.print(" *");
        }
        for (j = 0; j < spaces - 1; j++)
          System.out.print(" ");
        numberofasteriks += 1;
        System.out.println();
      }
      //Code for Bottom Half Even
      for (i = 0; i < downtoend)
    }

  }
}
