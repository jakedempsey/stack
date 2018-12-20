import java.util.Scanner;

public class myFirstStack {

   public static void main(String[] args) {
      //create a new array
      Stack makeArray = new Stack();
      Scanner in = new Scanner(System.in);
      System.out.println("Enter numbers. Type zero when finished: ");
      int addUp = 0;

      //fill the array with values. Stops when 0 is entered
      for (int i = 1;i != 0;) {
         i = in.nextInt();
         makeArray.Push(i);
      }
      //go through array in reverse and add all up (addUp)
      for (;!(makeArray.emptyStack());){
         addUp += makeArray.Pop();
      }
      System.out.println(addUp);
   }
}

class Stack{
   private int top = 0;
   int array[] = new int[10];


   public void Push(int num){
      if (fullStack()){
         System.out.println("Stack is full");
         this.stackOverflow();
      }
      else array[top++] = num;
   }
   public int Pop(){
      if (emptyStack()){
         System.out.println("Stack is empty");
         this.stackUnderflow();
      }
         return array[--top];


   }
   public boolean emptyStack(){
      return top == 0;
   }
   public boolean fullStack(){
      return top == 10;
   }
   public void stackOverflow(){
      System.exit(0);
   }
   public void stackUnderflow(){
      System.exit(0);
   }
   public int getTop(){
      return array[top-1];
   }
}