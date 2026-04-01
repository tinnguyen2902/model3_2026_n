package Lession10_4;

public class Students {
    private int id;
    private String name;

    public Students(String name, int id) {
        this.name = name;
        this.id = id;
    }
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

    @Override
    public String toString() {
        return "ID : " +id +" , Tên sinh viên: " + name;
    }

}