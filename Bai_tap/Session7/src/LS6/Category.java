package LS6;

public class Category {
    // thuộc tính
    private String id;
    private String name;
    private String description;
    // tạo constraction
    public Category (String id,String name,String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }
    // get

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    // set

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}