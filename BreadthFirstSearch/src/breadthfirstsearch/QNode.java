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
public class QNode<T> {
    T data;
   QNode next ;
   QNode(T data){
      this.data=data;
      next=null;
   }
}
