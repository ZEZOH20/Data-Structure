/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		doubleLinked l=new doubleLinked();
		l.addNode(1,1);
		l.addNode(2,1);
		l.addNode(3,2);
		l.addNode(6,3);
		l.addNode(0,3);
		l.addNode(7,4);
		
	
		l.print();
	}
}

class Node{
 
 Node left,right;
 int data;
 
 Node(int data){
     left=right=null;
     this.data=data;}
}

class doubleLinked{
    Node head=null;
    
    boolean addNode(int data ,int location){
        Node n=new Node(data);
        
        if(head==null){
           head=n;
            return true;
        }
        
        else if (location==1){
            head.left=n;
            n.right=head;
            head=n;
            return true;
        }
        else if (location>1&&location!=size())
        {
            Node temp=head;
            for(int i=0;i<location-2;i++){
                temp=temp.right;
            }
            
            n.right=temp.right;
            n.left=temp;
            temp.right.left=n;
            temp.right=n;
            return true;
            
        }
       else if(location>=size()){
            Node temp=head;
            while(temp.right!=null){
                temp=temp.right;
            }
            temp.right=n;
            n.left=temp;
            
            return true;
       }
            
        return false;
    }

    int size(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            temp=temp.right;
            c++;
        }
        return c;
    }
    
    void print(){
        Node temp=head;
         System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+",");
             temp=temp.right;
        }
        
        System.out.println("]");
    }
    
}










