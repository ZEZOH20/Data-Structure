/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	 Queue<Integer> q =new Queue<Integer>();
		
		q.Enqueue(1);
		q.Enqueue(2);
		q.Enqueue(3);
		q.Enqueue(4);

             q.reverse();
	     q.print();
}

}
class Node<T>{
   T data;
   Node next ;
   Node(T data){
      this.data=data;
      next=null;
   }
}

class Queue<T>{
    Node front ,rear;
   
   boolean IsEmpty(){
       return front==null;
   }
   void Enqueue(T data){
       Node<T>n=new Node<T>(data);
       if(IsEmpty()){
           front=rear=n;
       }
       else{
             rear.next=n;
             rear=n;
       }
   }
  <T> T Dequeue(){
         T data ; 
         if(front==rear){
            data=(T)front.data;
             front=rear=null;
             return data;
         }
         else{
           data=(T)front.data;
           front=front.next;
           return data;
             
         }
         
   }

   
   void reverse(){
       
       if(front==null)
        return;
        
       T value=Dequeue();
       
       reverse();
       
       Enqueue(value);
   
   }
  
  
   void print(){
       
     Queue<T>temp=new Queue<T>();
     T data ;
     while(!IsEmpty()){
       data =Dequeue();
       temp.Enqueue(data);
       System.out.print(data +" ");
     }
    while(!temp.IsEmpty()){
        Enqueue(temp.Dequeue());
    } 
     
  }
  
}



