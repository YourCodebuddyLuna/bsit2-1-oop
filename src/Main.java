
public class Students {
    String name;
    String course;
    int age;
    double Grade1;
    double Grade2;
    double Grade3;
    double Grade;



    public Students(String name, String course, int age ) {

        this.name = name;
        this.course = course;
        this.age = age;

        System.out.println("New Student '" + name +"'course" + age +"has been added to your Students list");
    }

    public void displayInfo () {
        System.out.println("Name: " + name);
        System.out.println("course: " +  course);
        System.out.println("age:" + age);

    }


    public void calculateGrades () {

        if ( Grade1 >= 90) {
            System.out.println(" the output will be A");
        }

        if (Grade2 >= 80-89) {
            System.out.println("the output will be B");
        }

        if(Grade3 <= 70-79) {
            System.out.println("the output will be C");
        }

        if ( Grade <= 60-69) {
            System.out.println("the output will be D");
        }else {
            System.out.println(" the letter grade: F Failed");
        }
    }
