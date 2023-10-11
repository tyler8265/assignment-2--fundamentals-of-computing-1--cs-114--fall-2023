import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    double input, spaces, downToEnd, upToMiddle;
    int i, j, as, numberOfAsteriks;
    int row = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number "); //Requests any number from the user
    input = scan.nextInt();
    spaces = (input / 2); //Finds Number of Spaces
    upToMiddle = Math.ceil(spaces);
    numberOfAsteriks = 1;
    downToEnd = input - upToMiddle;

    //Code for Odd
    //Top Half Odd
    if (input % 2 == 1){
      for (i = 0; i < upToMiddle; i++){
        for (j = 0; j < spaces - 1; j++){
          System.out.print(" ");
        }
        spaces--;
        row++;
        if (row == 1){
          System.out.print("*");
        }
        else{
          for(as = 0; as < numberOfAsteriks; as++)
            System.out.print("*");
        }
        for (j = 0; j < spaces; j++){
          System.out.print(" ");
        }
        numberOfAsteriks += 2;
        System.out.println();
        //Bottom Half Odd
      }
      numberOfAsteriks -= 2;
      for (i = 0; i < downToEnd; i++){
        numberOfAsteriks -= 2;
        for (j = 0; j < spaces + 1; j++)
          System.out.print(" ");
        spaces++;
        row++;
        if (row == input){
          System.out.print("*");
        }
        else{
          for(as = 0; as < numberOfAsteriks; as++)
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
      for (i = 0; i < upToMiddle; i++){
        for (j = 0; j < spaces - 1; j++)
          System.out.print(" ");
        spaces--;
        row++;
        if (row == 1){
          System.out.print(" *");
        }
        else{
          for (as = 0; as < numberOfAsteriks; as++)
            System.out.print(" *");
        }
        for (j = 0; j < spaces - 1; j++)
          System.out.print(" ");
        numberOfAsteriks += 1;
        System.out.println();
      }
      //Code for Bottom Half Even
      numberOfAsteriks -= 1;
      for (i = 0; i < downToEnd; i++){
        numberOfAsteriks -= 1;
        for (j = 0; j < spaces + 1; j++)
          System.out.print(" ");
        spaces++;
        row++;
        for(as = 0; as < numberOfAsteriks; as++)
          System.out.print(" *");
        for (j = 0; j < spaces; j++){
          System.out.print(" ");
        }
        System.out.println();
      }
    }
    scan.close();
  }
}
