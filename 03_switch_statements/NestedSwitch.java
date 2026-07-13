import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empId = sc.nextInt();
        String department = sc.next();

        switch (empId) {
            case 1:
                System.out.println("Abhiyanshu Sharma");
                break;
            case 2:
                System.out.println("Harsh Ahuja");
                break;
            case 3  :
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CS":
                        System.out.println("CS Department");
                        break;
                
                    default:
                        System.out.println("Enter a valid Department");
                        break;
                }
                break;
        
            default:
                System.out.println("Enter a valid Employee ID");
                break;
        }

        // Better way to write it
        switch (empId) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Rahul Rana");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

        sc.close();
    }    
}
