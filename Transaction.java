import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

enum TransactionType {
    INCOME,
    EXPENSE
}

class Transaction {
    String description;
    double amount;
    Date date;
    TransactionType type;

    public Transaction(String description, double amount, TransactionType type) {
        this.description = description;
        this.amount = amount;
        this.date = new Date();
        this.type = type;
    }
}

public class MoneyManager {

    private List<Transaction> transactions;

    public MoneyManager() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(String description, double amount, TransactionType type) {
        Transaction transaction = new Transaction(description, amount, type);
        transactions.add(transaction);
    }

    public void showTransactions() {
        for (Transaction transaction : transactions) {
            String typeString = (transaction.type == TransactionType.INCOME) ? "Pemasukan" : "Pengeluaran";
            System.out.println("Deskripsi: " + transaction.description);
            System.out.println("Nominal: " + transaction.amount);
            System.out.println("Tanggal: " + transaction.date);
            System.out.println("Tipe: " + typeString);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        MoneyManager moneyManager = new MoneyManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Halaman Utama");
            System.out.println("1. Tambah Pemasukan");
            System.out.println("2. Riwayat Keuangan");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Deskripsi: ");
                    scanner.nextLine(); // Consume newline
                    String description = scanner.nextLine();
                    System.out.print("Nominal: ");
                    double amount = scanner.nextDouble();
                    moneyManager.addTransaction(description, amount, TransactionType.INCOME);
                    System.out.println("Pemasukan berhasil ditambahkan!");
                    break;
                case 2:
                    System.out.println("Riwayat Keuangan");
                    moneyManager.showTransactions();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan Money Manager!");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid.");
            }
        }
    }
}
