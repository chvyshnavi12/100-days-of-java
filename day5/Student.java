public class Student {
    // Constructor: runs automatically when you create a Student object
    Student(String name, int age) {
        System.out.println("the name is :" + name);
        System.out.println("age is:" + age);
    }

    public static void main(String[] args) {
        // Create a new Student object (this calls the constructor)
        Student st = new Student("vyshnavi", 20);
    }
}
