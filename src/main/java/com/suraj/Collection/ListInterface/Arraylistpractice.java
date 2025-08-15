package com.suraj.Collection.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Arraylistpractice {
int[] arr=new int[10];


static class STringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return (o1.length()-o2.length());
    }
}
//this is how we create an array in java
    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList<>();       //strucutred array list
        //this is how we create an arraylist in java
        arraylist.add(10);
        arraylist.add(100);


        System.out.println(arraylist);     //new Arraaylist()  => this is called raw type usage
        List list=new ArrayList<>();

        list.add(10);
        list.add(20);

        System.out.println(list.toString());

        ArrayList list3=new ArrayList<>();
        list3.add("hello");
        list3.add("suraj");
        list3.add("date");
        System.out.println(list3);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" "+list.get(i).getClass().getName());

        }

        //sorting
        Collections.sort(list);
        System.out.println(list);

        //sorting the list3
//        list3.sort(null);     //sort the list3 in natural order
//        System.out.println(list3);

        //using comparator to sort items
//        list3.sort(new STringLengthComparator());    //sort the list3 using custom comparator
//        System.out.println(list3);



        //using lambda expression to sort items
        list3.sort((o1,o2)->{
            return (((String)o2).length()-((String)o1).length());
        });

        System.out.println(list3);


//        you can use this to wsort student detils
        List<Student> students= new ArrayList<>();
        students.add(new Student("Suraj", 1, 20));
        students.add(new Student("Anil", 2, 20));
        students.add(new Student("Ravi", 3, 21));
        students.add(new Student("Sita", 4, 19));
        System.out.println("Before sorting: " + students);

        Comparator<Student> studentComparator =Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getName);

        // Sorting students by age using a lambda expression
//        students.sort((s1,s2)->{
//            return s1.getAge() - s2.getAge();
//        });

        students.sort(studentComparator);

        System.out.println(students);







    }
}
