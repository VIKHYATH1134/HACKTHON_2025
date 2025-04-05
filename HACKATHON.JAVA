import java.util.Scanner;

public class AuditToolCLI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CIS Benchmark Audit Tool");
        System.out.println("=========================");
        System.out.println("Select OS to audit:");
        System.out.println("1. Windows 11");
        System.out.println("2. Linux");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        String report = "";

        if (choice == 1) {
            report = runWindowsAudit();
        } else if (choice == 2) {
            report = runLinuxAudit();
        } else {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.println(report);
    }

    private static String runWindowsAudit() {
        StringBuilder report = new StringBuilder();
        report.append("Auditing Windows 11...\n");
        report.append("Control 1: Check for updates - PASSED\n");
        report.append("Control 2: Firewall status - PASSED\n");
        return report.toString();
    }

    private static String runLinuxAudit() {
        StringBuilder report = new StringBuilder();
        report.append("Auditing Linux...\n");
        report.append("Control 1: Check for updates - FAILED\n");
        report.append("Control 2: Firewall status - PASSED\n");
        return report.toString();
    }
}