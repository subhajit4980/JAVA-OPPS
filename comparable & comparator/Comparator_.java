import java.util.*;
public class Comparator_ {
    
   
    public static void main(String[] args) {
    List<Student> students = new ArrayList<>();
    students.add(new Student(11, "subhajit"));
    students.add(new Student(12, "susanta"));
    students.add(new Student(14, "surajit"));
    students.add(new Student(14, "barshan"));
    students.add(new Student(15, "budhadev"));
    //-----------------------------1st methode------------------>
    
    // class sorting implements Comparator <Student>
    // {

    //     // @Override
    //     public int compare(Student o1, Student o2) {
            
    //         if(o1.name.equals(o2.name))
    //         {
    //             return o1.marks-o2.marks;
    //         }
    //         else{
    //             return o1.name.compareTo(o2.name);
    //         }
            
    //     }
        
    // }
    // Collections.sort(students,new sorting());
        //------------------------------------------------------>
    //---------------------------2nd method------------------------>
    // --------------------------------------------------------->
        // Collections.sort(students,(Student o1, Student o2) ->{
            
    //     if(o1.name.equals(o2.name))
    //     {
    //         return o1.marks-o2.marks;
    //     }
    //     else{
    //         return o1.name.compareTo(o2.name);
    //     }
        
    // });
    //----------------------------3rd method----------------------->
    // Collections.sort(students,( o1,  o2) ->{
            
    //     if(o1.name.equals(o2.name))
    //     {
    //         return o1.marks-o2.marks;
    //     }
    //     else{
    //         return o1.name.compareTo(o2.name);
    //     }
        
    // });
    // ----------------------------4th methode---------------------->
    // Collections.sort(students,( o1,  o2) ->o1.name.compareTo(o2.name));
//----------------------------------5th method----------------------->
    // Collections.sort(students, Comparator.comparing(Student::getMarks).thenComparing(Student::getString));
    Collections.sort(students, Comparator.comparing(Student::getMarks).thenComparing(Student::getString).reversed());
    students.forEach(System.out::println);

}
}