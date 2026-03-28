package Session8_5;

public interface ICrud {
    Category[] findAll();   // trả về danh sách all danh mục
    void addCategory(Category category);  // thêm mới
    void updateCategory(Category category);  //cập nhật
    void deleteById(int id);   // xóa
}
