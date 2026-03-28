package Session8_1;

public class Animals {
        // construction
            private String name;
            private int age;
            //lọc tên để trống & tuổi âm
            public Animals(String name,int age){
                if (name == null || name.isEmpty()){
                    throw new IllegalArgumentException("Tên không được trống.");
                }
                if (age < 0) {
                    throw new IllegalArgumentException("Tuối không được số âm");
                }
                this.name = name;
                this.age = age;
            }

        //get & set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //displayInfo : hiển thị thông tin
     public void displayInto(){
         System.out.println("Tên" +name + ", tuổi: " +age);
     }
        // hiển thị âm thanh
    public String makeSound(){
        return "Some generic sound";
    }
}