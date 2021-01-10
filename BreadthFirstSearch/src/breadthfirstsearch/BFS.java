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
public class BFS {
   //************************************** Original Code   
    Queue bfs(int data,Node root){
       Queue<Node>q=new Queue<Node>();
        Queue<Integer>explored=new Queue<Integer>();
       
       Node temp= root;
       q.Enqueue(temp);
       
        while(!q.IsEmpty()){
         temp=q.Dequeue();  
         if(temp!=null){
          int value =temp.data;
           explored.Enqueue(value);
           
           if(value==data){
               System.out.println("Value is found");
               return explored;
           }
           
           if(explored.searchValue(value)){
               q.Enqueue(temp.left);
               q.Enqueue(temp.right);
           }
           
         }
         continue; 
           
        }
           return explored;
      
          }
     //**************************************************  
    
}
