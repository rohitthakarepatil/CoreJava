package June;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List students = new ArrayList();
        students.add("manish");
        students.add("himanshu");
        students.add("sagar");
        System.out.println(students.size());
        System.out.println(students.get(1));
        System.out.println(students.contains("sagar"));
        System.out.println(" list  ->"+students); // Internally arraylist uses Arrays
        System.out.println(students.toArray());
        System.out.println("----------------");
        Iterator itr = students.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}
