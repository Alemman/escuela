package learning.java.school;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Map<String,String>map = new HashMap<String,String>();

        Student[] students = new Student[]{
          new Student( "Juan", "1"),
          new Student("Jua", "2"),
          new Student("Jun", "3"),
          new Student("Jan", "4"),
          new Student("uan", "5"),
          new Student("an","6")
        };

        System.out.println("alumnos:");
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].getName() + "-" + students[i].getCode());

            System.out.print("asistio:" );
            String response = scanner.next("[YNyn]");

            map.put(students[i].getCode(),response);

            //System.out.println(students[i].getName() + (response.equalsIgnoreCase("Y")? "Si" : "No"));

        }

        //no se si esto valga o se referia a otra cosa
        for(int i = 0; i<students.length; i++){
            System.out.println(students[i].getName() + "-" + students[i].getCode() + "-------Asistio:" + (map.get(students[i].getCode()).equalsIgnoreCase("Y")? "Si" : "No"));
        }

    }
}
