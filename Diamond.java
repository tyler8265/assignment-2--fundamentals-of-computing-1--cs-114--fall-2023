import java.util.Scanner;

public class Diamond {
  public static void main(String[] args) {
    double input, spaces, downToEnd, upToMiddle, countUp, countDown;
    int i, j, as, numberOfAsteriks;
    int row = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number "); //Requests any number from the user
    input = scan.nextInt();
    countUp = (input / 2) + 1;
    countDown = countUp - 1;

    //Code for Odd
    //Top Half Odd
    if (input % 2 == 1){
      numberOfAsteriks = 1;
      spaces = (input / 2); //Finds Number of Spaces
      upToMiddle = Math.ceil(spaces); //Gets the number of rows up until the halfway point
      numberOfAsteriks = 1;
      downToEnd = input - upToMiddle; //Gets the number of rows from the halfway point to the end.
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
      System.out.println();
    }
    //Code for Even
    //Code for Top Half Even
    else{
      numberOfAsteriks = 0;
      spaces = input - 1;
      for (i = 0; i < countUp; i++){
        for(j = 0; j < spaces; j++)
          System.out.print(" ");
        row++;
        if (row == 1){
          spaces--;
          System.out.print("   *");
        }
        else if (row == 2){
          spaces--;
          System.out.print("   * *");
        }
        else{
          spaces -= 2;
          System.out.print(" ");
          for (as = 0; as < numberOfAsteriks; as++)
            System.out.print(" *");
        }
        numberOfAsteriks += 2;
        System.out.println();
      }
      //Code for Bottom
      numberOfAsteriks -= 4;
      spaces += 4;
      for (i = 0; i < countDown; i++){
        for (j = 0; j < spaces; j++)
          System.out.print(" ");
        row++;
        if (row == input + 1){
          spaces--;
          System.out.print("    *");
        }
        else if(row == input){
          spaces--;
          System.out.print("  * *");
        }
        else{
          spaces += 2;
          System.out.print(" ");
          for (as = 0; as < numberOfAsteriks; as++)
            System.out.print(" *");
        }
        numberOfAsteriks -= 2;
        System.out.println();
      }
      System.out.println();
    scan.close();
  }
}
}
