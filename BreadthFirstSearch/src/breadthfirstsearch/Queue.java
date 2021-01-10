/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadthfirstsearch;

/**
 *
 * @author ziead
 */
public class Queue<T>{
    QNode front ,rear;
   
   boolean IsEmpty(){
       return front==null;
   }
   void Enqueue(T data){
       QNode<T>n=new QNode<T>(data);
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
   boolean searchValue(T value){
       boolean f =false;
       T var;
       Queue<T> temp= new Queue <T>();
       while(!IsEmpty()){
           var=Dequeue();
           temp.Enqueue(var);
           if(var==value)
              f=true;
       }
       while(!temp.IsEmpty()){
           Enqueue(temp.Dequeue());
       }
       return f;
       
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
