package Lession10_9;

import java.util.HashSet;
import java.util.Set;

public class ContactManager {
    private Set<Contact> contacts = new HashSet<>();

    // 1. Thêm liên lạc
    public void addContact(Contact contact) {
        if (contacts.add(contact)) {
            System.out.println("Đã thêm liên lạc: " + contact.getName());
        } else {
            System.out.println("LỖI: Số điện thoại " + contact.getPhoneNumber() + " đã tồn tại trong danh bạ!");
        }
    }

    // 2. Xóa liên lạc theo số điện thoại
    public void deleteContact(String phoneNumber) {
        Contact target = findContact(phoneNumber);
        if (target != null) {
            contacts.remove(target);
            System.out.println("Đã xóa liên lạc: " + phoneNumber);
        } else {
            System.out.println("Không tìm thấy số điện thoại để xóa.");
        }
    }

    // 3. Tìm kiếm liên lạc theo số điện thoại
    public Contact findContact(String phoneNumber) {
        for (Contact c : contacts) {
            if (c.getPhoneNumber().equals(phoneNumber)) {
                return c;
            }
        }
        return null;
    }

    // 4. Hiển thị danh sách
    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("Danh bạ trống.");
        } else {
            System.out.println("\n--- DANH BẠ ĐIỆN THOẠI ---");
            for (Contact c : contacts) {
                System.out.println(c);
            }
            System.out.println("Tổng số: " + contacts.size());
        }
    }
}