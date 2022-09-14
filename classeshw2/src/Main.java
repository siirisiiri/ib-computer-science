import static ibio.Helpers.*;
public class Main {
    public static void main(String[] args) {
        boolean running = true;
        while (running == true){
            String operation = input("Give operation: ");
            if (operation.equals("end"))
                running = false;
            else {
                int A = inputInt("Give first integer operand: ");
                int B = inputInt("Give second integer operand: ");
                if (operation.equals("add"))
                    output(A + B);
                else if (operation.equals("sub"))
                    output(A - B);
                else
                    output("unknown operation");
            }

        }
    }
}