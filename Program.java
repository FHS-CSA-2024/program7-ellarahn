import java.util.Scanner;
public class program7{
public static void main (String[] args) {
     
    Scanner input = new Scanner(System.in);
      System.out.println("Klevins: ");
      String inputKlevins = input.nextLine();
      
      System.out.println ("SchruteBucks ");
      String inputSchruteBucks = input.nextLine();
      
      System.out.println ("StanlyNickles: ");
      String inputStanlyNickles = input.nextLine();
      
      double SchruteBucks = Double.valueOf(inputSchruteBucks);
      double Klevins = Double.valueOf(inputKlevins);
      double StanlyNickles = Double.valueOf(inputStanlyNickles);
      

      
      double total = SchruteBucks + Klevins /20 + StanlyNickles / 240;
      double endtotal = Math.round(total/100)/100;
      
      System.out.println("New Balance istotal is ");
      System.out.print ("total- ");
      System.out.format ("%.2f",total);
      System.out.println("");
  
      
      }

}
    

