/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
template<class t>
class List{
  
  struct node{
    t data;
    node*next=NULL;
  }; 
  node*head;
  
  public:
  List():head(NULL){}
  List(t value){
      head=new node;
      head->data=value;
  }
  
  //insert Elements
  void Insert(t value){
      node*n=new node;
      if(head==NULL){
          head=n;
          head->data=value;
          return;
      }
      node*temp=head;
      while(temp->next!=NULL){
          temp=temp->next;
      }
      temp->next=n;
      temp->next->data=value;
      return;
  }
  
//size of linked list  
  int size(){
      return size(head);
  }
  int size(node*n){
      if(n==NULL)return 0;
      return 1+size(n->next);
  }
  
 //print Elements  
  void print(){
      if(head==NULL){
          cout<<"List is Empty"<<endl;
          return;
      }
      node*temp=head;
      cout<<endl;
      cout<<'[';
      while(temp!=NULL){
          cout<<temp->data<<',';
          temp=temp->next;
      }
      cout<<']'<<endl;
  }
  
};

int main()
{
    cout<<"Hello World";
    List<char>l1('a');
    l1.Insert('b');
     l1.Insert('c');
      l1.Insert('d');
       l1.Insert('d');
       l1.print();
       cout<<l1.size()<<endl;

    return 0;
}
