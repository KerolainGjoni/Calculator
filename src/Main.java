import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while (true) {
            System.out.println("Advanced Calculator");
            System.out.println("1.Addiction(+)");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Memory Functions");
            System.out.println("6. Exit");
            System.out.println(" Select an operation (1/2/3/4/5/6/7):");

            int choice = scanner.nextInt();
            if (choice == 6) {
                System.out.println("Exiting Calculator");
                break;
            }
                double result = 0.0;
                double num1;
                double num2;
                switch (choice) {
                    case 1:
                        System.out.println("Enter first number");
                        num1 = scanner.nextDouble();
                        System.out.println("Enter second number");
                        num2 = scanner.nextDouble();
                        result = calculator.gjejShumen(num1, num2);
                        break;
                    case 2:
                        System.out.println("Enter first number");
                        num1 = scanner.nextDouble();
                        System.out.println("Enter second number");
                        num2 = scanner.nextDouble();
                        result = calculator.gjejZbritjen(num1, num2);
                        break;
                    case 3:
                        System.out.println("Enter first number");
                        num1 = scanner.nextDouble();
                        System.out.println("Enter second number");
                        num2 = scanner.nextDouble();
                        result = calculator.gjejShumzimin(num1, num2);
                        break;
                    case 4:
                        System.out.println("Enter first number");
                        num1 = scanner.nextDouble();
                        System.out.println("Enter second number");
                        num2 = scanner.nextDouble();
                        result = calculator.gjejPjestimin(num1, num2);
                        break;
                    case 5:
                        handleMemoryFunctions(scanner, calculator);
                        continue;
                    default:
                        System.out.println("Invalid choice of menu");
                        continue;
                }
                System.out.println("Result:" + result);

            }
        }
        private static void handleMemoryFunctions (Scanner scanner,Calculator calculator){
            System.out.println("Memory Functions");
            System.out.println("1.Add to Memory(M+)");
            System.out.println("2.Clear Memory(MC)");
            System.out.println("3.Recall Memory(MR)");
            System.out.println("Select a memory function (1/2/3)");
            int memoryChoice = scanner.nextInt();
            switch (memoryChoice) {
                case 1:
                    System.out.println("Enter value to add to memory:");
                    double valueToAdd = scanner.nextDouble();
                    calculator.addToMemory(valueToAdd);
                    System.out.println("Value added to memory");
                    break;
                case 2:
                    calculator.clearMemory();
                    System.out.println("Memory cleared");
                    break;
                case 3:
                    double recallValue = calculator.recallMemory();
                    System.out.println("Value recalled from memory:" + recallValue);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        }


    }

