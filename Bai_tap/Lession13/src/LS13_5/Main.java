package LS13_5;


public class Main {
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();
        boolean running = true;

        while (running) {
            System.out.println("\n========= CHƯƠNG TRÌNH QUẢN LÝ PHIM =========");
            System.out.println("1. Thêm phim mới");
            System.out.println("2. Hiển thị danh sách phim");
            System.out.println("3. Cập nhật thông tin phim");
            System.out.println("4. Xóa phim");
            System.out.println("5. Thoát");

            // Sử dụng Validator để bắt lỗi nhập menu không phải là số 1-5
            int choice = Validator.readInt("Mời bạn chọn chức năng: ", 1, 5);

            switch (choice) {
                case 1:
                    System.out.println("\n--- THÊM PHIM MỚI ---");
                    String title = Validator.readString("Nhập tiêu đề phim: ");
                    String director = Validator.readString("Nhập tên đạo diễn: ");
                    int year = Validator.readInt("Nhập năm phát hành: ", 1888, 2026);
                    manager.addMovie(title, director, year);
                    break;

                case 2:
                    manager.listMovies();
                    break;

                case 3:
                    System.out.println("\n--- CẬP NHẬT PHIM ---");
                    int idUpdate = Validator.readInt("Nhập ID phim cần sửa: ", 1, Integer.MAX_VALUE);
                    String newTitle = Validator.readString("Nhập tiêu đề mới: ");
                    String newDirector = Validator.readString("Nhập đạo diễn mới: ");
                    int newYear = Validator.readInt("Nhập năm phát hành mới: ", 1888, 2026);
                    manager.updateMovie(idUpdate, newTitle, newDirector, newYear);
                    break;

                case 4:
                    System.out.println("\n--- XÓA PHIM ---");
                    int idDelete = Validator.readInt("Nhập ID phim cần xóa: ", 1, Integer.MAX_VALUE);
                    manager.deleteMovie(idDelete);
                    break;

                case 5:
                    System.out.println("Đang thoát chương trình... Tạm biệt!");
                    running = false;
                    break;
            }
        }
    }
}