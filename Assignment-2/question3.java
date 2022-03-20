import java.util.*;

public class question3 {
    static void Trim_list(List<String> strings) {
        for (ListIterator<String> l = strings.listIterator();
                l.hasNext(); ) {
            l.set(l.next().trim());
        }
    }

    public static void main(String[] args) {
        List<String> lst = Arrays.asList(" black ", " orange ", " white ");
        Trim_list(lst);
        for (String s : lst) {
            System.out.format("\"%s\"%n", s);
        }
    }
}