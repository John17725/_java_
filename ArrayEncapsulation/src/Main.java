import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int optionMenu = 1;
            int idStudent;
            Scanner input = new Scanner(System.in);
            idStudent = getInputIdStudent(input);
            input.nextLine();
            String nameStudent = getInputNameStudent(input);
            double[] grades = getInputGradesStudent(input);
            Student student_1 = new Student(idStudent, nameStudent, grades);
            System.out.println("Student successfully created");
            do{
                System.out.println("Select an option: "
                        +"\n1. Add new grade"
                        +"\n2. Get name Student"
                        +"\n3. Get grades Student"
                        +"\n4. Get average grades"
                        +"\n5. Get info about Student");
                optionMenu = input.nextInt();
                switch (optionMenu) {
                    case 1:{
                        input.nextLine();
                        double[] newGrade = getInputGradesStudent(input);
                        student_1.addGrade(newGrade[0]);
                        break;
                    }
                    case 2:{
                        System.out.println(student_1.getName());
                        break;
                    }
                    case 3:{
                        System.out.println(student_1.getGradesString());
                        break;
                    }
                    case 4:{
                        System.out.println(student_1.getAvg());
                        break;
                    }
                    case 5:{
                        System.out.println(student_1.getInformationStudent());
                        break;
                    }
                    default:{
                        break;
                    }
                }
            }while (optionMenu != 6);

        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
    public static int getInputIdStudent(Scanner input){
        System.out.println("Insert id student");
        return input.nextInt();
    }

    public static String getInputNameStudent(Scanner input){
        System.out.println("Insert name student");
        return input.nextLine();
    }

    public static double[] getInputGradesStudent(Scanner input){
        StringValidator gradesInputValidator = new StringValidator();
        ParseStringDouble parseStringDouble = new ParseStringDouble();
        System.out.println("Insert grades student");
        String gradesStudent = input.nextLine();
        gradesInputValidator.validateInput(gradesStudent);
        return parseStringDouble.stringToArrayDouble(gradesStudent);
    }
}