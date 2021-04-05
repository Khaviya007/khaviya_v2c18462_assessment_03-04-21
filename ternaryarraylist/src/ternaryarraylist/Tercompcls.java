package ternaryarraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Student{
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
}
public class Tercompcls {
	public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<Student>();
    al.add(new Student(105,"Tom",23));
    al.add(new Student(134,"Sam",13));
    al.add(new Student(143,"Ram",24));
    al.add(new Student(123,"John",29));
    for(Student s:al)
 	   System.out.println("id:"+s.id+" "+"name:"+s.name+" "+"age:"+s.age);
    
    System.out.println("\nAfter sorted by age:");
    Comparator<Student> q=(r1,r2)->{
 	   return (r1.age==r2.age)?0:(r1.age>r2.age)?1:-1;
    };
   Collections.sort(al,q);
   for(Student s:al)
	   System.out.println("id:"+s.id+" "+"name:"+s.name+" "+"age:"+s.age);
 
   System.out.println("\nAfter sorted by name:");
   Comparator<Student> q1=(e1,e2)->{
	   return (e1.name.compareTo(e2.name));
   };
   Collections.sort(al,q1);
   for(Student s:al)
	   System.out.println("id:"+s.id+" "+"name:"+s.name+" "+"age:"+s.age);
   
   System.out.println("\nAfter sorted by id:");
   Comparator<Student>q2=(t1,t2)->{
	   return ((t1.id==t2.id)?0:(t1.id>t2.id)?1:-1);
   };
   Collections.sort(al,q2);
   for(Student s:al)
	   System.out.println("id:"+s.id+" "+"name:"+s.name+" "+"age:"+s.age);
   
}
}