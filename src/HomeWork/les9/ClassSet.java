package HomeWork.les9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ClassSet
{
    private Set<String> set1;
    private Set<String> set2;

    public ClassSet()
    {
        set1 = new HashSet<>();

        set1.add("A");
        set1.add("B");
        set1.add("C");

        showSet(set1);

        ClassList classList = new ClassList();

        set1.addAll(classList.myList1);
        set1.addAll(classList.myList2);
        showSet(set1);

        set2 = new LinkedHashSet<>();
        set2.addAll(classList.myList2);
        set2.addAll(classList.myList3);

        showSet(set2);
    }

    public void showSet(Set<String> mySet)
    {
        for (String word : mySet) {
            System.out.println(word);
        }
        System.out.println('\n');
    }
}