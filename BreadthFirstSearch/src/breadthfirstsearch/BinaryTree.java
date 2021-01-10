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
public class BinaryTree {
   
    Node root;
    
    BinaryTree(int value){
       Node n=new Node(value);
       root=n;
    }
   
   
   void insert(int value,Node root){
       
          Node temp=root;
          if(value<temp.data){
                
              if(temp.left==null) { //left Not found *** you don't need Transfer Insert in your place
                temp.left =new Node(value); // left refernce on new node
              } else {// you need Transfer until reach to leave
                insert(value,temp.left);  
              }
              
            }else if(value>temp.data){
                
               if(temp.right==null) { //right Not found *** you don't need Transfer Insert in your place
                temp.right =new Node(value); // right refernce on new node
              } else {// you need Transfer until reach to leave
                 insert(value,temp.right);  
              } 
              
            }
            
       }
       
       void insert(int value){ //Overloading
           int x=value;
           insert(value,root);
       }

         int count(Node root){
           Node temp=root;
           
           if(root==null)
            return 0;
           
           return 1+count(temp.left)+count(temp.right);
       }
       
  //************************************** Original Code 
   Queue BFS(int data,Node root){
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
 
     void printInOrder(Node root){
         Node temp=root;
      if(temp==null){
        System.out.print("Tree is Empty");
      }else{
          
             if(temp.left!=null){
                printInOrder(temp.left);
                }
                 System.out.println(temp.data);
             if(temp.right!=null){
                 printInOrder(temp.right);
               }
           }
          
    }
      
    public static void main(String[] args) {
        BinaryTree t1=new BinaryTree(10);
	 
		t1.insert(9);
		t1.insert(15);
		t1.insert(8);
		t1.insert(2);
		t1.insert(10);
		t1.insert(10);
		t1.printInOrder(t1.root);
                System.out.println("Number of Elements In tree ="+t1.count(t1.root));
        Queue<Queue>r=new Queue<Queue>(); 
        BFS bf =new BFS();
       r=bf.bfs(2,t1.root);
       r.print();
    }
    
}
