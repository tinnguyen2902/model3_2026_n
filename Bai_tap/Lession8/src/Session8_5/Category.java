package Session8_5;

public class Category {
    // thuộc tính
    private int id;
    private String name;
    private String description;
    //construction khôg tham số

    public Category() {
    }
    // construction full tham số

    public Category(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    //get & set

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}