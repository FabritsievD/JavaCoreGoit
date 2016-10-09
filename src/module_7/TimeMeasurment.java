package module_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TimeMeasurment {

    public static void main(String[] args) {
        List<Integer> intList1 = new ArrayList<>();
        List<Integer> intList2 = new ArrayList<>();
        List<String> strList1 = new ArrayList<>();
        List<String> strList2 = new ArrayList<>();
        List<Integer> intList3 = new LinkedList<>();
        List<Integer> intList4 = new LinkedList<>();
        List<String> strList3 = new LinkedList<>();
        List<String> strList4 = new LinkedList<>();


       /* long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            intList1.add((int)Math.random()*100);
        }
        long finish1 = System.currentTimeMillis();
        System.out.println(finish1-start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            intList2.add((int)Math.random()*100);
        }
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2-start2);




        long start3= System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            intList1.set(i,(int)Math.random()*100);
        }
        long finish3 = System.currentTimeMillis();
        System.out.println(finish3-start3);

        long start4= System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            intList2.set(i,(int)Math.random()*100);
        }
        long finish4 = System.currentTimeMillis();
        System.out.println(finish4-start4);



        long start5= System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            intList1.get(i);
        }
        long finish5 = System.currentTimeMillis();
        System.out.println(finish5-start5);

        long start6= System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            intList2.get(i);
        }
        long finish6 = System.currentTimeMillis();
        System.out.println(finish6-start6);



        long start7= System.currentTimeMillis();
        Iterator<Integer> iter1=intList1.iterator();
        while (iter1.hasNext()) {
            iter1.next();
        iter1.remove();
        }
        long finish7 = System.currentTimeMillis();
        System.out.println(finish7-start7);

        long start8= System.currentTimeMillis();
        Iterator<Integer> iter2=intList2.iterator();
        while (iter2.hasNext()) {
            iter2.next();
            iter2.remove();
        }
        long finish8 = System.currentTimeMillis();
        System.out.println(finish8-start8);

        */

      /*  long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            strList1.add("abc");
        }
        long finish1 = System.currentTimeMillis();
        System.out.println(finish1-start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strList2.add("abc");
        }
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2-start2);




        long start3= System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            strList1.set(i,"cba");
        }
        long finish3 = System.currentTimeMillis();
        System.out.println(finish3-start3);

        long start4= System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            strList2.set(i,"cba");
        }
        long finish4 = System.currentTimeMillis();
        System.out.println(finish4-start4);



        long start5= System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            strList1.get(i);
        }
        long finish5 = System.currentTimeMillis();
        System.out.println(finish5-start5);

        long start6= System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            strList2.get(i);
        }
        long finish6 = System.currentTimeMillis();
        System.out.println(finish6-start6);



        long start7= System.currentTimeMillis();
        Iterator<String> iter1=strList1.iterator();
        while (iter1.hasNext()) {
            iter1.next();
            iter1.remove();
        }
        long finish7 = System.currentTimeMillis();
        System.out.println(finish7-start7);

        long start8= System.currentTimeMillis();
        Iterator<String> iter2=strList2.iterator();
        while (iter2.hasNext()) {
            iter2.next();
            iter2.remove();
        }
        long finish8 = System.currentTimeMillis();
        System.out.println(finish8-start8);

        */

      /*
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            intList3.add((int)Math.random()*100);
        }
        long finish1 = System.currentTimeMillis();
        System.out.println(finish1-start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            intList4.add((int)Math.random()*100);
        }
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2-start2);




        long start3= System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            intList3.set(i,(int)Math.random()*100);
        }
        long finish3 = System.currentTimeMillis();
        System.out.println(finish3-start3);

        long start4= System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            intList4.set(i,(int)Math.random()*100);
        }
        long finish4 = System.currentTimeMillis();
        System.out.println(finish4-start4);



        long start5= System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            intList3.get(i);
        }
        long finish5 = System.currentTimeMillis();
        System.out.println(finish5-start5);

        long start6= System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            intList4.get(i);
        }
        long finish6 = System.currentTimeMillis();
        System.out.println(finish6-start6);



        long start7= System.currentTimeMillis();
        Iterator<Integer> iter1=intList3.iterator();
        while (iter1.hasNext()) {
            iter1.next();
            iter1.remove();
        }
        long finish7 = System.currentTimeMillis();
        System.out.println(finish7-start7);

        long start8= System.currentTimeMillis();
        Iterator<Integer> iter2=intList4.iterator();
        while (iter2.hasNext()) {
            iter2.next();
            iter2.remove();
        }
        long finish8 = System.currentTimeMillis();
        System.out.println(finish8-start8);

     */



        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            strList3.add("abc");
        }
        long finish1 = System.currentTimeMillis();
        System.out.println(finish1-start1);

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            strList4.add("abc");
        }
        long finish2 = System.currentTimeMillis();
        System.out.println(finish2-start2);




        long start3= System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            strList3.set(i,"cba");
        }
        long finish3 = System.currentTimeMillis();
        System.out.println(finish3-start3);

        long start4= System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            strList4.set(i,"cba");
        }
        long finish4 = System.currentTimeMillis();
        System.out.println(finish4-start4);



        long start5= System.currentTimeMillis();
        for (int i = 0; i <1000 ; i++) {
            strList3.get(i);
        }
        long finish5 = System.currentTimeMillis();
        System.out.println(finish5-start5);

        long start6= System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            strList4.get(i);
        }
        long finish6 = System.currentTimeMillis();
        System.out.println(finish6-start6);



        long start7= System.currentTimeMillis();
        Iterator<String> iter1=strList3.iterator();
        while (iter1.hasNext()) {
            iter1.next();
            iter1.remove();
        }
        long finish7 = System.currentTimeMillis();
        System.out.println(finish7-start7);

        long start8= System.currentTimeMillis();
        Iterator<String> iter2=strList4.iterator();
        while (iter2.hasNext()) {
            iter2.next();
            iter2.remove();
        }
        long finish8 = System.currentTimeMillis();
        System.out.println(finish8-start8);
    }
}
