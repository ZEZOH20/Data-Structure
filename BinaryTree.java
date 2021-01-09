/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Node n=new Node(12);
		n.insert(9);
		n.insert(15);
		n.insert(8);
		n.insert(2);
		n.insert(10);
		n.printInOrder();
		System.out.print(n.findValue(7));
		
		
	}
}



 class Node{
      int data;
    Node left,right;
    Node(int data){
       this.data=data;
    }
    
    void insert(int value){
        
            if(value<data){
                
              if(left==null) { //left Not found *** you don't need Transfer Insert in your place
                left =new Node(value); // left refernce on new node
              } else {// you need Transfer until reach to leave
                left.insert(value);  
              }
              
            }else if(value>data){
                
               if(right==null) { //right Not found *** you don't need Transfer Insert in your place
                right =new Node(value); // right refernce on new node
              } else {// you need Transfer until reach to leave
                right.insert(value);  
              } 
              
            }
             
        }
    
    boolean findValue(int value){
        if(value==data)
         return true;
      
       else if(value<data){
           if(left==null){
             return false;
           }else{
              return left.findValue(value);
           }
       }
         
         
         else if(value>data){
           if(right==null){
             return false;
           }else{
              return right.findValue(value);
           }
       }
         
         return false;
    }
    
  

    
    void printInOrder(){
        if(left!=null){
           left.printInOrder();
        }
        System.out.println(data);
         if(right!=null){
           right.printInOrder();
        }
    }
    
}













