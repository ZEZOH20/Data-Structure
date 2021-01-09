/******************************************************************************


ADD NODE AT ANY POSTION IN LIST 
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		List l1=new List();
		l1.add_Node(1,30);
		l1.add_Node(2,30);
		l1.add_Node(3,3);
		l1.add_Node(20,2);
		l1.add_Node(30,1);
		l1.print_L();
		
	}
}

class Node{
    int data ;
    Node next ;
    Node(int data){
        this.data=data;
        next=null;
    }
}
class List{
    Node head=null;
    
    int size(){
        Node temp=head;
        int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }
        return c;
    }
    
    void add_Node(int data,int location){
        Node n=new Node(data);
        Node temp=head;
        if(head==null)
         head=n;
         
        else{
            if(location==1){
                n.next=head;
                head=n;
            }
            else if(location>size()){
                for(int i=1;i<location-1;i++){
                    if(location>size()+1){
                        temp=null;
                        break;
                    }
                    temp=temp.next;
                }
                if(temp==null){
                    temp=head;
                    System.out.println("position not found element will be add in the end of list ");
                    while(temp.next!=null)
                     temp=temp.next;
                     
                     temp.next=n;
                }
                
                temp.next=n;
            }
            
            else{
                 for(int i=1;i<location-1;i++){
                    temp=temp.next;
                }
                n.next=temp.next;
                temp.next=n;
                
            }
                
            }
              
        }
         
    void print_L(){
        Node temp=head;
        System.out.print('[');
        while(temp!=null){
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.println(']');
    }     
            
        
        
    }
