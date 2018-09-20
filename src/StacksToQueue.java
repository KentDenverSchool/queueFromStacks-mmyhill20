/*
* StacksToQueue
* Purpose: The goal of StacksToQueue is
* Author/s: Morgan Myhill
* 9/19/18
* On My Honor: MM
* Collaborators:
*/
public class StacksToQueue {
 private Stack recentIn;
 private Stack nextOut;

 public StacksToQueue(){
     recentIn = new Stack();
     nextOut = new Stack();//nextOut is reverse of recentIn
 }

 //best/worst/average case: O(1)
 public void enqueue(Object use){
     recentIn.push(use);//will update nextOut only when needed (when requesting next out)
 }
//best case: O(1) worst case: O(n) average case: O(n)
 public Object dequeue(){//returns nextOut?
     if(nextOut.isEmpty()){
         transfer();
         return nextOut.pop();
     }else if(isEmpty()){
         System.out.println("Can't dequeue an empty stack");
         return null;
     }else{
         return nextOut.pop();
     }
 }

 //best/worst/average case: O(n)
 private void transfer(){
         while(recentIn.size() != 0){
             nextOut.push(recentIn.pop());
         }
 }

 public boolean isEmpty(){
     return (size() == 0);
 }

 public int size(){
     return recentIn.size() + nextOut.size();
 }

}
