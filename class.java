class Student

{ int rollno;

String name;

Student (int i, String n)
{
    rollno=i;
    name=n;
}
void show()
{
System.out.println(rollno+" " + name);
}
public static void main(String args [])
{
Student S1 = new Student (1, "sumit");
Student S2 = new Student(2, "Shreyansh");
S1.show();
S2.show();
}}
