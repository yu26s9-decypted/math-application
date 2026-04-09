
public class MathApp {
    public static void main(String[] args) {


        System.out.print("Enter the employee ID:");
        Employee bob = new Employee(25, "Bob Gills", 245000);
        Employee gary = new Employee(122, "Gary Tan", 78000);

        Employee highestPaid;
        if (bob.salary > gary.salary) {
            highestPaid = bob;
        } else {
            highestPaid = gary;
        }
        int highestSalary = Math.max(bob.salary, gary.salary);
        System.out.println(String.format(
                "The highest paid employee is %s, Employee ID: %s with a salary of $%,d",
                highestPaid.name, highestPaid.id, highestPaid.salary
        ));

        int carPrice = 23500;
        int truckPrice = 65000;
        int highestVehiclePrice = Math.max(carPrice, truckPrice);
        System.out.println(String.format("The highest vehicle price is $%,d", highestVehiclePrice));

        double radius = 7.25;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(String.format("The area is %.2f", area));

        double sqrtVar = 5.0;
        double squareRoot = Math.sqrt(sqrtVar);
        System.out.println(String.format("The square root is %.2f", squareRoot));






    }

//    Part 2

}
