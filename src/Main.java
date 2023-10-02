import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

//Algorithm
// 1. get limit from user
// 2. create an array with size of limit
// 3. create a function to get a number from console
// 4. using loop, assign values to array with created function
// 5. sorting
// 6. print

public class Main {

    public static void main(String[] args) {
        System.out.println("enter the limit");
        Scanner sc=new Scanner(System.in);
        int limit= sc.nextInt();
        int[] apple ;
        apple=new int[limit];
        for(int i=0;i<limit;i++){
            apple[i]=getInput();
        }

        for (int i=0;i<limit;i++){
            System.out.println(apple[i]);
        }



    }
static int getInput(){
        //1. print message to console

    Scanner sc=new Scanner(System.in);
    //2. create scanner object
    //3. get input from scanner
    //4. return the value
    System.out.println("enter the no to array to position ");
    int limit= sc.nextInt();
    return limit;
}
}