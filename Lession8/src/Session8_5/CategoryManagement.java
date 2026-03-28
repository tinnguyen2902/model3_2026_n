package Session8_5;


public class CategoryManagement implements ICrud {
    // thuộc tính
    private Category[] categories = new Category[100];  // tạo mảng chứa tối đa 100 danh mục
    private  int count = 0; // biến đếm
    // 1. trả về mảng hiện có
    @Override
    public Category[] findAll(){
        // tạo mảng mới chứa các phần tử đang hiện hữu
        Category[] currentList = new Category[count];
        for (int i = 0;i<count;i++){
            currentList[i] = categories[i];
        }
        return currentList;
    }
    //2. thêm mới
    @Override  // ghi đè
    public void addCategory(Category category) {
        if (category instanceof Category) {
            if (count < categories.length) {
                categories[count] = category;
                count++;
                System.out.println("Thêm thành công.");
            } else {
                System.out.println("Danh sách đầy.");
            }
        }
    }
    // 3. cập nhật
        @Override
        public void updateCategory(Category category) {
            // Duyệt tìm ID để cập nhật
            for (int i = 0; i < count; i++) {
                if (categories[i].getId() == category.getId()) {
                    categories[i] = category;
                    System.out.println("Cập nhật thành công.");
                    return;
                }
            }
            System.out.println("Không tìm thấy ID phù hợp.");
        }
    // 4. xóa
    @Override
    public void deleteById(int id) {
        for (int i =0;i<count;i++){
            if (categories[i].getId() == id){
                // dịch mảng để xóa
                for (int j = i;j< count-1;j++){
                    categories[j] = categories[j+1];
                }
                categories[count-1] = null;  // xóa cuối
                count --;
                System.out.println("Xóa thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy ID để xóa");
    }

}