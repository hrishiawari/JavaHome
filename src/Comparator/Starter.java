package Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by xt on 3/9/17.
 */
public class Starter {
    public static void main(String[] args) {
        ArrayList List=new ArrayList();

        List.add(new StudRecord(1,10,"Ram","FE","A"));
        List.add(new StudRecord(2,3,"Narendra","SE","A"));
        List.add(new StudRecord(3,5,"Alex","TE","C"));
        List.add(new StudRecord(9,45,"Rohit","BE","c"));

        Iterator itr=List.iterator();
        System.out.println("Name"+" "+"Roll_no"+" "+"id_no"+" "+"Class"+" "+"Grade");
        while(itr.hasNext()){

            StudRecord r=(StudRecord)itr.next();
            System.out.println(r.Name+" "+r.Roll_no+" "+r.id_no+" "+r.Class+" "+r.Grade);

        }
        System.out.println("Data inserted ...\n");

        System.out.println("sorting By Name");

        Collections.sort(List,new CompareByName());
        Iterator it=List.iterator();
        while (it.hasNext()){

            StudRecord r=(StudRecord)it.next();
            System.out.println(r.Name+" "+r.Roll_no+" "+r.id_no+" "+r.Class+" "+r.Grade);
        }
        System.out.println("sorting by id");
        Collections.sort(List,new Sortbyid());
        Iterator e=List.iterator();
        while(e.hasNext()){
            StudRecord s=(StudRecord)e.next();
            System.out.println(s.id_no);

        }
    }
}
