import java.util.Scanner;

class employee
{
    String name;
    int age;
    String address;

    void getdata()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name Of Employee: ");
        name = sc.nextLine();

        System.out.print("Enter Age Of Employee: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address Of Employee: ");
        address = sc.nextLine();

        System.out.println();
    }

    void showdata()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

        System.out.println();
    }
}


public class EmployeeClass
{
    public static void main(String[] args)
    {
        employee emp = new employee();
        emp.getdata();
        emp.showdata();
    }
}