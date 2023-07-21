package ui;

import model.Transcript;

public class Main {
    public static void main(String[] args){
        Transcript t1 = new Transcript("Jane Doe", 7830);
        Transcript t2 = new Transcript("Ada Lovelace", 8853);
        Transcript t3 = new Transcript("Nishan", 1281);


        t1.addGrade("CPSC-210", 3.5);
        t1.addGrade("ENGL-201", 4.0);
        t1.addGrade("CPSC-110", 3.1);


        t2.addGrade("CPSC-210", 3.6);
        t2.addGrade("ENGL-201", 4.1);  //must fail in test case
        t2.addGrade("CPSC-110", 3.2);

        t3.addGrade("CPSC-210", 3.7);
        t3.addGrade("ENGL-201", -0.2);
        t3.addGrade("CPSC-110", 3.3);



        System.out.print(t1.getStudentName() + ": ");
        t1.printTranscript();
        System.out.println(t1.getGPA());

        System.out.println(t2.getStudentName() + ": ");
        t2.printTranscript();
        System.out.println(t2.getGPA());

        System.out.println(t3.getStudentName() + ": ");
        t3.printTranscript();
        System.out.println(t3.getGPA());




    }
}
