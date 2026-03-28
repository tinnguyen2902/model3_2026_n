package Session9_2;

import Session9_2.Pet;
import Session9_2.Dog;
import Session9_2.Cat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetManagement {
    private static List<Pet> petList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n*********************QUẢN LÝ THÚ CƯNG********************");
            System.out.println("1. Hiển thị danh sách thú cưng");
            System.out.println("2. Thêm thú cưng");
            System.out.println("3. Gọi tiếng kêu (Tất cả)");
            System.out.println("4. Xóa thú cưng");
            System.out.println("5. Tìm thú cưng theo tên");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1: displayAll(); break;
                case 2: addPet(); break;
                case 3: makeSounds(); break;
                case 4: deletePet(); break;
                case 5: findByName(); break;
                case 6: System.out.println("Kết thúc chương trình."); break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    private static void displayAll() {
        if (petList.isEmpty()) {
            System.out.println("Danh sách trống.");
            return;
        }
        for (Pet p : petList) p.displayData();
    }

    private static void addPet() {
        System.out.print("Bạn muốn thêm Chó (1) hay Mèo (2)? ");
        int type = Integer.parseInt(scanner.nextLine());
        Pet p = (type == 1) ? new Dog() : new Cat();

        // Logic kiểm tra mã trùng lặp
        String newId;
        while (true) {
            p.inputData(scanner);
            newId = p.getId();
            boolean isExist = false;
            for (Pet existingPet : petList) {
                if (existingPet.getId().equalsIgnoreCase(newId)) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist) break;
            System.out.println("Lỗi: Mã thú cưng đã tồn tại! Vui lòng nhập lại.");
        }
        petList.add(p);
        System.out.println("Thêm thành công!");
    }

    private static void makeSounds() {
        System.out.println("--- Dàn đồng ca thú cưng ---");
        for (Pet p : petList) {
            System.out.print(p.getName() + " kêu: ");
            p.speak();
        }
    }

    private static void deletePet() {
        System.out.print("Nhập mã thú cưng cần xóa: ");
        String id = scanner.nextLine();
        boolean removed = petList.removeIf(p -> p.getId().equalsIgnoreCase(id));
        System.out.println(removed ? "Xóa thành công!" : "Không tìm thấy mã này.");
    }

    private static void findByName() {
        System.out.print("Nhập tên thú cưng cần tìm: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Pet p : petList) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                p.displayData();
                found = true;
            }
        }
        if (!found) System.out.println("Không tìm thấy thú cưng nào phù hợp.");
    }
}