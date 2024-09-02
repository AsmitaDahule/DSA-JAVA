import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter empId");
        int empId = sc.nextInt();
        System.out.println("Enter department");
        String dept = sc.next();

        switch (empId) {
            case 1:
                System.out.println("Id is 1");
                break;
            case 2:
                System.out.println("Id is 2");
                break;
            case 3:
                System.out.println("Id is 3");

                switch (dept) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                    default:
                        System.out.println("Enter valid department");
                }
                break;
            default:
                System.out.println("Enter valid empId");
        }

    }
}
