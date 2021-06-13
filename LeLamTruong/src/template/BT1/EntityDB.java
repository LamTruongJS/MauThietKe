/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.BT1;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public abstract class EntityDB<T> {
     protected ArrayList<T> list = new ArrayList<>();
     protected abstract int getID(T t);
//     protected abstract T findById(int id);
     
     //neu cai dat truc tiep vao lop truu
     protected T findById(int id){
         for(T t: list)
             if(getID(t)==id)
                 return t;
         return null;
     }
    
     public boolean add(T t){
         if(findById(getID(t))== null)
         {
             list.add(t);
             return true;
         }
         return false;
     }
     public int update(T t)
     {
         T old = null;
         old= findById(getID(t));
         if(old != null)
         {
             int index= list.indexOf(old);
             list.set(index, t);
             return 1;
         }
         return 0;
     }
     public int delete(T t)
     {
         T del = null;
         del = findById(getID(t));
         if(del!=null)
         {
             list.remove(del);
         }
         return 0;
     }
     public int deleteById(int id)
     {
         for(T t: list){
             if(getID(t) == id)
             {
                list.remove(t);
                return 1;
             }
               
         }
//          T delById= null;
//          delById= findById(getID(t));
//          if(delById!= null)
//          {
//              list.remove(delById);
//          }
          return 0;
     }
     public void printInfo(){
         list.forEach((t) -> {
             System.out.println(t.toString());
         });
     }
}
