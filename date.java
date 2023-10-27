import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter; 
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom; 

public class date {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the following option:");
        System.out.println(" Enter 1 to Calculate Date Difference");
        System.out.println("Enter 2 to Calculate Age");
        System.out.println("Enter 3 to Generate Random Date");
        System.out.println("Enter 4 to simulate a multi-level educational institution's enrollment system");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                calculateDateDifference();
                break;
            case 2:
                calculateAge();
                break;
            case 3:
                generateRandomDate();
                break;
            case 4:
                Scanner in = new Scanner(System.in);
                System.out.println("Enter the name and location");
                institution ins = new institution(in.next(),in.next());
                System.out.println("Enter the id hnand name and specialization");
                institution.department comp = new institution.department(in.next(),in.next(),in.next());
                System.out.println("Enter the id,name,age,courses_enrolled");
                institution.department.Student stu1 = new institution.department.Student(in.nextInt(),in.next(),in.nextInt(),in.next());
                institution.department.Student stu2 = new institution.department.Student(in.nextInt(),in.next(),in.nextInt(),in.next());

        
                  System.out.println("Institution: " + ins.name + " :location" + ins.location);
                  System.out.println("Department: " + comp.name + " (ID: " + comp.id + ")");
        
                  System.out.println("\nStudent 1 Information:");
                  stu1.display();

                  System.out.println("\nStudent 2 Information:");
                  stu2.display();
                  break;
                
                default:
                System.out.println("Invalid option");
        }

        scanner.close();
    }

    public static void calculateDateDifference() throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");

        System.out.print("Enter start date (dd/mm/yyyy HH:mm:ss): ");
        String startDateStr = new Scanner(System.in).nextLine();
        Date startDate = sdf.parse(startDateStr);

        System.out.print("Enter end date (dd/MM/yyyy HH:mm:ss): ");
        String endDateStr = new Scanner(System.in).nextLine();
        Date endDate = sdf.parse(endDateStr);

        long differenceMillis = endDate.getTime() - startDate.getTime();
        long days = differenceMillis / (24 * 60 * 60 * 1000);
        long hours = (differenceMillis % (24 * 60 * 60 * 1000)) / (60 * 60 * 1000);
        long minutes = (differenceMillis % (60 * 60 * 1000)) / (60 * 1000);
        long seconds = (differenceMillis % (60 * 1000)) / 1000;

        System.out.println("Difference: " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }

    public static void calculateAge() {
        System.out.print("Enter your birthdate (dd/MM/yyyy): ");
        String birthdateStr = new Scanner(System.in).nextLine();
        LocalDate birthdate = LocalDate.parse(birthdateStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        LocalDate today = LocalDate.now();
        Period age = Period.between(birthdate, today);

        System.out.println("Your age: " + age.getYears() + " years, " + age.getMonths() + " months, " + age.getDays() + " days");
    }

    public static void generateRandomDate() {
        long minDay = LocalDate.of(2020, 1, 1).toEpochDay();
        long maxDay = LocalDate.of(2020, 12, 31).toEpochDay();
        long randomDay = ThreadLocalRandom.current().nextLong(minDay, maxDay);

        LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
        System.out.println("Random date: " + randomDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}


 class institution
{
   String name;
   String location;
    
institution(String name,String location)
{
    this.name= name;
    this.location=location;
}
static class department
{   
   String id;
   String name;
  String specialization;
  
department(String id,String name,String specialization){
    this.id=id;
    this.name=name;
    this.specialization=specialization;
    
}
   static class Student
   {
       int studentID;
      String name;
      int age;
      String courses_enrolled;
       
       Student(int studentID, String name, int age, String courses_enrolled){
           this.studentID=studentID;
           this.name=name;
           this.age=age;
           this.courses_enrolled=courses_enrolled;
       
         }
         
         public void display(){
             System.out.println("Student id :" +studentID );
             System.out.println("name :" + name);
             System.out.println("age :" +age );
             System.out.println("courses_enrolled"+courses_enrolled);
            }
        }
       
    }

}



   
         

