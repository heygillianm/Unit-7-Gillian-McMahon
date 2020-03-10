public class APStudentTest {
    public static void main(String[] args) {
        APStudent apJoe = new APStudent();
        apJoe.studyForExam();
        System.out.println(apJoe.getAPExamScore()); 		//1)
        System.out.println(apJoe.toString());			//2)
        System.out.println(apJoe); 					//3)
        apJoe.saySomething(); 						//4)
        System.out.println(apJoe.getGrade()); 			//5)
        apJoe.passExams();
        System.out.println(apJoe.getGrade()); 			//6)
        apJoe.haveBirthday();
        System.out.println(apJoe.getAge()); 			//7)

        Student studentJane = new Student();
        studentJane.passExams();
        //System.out.println(studentJane.myGrade); 			//8)
        System.out.println(studentJane.getGrade()); 		//9)
        //System.out.println(studentJane.getAPExamScore()); 	//10)
        studentJane.saySomething(); 					//11)

        Person personMary = new Person();
        personMary.setAge(16);
        //personMary.setGrade(10);
        personMary.haveBirthday();
        System.out.println(personMary.getAge()); 			//12)

        Person personBob = new APStudent();
        //personBob.setAPExamScore(5);
        ((APStudent) personBob).setAPExamScore(5);
        System.out.println(personBob.getAge()); 			//13)
        personBob.saySomething(); 					//14)
    }
}
