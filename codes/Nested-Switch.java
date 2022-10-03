import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("please enter the employee id and department ");
        int empid = in.nextInt();
        String department = in.next();

        switch (empid){
            case 1 :
                System.out.println("Ajay");
                break;
            case 2:
                System.out.println("Hritik");
                break;
            case 3:
                switch (department){
                    case "IT":
                        System.out.println("IT department ");
                        break;
                    case "management":
                        System.out.println("management department ");
                        break;
                    default:
                        System.out.println("please enter a correct department ");
                        break;
               }

            default:
               System.out.println("please give the correct employee id");
               break;
        }
        in.close();
    
    }
}
