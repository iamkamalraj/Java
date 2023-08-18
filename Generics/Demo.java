import java.util.*;
import java.util.Collections;
import java.util.Comparator;

// class Student implements Comparable<Student>
// {
//     int age;
//     String name;
//     String tech;
//     Integer i;
//     public Student(int age, String name, String tech) {
//         this.age = age;
//         this.name = name;
//         this.tech = tech;
//     }
//     @Override
//     public String toString() {
//         return "Student [age=" + age + ", name=" + name + ", tech=" + tech + "]";
//     }

//     @Override
//     public int compareTo(Student that)
//     {
//             return this.name.compareTo(that.name);
//     }


// }

public class Demo
{
    public static void main(String a[])
    {
    

        List<Integer> nums = Arrays.asList(5,7,2,9);
        
        Collections.sort(nums);
        Collections.reverse(nums);

        System.out.println(nums);


        // ArrayList<Student> nums = new ArrayList<>();
        // nums.add(new Student(21, "Nagesh", "Java"));
        // nums.add(new Student(17, "Ashwini", "JS"));
        // nums.add(new Student(18, "Souvik", "Blockchain"));
        // Collections.sort(nums, (s1, s2) -> s1.tech.length() - s2.tech.length());
        // // 21 17 18
        // // 17 21 18
        // // 17 18 21

        // // 17 18 21
 
        // System.out.println(nums);

    }
}
