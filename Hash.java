/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Hashing {

   public static void main(String[] args) {
	 
	/*    //Using Separate Chaning Methode for Handaling Collision
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size of Hashing Array");
		int size =s.nextInt();
		//Hashing Array
	        Separate_Chaning h1=new Separate_Chaning(size);
                
                System.out.println("Enter Number of Elements");
                int ElementSize =s.nextInt();
                
                System.out.println("Enter Element");
                for(int i=0;i<ElementSize;i++){
                   int Element =s.nextInt();
                   h1.InsertAtHead(Element); 
                }
		h1.Delete(12); 
                h1.print();
	
	 */
        
               //Using Liner probing Methode for Handaling Collision
                 Scanner s=new Scanner(System.in);
                 System.out.print("Enter Size of Hashing Array");
                 int size=s.nextInt();
                 Liner_probing L1 =new Liner_probing(size);
                 L1.Insert(5);
                 L1.Insert(10);
                 L1.Insert(15);
                 L1.Insert(3);
                 L1.Insert(13);
                  L1.Insert(20);
                 L1.print();
	}
    
}

//Separate_Chaning
class Snode{
   int Data;
   Snode next;
   Snode(int Data){
     this.Data=Data;
     next =null;
   }
}
class Separate_Chaning{
    Snode[]head;
    int size;
     Separate_Chaning(int size){
         this.size=size;
         head = new Snode[size];
     }
    void InsertAtHead(int Data){
        Snode n=new Snode(Data);
        int position=Data%size;
        n.next=head[position];
        head[position] = n;
    }
    void Delete(int Data){
        int position=Data%size;
        //temp1 for comparing Data
        Snode temp1 =head[position];
           //Other referance walking before temp1 for Deleting the Element
        Snode temp2 =head[position];
        while(temp1!=null&&temp1.Data!=Data){
            if(temp1!=head[position])
             temp2=temp2.next;
            temp1 =temp1.next;
        }
        if(temp1!=null){
            temp2.next=null;
        }
       
    }
    void print(){
        Snode x;
       for(int i=0;i<head.length;i++){
         if(head!=null){
             System.out.print("Index ="+i+", ");
              x = print(head[i]);
               
         }
          else break;
       }
        
    }
    Snode print(Snode n){
        if(n!=null){
            System.out.print(n.Data+" ");
            return print(n.next);
        }
        System.out.println();
        return null;
    }
}
// Separate_Chaning**********************************

//Liner probing

class Liner_probing{
    int[]Element;
    int size;
    int Isfull;
    Liner_probing(int size){
        this.size=size;
        Element=new int[size];
    }
    void Insert(int Data){
      if(Isfull!=size){
        int position=Data%size;
        //Quadratic probing:  int Try=1;
        while(Element[position]!=0){
          position+=1; 
          /* Quadratic probing
           position =(position+Math.pow(try,2));
           Try++;
          */
        }
        Element[position]=Data;
        Isfull++;
      }
      else
          System.out.println("Hashing Array is Full Can't Add "+Data);
    }
    void Delete(int Data){
      if(Isfull!=-1){
          
        int position=Data%size;
       while(Element[position]!=Data){
          position+=1;  
       }
       Element[position]=0;
       Isfull--;  
      }
      System.out.println("Array actually Empty");
       
    }
    
    void print(){
        int i=0;
        while(i<size){
            System.out.print(Element[i]+",");
             i++;
        }
       
    }
    
}