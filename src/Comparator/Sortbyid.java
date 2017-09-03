package Comparator;

import java.util.Comparator;

/**
 * Created by xt on 3/9/17.
 */
public class Sortbyid implements Comparator {

    @Override
    public int compare(Object p, Object q) {
        StudRecord s1=(StudRecord)p;
        StudRecord s2=(StudRecord)q;

        if(s1.id_no==s2.id_no){
            return 0;
        }else if (s1.id_no>s2.id_no){
            return 1;
        }else
            return -1;

    }
}
