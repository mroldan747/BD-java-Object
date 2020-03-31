
public class wild {
    
    public static void main(String[] args) {

        // Create School
        School wcs = new School ("wcs", "here");

        // Create Students 
        Student one = new Student("One", "Roldan");
        Student two = new Student("Two", "Roldan");

        // Create Language 
        Language java = new Language("java");
        Language python = new Language("python");

        //Creat Quest and add to student 
        Quest quest1 = new Quest ("Interfaces", "Creating interfaces", java);
        Quest quest2 = new Quest ("Objects", "What is a duck?", java);
        one.questAlloc(quest1);
        two.questAlloc(quest1);
        two.questAlloc(quest2);


        // Create profesor and gives it a language
        Profesor Coco = new Profesor ("Coco", "Mango");
        Coco.langAlloc(java);
        Profesor Monty = new Profesor("Monty", "Python");

        // Create Training  with students 
        Training javaT = new Training("Java Training", Coco);
        Training pythonT = new Training("Python Training", Monty);
        javaT.langAlloc(java);
        javaT.addStudent(one);
        javaT.addStudent(two); 
        pythonT.langAlloc(python);

        wcs.addTraining(javaT);
        wcs.addTraining(pythonT);

        System.out.println("The School " + wcs.getName() + " has " + wcs.allTraining().size() + " trainings:");
        for (String trainingN : wcs.allTraining()){
            System.out.println(trainingN);
        }

        // Check good training
        if (javaT.isGoodTraining()) {
            System.out.println("The " + javaT.getName() +" is Good");
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