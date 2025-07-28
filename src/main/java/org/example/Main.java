import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> signIns = new ArrayList<>();


        System.out.println("Enter student names (type \"done\" to finish):");
        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) break;
            signIns.add(name);
        }


        ArrayList<String> uniqueNames = new ArrayList<>();
        for (String name : signIns) {
            if (!uniqueNames.contains(name)) {
                uniqueNames.add(name);
            }
        }


        for (int i = 0; i < uniqueNames.size() - 1; i++) {
            for (int j = 0; j < uniqueNames.size() - 1 - i; j++) {
                if (uniqueNames.get(j).compareToIgnoreCase(uniqueNames.get(j + 1)) > 0) {
                    // Swap
                    String temp = uniqueNames.get(j);
                    uniqueNames.set(j, uniqueNames.get(j + 1));
                    uniqueNames.set(j + 1, temp);
                }
            }
        }


        System.out.println("\n+ Total sign-ins: " + signIns.size());
        System.out.println("+ Total unique students: " + uniqueNames.size());
        System.out.print("+ Attendance list: [");
        for (int i = 0; i < uniqueNames.size(); i++) {
            System.out.print(uniqueNames.get(i));
            if (i < uniqueNames.size() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
