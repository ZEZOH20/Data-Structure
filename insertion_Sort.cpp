/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;
int *move(int *a,int i){
    int j=i;
    int key=a[j];
    while(key<a[j-1]&&j>0){
        a[j]=a[j-1];
        j--;
    }
    a[j]=key;
    return a;
}
int *sort(int *a){
    int static i=1;
    if(i==5){  //Array size
        return a;
    } 
     a=move(a,i);
    i++;
    return sort(a);
}

int main()
{
    int x[]={2,7,3,5,0};
    int *a=sort(x);

    
    for(int i=0;i<5;i++){
        cout<<a[i]<<' ';
    }

    return 0;
}
