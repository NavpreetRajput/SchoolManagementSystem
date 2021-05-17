

    package schoolManagementSystem;

import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        


        Teacher anna= new Teacher("Anna", 111, 1000);
        Teacher harry=new Teacher("Harry",112, 2500);
        Teacher brian=new Teacher("Brian", 113, 1500);
        Teacher ron=new Teacher("Ron",114,1700);
        
        ArrayList<Teacher> teacherList=new ArrayList<>();
        teacherList.add(anna);
        teacherList.add(harry);
        teacherList.add(brian);
        teacherList.add(ron);
       
        Student nav=new Student(1, "Navpreet Kaur", 11);
        Student komal=new Student(2, "Komalpreet Kaur", 11);
        Student jyoti=new Student(3, "Amanjot Kaur", 11);
        Student kat=new Student(4,"Kat",11);
        
        ArrayList<Student> studentList=new ArrayList<>();
        studentList.add(nav);
        studentList.add(komal);
        studentList.add(jyoti);
        studentList.add(kat);

       Schools ghg=new Schools(teacherList,studentList);
       
       
System.out.println("Initially, School has earned $"+ghg.getTotalMoneyEarned());
      
  nav.Feepaid(200); 
  komal.Feepaid(1000);
  jyoti.Feepaid(3000);
  kat.Feepaid(2000);
  nav.Feepaid(5000);
  nav.Feepaid(4800);
  komal.Feepaid(100);
  ghg.addTeachers(ron);
  ghg.addStudents(kat);

  anna.setSalary(1900);
  harry.setSalary(4000);
  
 //System.out.println(ghg.getStudents());
 System.out.println(studentList);
 System.out.println(teacherList);

System.out.println("School has earned $"+ghg.getTotalMoneyEarned()+" till now.");
System.out.println("School has spent $"+ghg.getTotalMoneySpent()+" till now.");


System.out.println(nav);
System.out.println(anna);


    }
}
    

