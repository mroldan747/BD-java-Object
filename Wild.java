import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

public class Wild {

    public static void main(String[] args) {

        // Create School
        School wcs = new School("wcs", "here");

        // Create Students
        Student one = new Student("One", "Roldan");
        Student two = new Student("Two", "Roldan");

        // Create Language
        Language java = new Language("java");
        Language python = new Language("python");

        // Creat Quest and add to student
        Quest quest1 = new Quest("Interfaces", "Creating interfaces", java);
        Quest quest2 = new Quest("Objects", "What is a duck?", java);
        one.questAlloc(quest1);
        two.questAlloc(quest1);
        two.questAlloc(quest2);

        // Create an instructor and gives it a language
        Instructor coco = new Instructor("Coco", "Mango");
        coco.langAlloc(java);
        Instructor monty = new Instructor("Monty", "Python");

        // Create Training with students
        Training javaT = new Training("Java Training", coco);
        Training pythonT = new Training("Python Training", monty);
        javaT.langAlloc(java);
        javaT.addStudent(one);
        javaT.addStudent(two);
        pythonT.langAlloc(python);


        wcs.addTraining(javaT);
        wcs.addTraining(pythonT);
        //Trainings in School
        System.out.println("The School " + wcs.getName() + " has " + wcs.allTraining().size() + " trainings:");
        for (String trainingN : wcs.allTraining()) {
            System.out.println(trainingN);
        }

        //Students in training
        System.out.println("The " + javaT.getName() + " has " + javaT.getStudents().size() + " students");
        System.out.println("The " + pythonT.getName() + " has " + pythonT.getStudents().size() + " students");

        // Check good training
        if (javaT.isGoodTraining()) {
            System.out.println("The " + javaT.getName() + " is Good");
        } else {
            System.out.println("The training is not Good");
        }

        // Check of the quests that the students are doing
        System.out.println("The students are doing " + javaT.currentQuest().size() + " quest(s): ");
        for (Quest quest : javaT.currentQuest()) {
            System.out.println("-" + quest.getTitle());
        }

    }
}