import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Hapus Tugas");
            System.out.println("3. Tampilkan Tugas");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi ini (1/2/3/4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1 :
                    System.out.println("Masukkan deskripsi tugas : ");
                    String description = scanner.nextLine();
                    Task newTask = new Task(description);
                    toDoList.addTask(newTask);
                    System.out.println("Tugas telah ditambahkan!");
                    break;
                case 2:
                    System.out.print("Masukkan nomor tugas yang ingin dihapus : ");
                    int taskNumber = scanner.nextInt();
                    Task taskToRemove = toDoList.getTask(taskNumber - 1);
                    toDoList.removeTask(taskToRemove);
                    System.out.println("Tugas telah dihapus!");
                    break;
                case 3 :
                    toDoList.displayTasks();
                    break;
                case 4 :
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid.");
                    break;            


            }
        }
    }
    
}
