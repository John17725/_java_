import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private double[] grades;

    public Student(int id, String name, double[] grades){
        this.id = id;
        this.name = name;
        this.grades = grades;
    }



    public double getAvg(){
        double sum = 0;
        for (double grade : grades){
            sum += grade;
        }

        return sum/grades.length;
    }

    public String getName(){
        return "Student: "+name;
    }

    public String getGradesString(){
        return "Grades student: "+Arrays.toString(grades);
    }
    public String getInformationStudent(){
        return "Id: "+id
                +"\nName: "+name
                +"\nGrades: "+Arrays.toString(grades)
                +"\nAvg: "+getAvg();
    }

    public String addGrade(double grade){
        try {
            double[] newGrades = Arrays.copyOf(grades, grades.length+1);
            newGrades[grades.length] = grade;
            grades = newGrades;
            return "Successfully added grade.";
        }catch (Exception e){
            return "Error adding grade: "+e.getMessage();
        }
    }
}
