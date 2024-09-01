public class Main
{
    public static void main(String[] args)
    {
        Person p1 = new Student("Bartek", "programming");
        switch (p1)
        {
            case Teacher t -> System.out.println(p1.name + " is a teacher");
            case Student s -> System.out.println(p1.name + " is a student");
            default -> System.out.println(p1.name + " is not a teacher or student");
        }
    }
}