import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer>firs=new HashSet<>();
        firs.add(1);
        firs.add(2);
        firs.add(3);
        HashSet<Integer>second=new HashSet<>();
        second.add(0);
        second.add(1);
        second.add(2);

        System.out.println(symmetricDifference(firs,second));
    }
public static Set<Integer> symmetricDifference(HashSet<Integer> firs, HashSet<Integer> second){
        HashSet<Integer>newHashset= new HashSet<>(firs);
        newHashset.removeAll(second);//3
        second.removeAll(firs);//0
        newHashset.addAll(second);





        System.out.println(second);
         return newHashset;
}

}
