package HomeWork.les9;

import java.time.Month;
import java.util.*;

public class ClassMap
{
    private Map<Integer,String> map1;
    private Map<Integer,String> map2;

    private Map<String,String[]> map3_student;

    public ClassMap()
    {
        map1 = new LinkedHashMap<>();

        for (Month month : Month.values()) {
            map1.put(month.getValue(), month.getDisplayName(java.time.format.TextStyle.FULL, java.util.Locale.UK));
        }

        showMap(map1);

        map1.put(6,map1.get(6) + " - Vacation");
        showMap(map1);

        map2 = new HashMap<>();
        map2.putAll(map1);

        showMap(map2);

        map3_student = new HashMap<>();
        map3_student.put("Student1", new String[]{"+A123 456 6789","email@1","Skype1"});
        map3_student.put("Student2", new String[]{"+B123 456 6789","email@2","Skype2"});
        map3_student.put("Student3", new String[]{"+C123 456 6789","email@3","Skype3"});
        map3_student.put("Student4", new String[]{"+D123 456 6789","email@4","Skype4"});

        showStudent(map3_student);
    }

    public static void showMap(Map<Integer, String> map)
    {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println('\n');
    }

    public static void showStudent(Map<String, String[]> map_student)
    {
        for (Map.Entry<String, String[]> entry : map_student.entrySet())
        {
            System.out.print(entry.getKey() + ": ");

            String[] values = entry.getValue();
            for (String value : values) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}