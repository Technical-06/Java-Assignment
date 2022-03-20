import java.util.*;

public class question2 {

    public static void main(String[] args) {
        
       
        List<String> Listarg = Arrays.asList(args);
        Collections.shuffle(Listarg);

        
        Listarg.stream()
        .forEach(e->System.out.format("%s ",e));

        
        for (String arg: Listarg) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}