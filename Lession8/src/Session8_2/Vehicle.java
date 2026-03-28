package Session8_2;
  //vehicle : phương tiện giao thông
public abstract class Vehicle {
    // tạo thuộc tính
      private String name;
      private int speed;
    // contruction
      public Vehicle(String name, int speed) {
          this.name = name;
          this.speed = speed;
      }
     // phương thức trừu tượng
        public abstract void displayInfo();
     // phương thức thông thường

      public void start(){
          System.out.println("Vehicle is starting..");
      }
      // get

      public String getName() {
          return name;
      }

      public int getSpeed() {
          return speed;
      }
  }