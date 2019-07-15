import java.util.*;  
public class LinkedList7{
public static void main(String args[]){  
  
  LinkedList<String> al=new LinkedList<String>();  
  al.add("fun");  
  al.add("msd");  
  al.add("summa");  
  al.add("emma");  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext()){  
   System.out.println(itr.next());  
  }  
 }  
}  
