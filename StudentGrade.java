import java.util.Scanner;
public class StudentGrade {
    public void grade(float avgPercentage){
        char grade;
        if (avgPercentage>=90){
            grade='A';
            System.out.println("Grade: "+grade);
        }
        else if(avgPercentage>=75 && avgPercentage<90){
            grade='B';
            System.out.println("Grade: "+grade);
        }
        else if(avgPercentage>=60 && avgPercentage<75){
            grade='C';
            System.out.println("Grade: "+grade);
        }
        else if(avgPercentage>=45 && avgPercentage<60){
            grade='D';
            System.out.println("Grade: "+grade);
        }
        else{
            System.out.println("Grade: "+'F');
        }
    }
    public static void main(String[] args) {
        int number_of_subjects;
        System.out.println("Enter the number of subjects:");
        Scanner scan=new Scanner(System.in);
        number_of_subjects=scan.nextInt();
        float[] marks=new float[number_of_subjects];
        float totalMarks=0f;
        for(int i=0;i<number_of_subjects;i++){
            System.out.printf("Enter marks obtained in subject %d (out of 100): ",i+1);
            marks[i]=scan.nextFloat();
            totalMarks += marks[i];
        }
        System.out.println("\n------Student Results ------");
        System.out.println("Total Marks are: "+totalMarks);
        float avgPercentage=totalMarks/number_of_subjects;
        System.out.println("Average Percentage is: "+avgPercentage+"%");
        StudentGrade sg=new StudentGrade();
        sg.grade(avgPercentage);
    }

}