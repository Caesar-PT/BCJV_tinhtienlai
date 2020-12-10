import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money;
        int month = 3;
        double interset_rate;

        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền gửi
        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();

        // Nhập lãi suất
        System.out.println("Enter annual interest rate in percentage: ");
        interset_rate = scanner.nextDouble();

        // Tính lãi suất nhận được
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset += money * (interset_rate/100)/12 * month;
        }

        System.out.println("Total of interset: " + total_interset);
    }
}
