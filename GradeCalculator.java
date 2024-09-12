public class GradeCalculator
{
  public static void main(String[] args)
  {
    String course = "AP Computer Science A";
    System.out.println("Name of the Course: " + course);
    
    int timeSpent = 249;
    System.out.println("Average Time Spent in Class per Week: " + timeSpent);

    System.out.println("Homework Grades for this Course:");
    int hw1 = 92;
    int hw2 = 93; 
    int hw3 = 100;
    System.out.println(hw1);
    System.out.println(hw2);
    System.out.println(hw3);

    System.out.println("Quiz Grades for this Course:");
    double quiz1 = 89.2;
    double quiz2 = 91.9;
    System.out.println(quiz1);
    System.out.println(quiz2);

    System.out.println("Final Exam Grade for this Course:");
    double finalExam = 90.49;
    System.out.println(finalExam);

    int weeklyHours = timeSpent/10;
    int weeklyMin = timeSpent%10;
    System.out.println("Weekly Time Spent: " + weeklyHours + " hours and " + weeklyMin + " minutes");

    int averageHW = (hw1 + hw2 + hw3)/3; 
    System.out.println("Average Homework Grade: " + averageHW);

    int averageQuiz = (int)(quiz1 + quiz2)/2; 
    System.out.println("Average Quiz Grade: " + averageQuiz);

    System.out.println("Final Exam Grade: " + finalExam);

    int overallGrade = (int)(averageHW*0.35) + (int)(averageQuiz*0.15) + (int)(finalExam*0.50);
    System.out.println("Overall Grade: " + overallGrade);
  }
}
