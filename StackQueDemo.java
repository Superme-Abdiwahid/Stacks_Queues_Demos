import java.util.*;
public class StackQueDemo{
   public static void main(String[] args){
      Queue<String> que = new LinkedList<>();
      que.add("Abdiwahid");
      que.add("Demo");
      que.add("James");
      que.add("ILOVELOVELOVE");
      que.add("JavaAPI");
      String longest = highestString(que);
      System.out.println("The longest word in the que was " + longest);
      Stack<String> s = FromQueuetoStack(que);
      System.out.println(s);
      Stack<Integer> S = new Stack<>();
      S.add(1);
      S.add(2);
      S.add(5);
      S.add(4);
      S.add(8);
      S.add(9);
      System.out.println("Stack S is orginally " + S);
      Queue<Integer> Q = new LinkedList<>();
      Q.add(10);
      Q.add(4);
      Q.add(3);
      Q.add(5);
      Q.add(12);
      Q.add(100);
      System.out.println("Queue Q is orginally " + Q);
      removeEvens(S, Q);
      System.out.println("After calling remove Evens stack = " +  S);
      System.out.println("After calling remove Evens Q = " + Q);
   }
   
   /* Write a method highestString that takes a Queue 
   of strings as a parameter and returns 
   the highest length of the 
   longest string in the queue. */
   
   public static String highestString(Queue<String> q){
      String result = "";
      while(!q.isEmpty()){
         String output = q.remove();
         if(output.length() > result.length()){
            result = q.remove();
         }
      }
      return result;
   
   }
   
   /* Write a method FromQueuetoStack that takes a Queue of
   Strings as a parameter and adds each element of the 
   que into a new stack return this new stack.
   Think about what this does of the ordering*/
   public static Stack<String> FromQueuetoStack(Queue<String> q){
      Stack<String> stack = new Stack<>();
      while(!q.isEmpty()){
         String remove = q.remove();
         stack.push(remove);
      }
      return stack;
   }
   
   /* Write a method removeEvens that takes 
   A stack and Que of interegs and removes both
   even numbers from both structures.*/
   public static void removeEvens(Stack<Integer> s, Queue<Integer> q){
      Stack<Integer> stackEvens = new Stack<>();
      Stack<Integer> stackOdds = new Stack<>();
      Queue<Integer> queEvens = new LinkedList<>();
      Queue<Integer> queOdds = new LinkedList<>();
      while(!s.isEmpty()){
         int remove = s.pop();
         if(remove % 2 == 0){
            stackEvens.add(remove);
         }else{
            stackOdds.add(remove);
         }
      }
      while(!q.isEmpty()){
         int remove = q.remove();
         if(remove % 2 == 0){
            queEvens.add(remove);
         }else{
            queOdds.add(remove);
         }
      }
      
      while(!stackOdds.isEmpty()){
         int remove = stackOdds.pop();
         s.push(remove);
         
      }
      while(!queOdds.isEmpty()){
         int remove = queOdds.remove();
         q.add(remove);
         
      }
   }



}
