package HomeWork.les9;

import java.util.*;

import java.util.stream.Collectors;

public class ClassList
{
    public List<String> myList1;
    public List<String> myList2;
    public List<String> myList3;

    public ClassList() {
        myList1 = new ArrayList<>();

        myList1.add("First " + 1);
        myList1.add("Second " + 1);
        myList1.add("Third " + 1);
        myList1.add("Fourth " + 1);
        myList1.add("Fifth " + 1);
        showList(myList1);

        myList2 = new ArrayList<>(myList1.size());
        for (int i = 0; i < myList1.size(); i++)
        {
            myList2.add(null);
        }
        Collections.copy(myList2,myList1);
        showList(myList2);

        myList3 = Arrays.asList("First", "Second", "Third");
        showList(myList3);

        int midIndex = myList2.size() / 2;
        myList2.addAll(midIndex, myList3);
        showList(myList2);

        myList2 = myList2.stream().sorted().collect(Collectors.toList());
        showList(myList2);

        Iterator<String> iter = myList2.iterator();
        for(int i = 1;i<myList2.size();i++)
        {
            iter.next();
            if(i % 2 == 0)
            {
                iter.remove();
            }
        }
        showList(myList2);
    }

    public void showList(List<String> myList) {
        for (String word : myList) {
            System.out.println(word);
        }
        System.out.println('\n');
    }
}