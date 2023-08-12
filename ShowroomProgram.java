import java.util.Scanner;
public class ShowroomProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Showroom");
        System.out.println("Press 1 for two wheeler & Press 2 for four wheeler");
        int choice = input.nextInt();
        switch(choice) {
            case 1:
                System.out.println("You chose two Wheeler");
                System.out.println("Select a company:");
                System.out.println("1. BMW");   
                System.out.println("2. KAWASAKI");
                System.out.print("Enter your choice: ");
                int companyName = input.nextInt();

                switch (companyName) {
                    case 1:
                        System.out.println("List of BMW Two Wheelers :");
                        System.out.println("1. BMW M 1000 RR");
                        System.out.println("2. BMW F 850 GS");
                        System.out.println("3. BMW K 1600 GTL");
                        System.out.println("4. BMW R 18");
                        System.out.println("5. BMW R 1250 GS Adventure");
                        break;
                    case 2:
                        System.out.println("List of KAWASAKI Two Wheelers:");
                        System.out.println("1. KAWASAKI Z900");
                        System.out.println("2. KAWASAKI NINJA 300");
                        System.out.println("3. KAWASAKI NINJA 1000SX");
                        System.out.println("4. KAWASAKI Z H2 ");
                        break;
                    default:
                        System.out.println("Invalid company name");
                }
                break;

            case 2:
                System.out.println("You chose four Wheeler");
                System.out.println("Select a company:");
                System.out.println("1. BMW");
                System.out.println("2. toyota");
                System.out.print("Enter your choice: ");
                int companyNameFourWheeler = input.nextInt();

                switch (companyNameFourWheeler) {
                    case 1:
                        System.out.println("List of BMW four Wheelers :");
                        System.out.println("1. BMW X1");
                        System.out.println("2. BMW X5");
                        System.out.println("3. BMW Z4");
                        System.out.println("4. BMW M2");
                        System.out.println("5. BMW X7");
                        break;
                    case 2:
                        System.out.println("List of toyota Two Wheelers:");
                        System.out.println("1. toyota fortunure");
                        System.out.println("2. toyota hilux");
                        System.out.println("3. toyota hyryde");
                        System.out.println("4. toyota innova crysta");
                        break;
                    default:
                        System.out.println("Invalid company name");
                }
                break;

            default:
                System.out.println("invalid choice");
        }  

        input.close();

    }
}
