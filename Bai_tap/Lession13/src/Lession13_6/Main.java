package Lession13_6;


public class Main {
    public static void main(String[] args) {
        TaskManament manager = new TaskManament();
        boolean running = true;

        while (running) {
            System.out.println("\n========= QUẢN LÝ TO-DO LIST =========");
            System.out.println("1. Thêm công việc");
            System.out.println("2. Liệt kê công việc");
            System.out.println("3. Cập nhật trạng thái");
            System.out.println("4. Xóa công việc");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6. Thống kê");
            System.out.println("7. Thoát");

            int choice = Validator.readInt("Chọn chức năng: ", 1, 7);

            switch (choice) {
                case 1:
                    String name = Validator.readString("Nhập tên công việc: ");
                    String status = Validator.readString("Nhập trạng thái (Chưa xong/Đã xong): ");
                    manager.addTask(name, status);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    int idUp = Validator.readInt("Nhập ID cần cập nhật: ", 1, Integer.MAX_VALUE);
                    String newStatus = Validator.readString("Trạng thái mới: ");
                    manager.updateTaskStatus(idUp, newStatus);
                    break;
                case 4:
                    int idDel = Validator.readInt("Nhập ID cần xóa: ", 1, Integer.MAX_VALUE);
                    manager.deleteTask(idDel);
                    break;
                case 5:
                    String sName = Validator.readString("Nhập tên cần tìm: ");
                    manager.searchTaskByName(sName);
                    break;
                case 6:
                    manager.taskStatistics();
                    break;
                case 7:
                    running = false;
                    System.out.println("Tạm biệt!");
                    break;
            }
        }
    }
}