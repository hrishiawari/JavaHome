package Comparator;

import java.util.Comparator;

/**
 * Created by xt on 3/9/17.
 */
public class CompareByName implements Comparator{

    public int compare(Object o, Object t1) {
        StudRecord s1=(StudRecord) o;
        StudRecord s2=(StudRecord)t1;

        return s1.Name.compareTo(s2.Name);

    }
}
