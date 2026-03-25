package LS7;
//fraction: phân số
public class Fraction {
    // thuộc tính
    private int numerator;  //tử số
    private int denominator;  // mẫu số
    // contraction
    public Fraction(int numerator, int denominator) {
        // looại bỏ mẫu = 0;
        if (denominator == 0){
            throw new IllegalArgumentException("Mẫu số không thể bằng 0.");  //throw từ khóa dùng để ném ngoại lệ, new khởi tạo một đối tượng mới từ một lớp ngoại lệ
            // cú pháp throw new<Tên lớp ngoại lệ>("Thông điệp lỗi"); giúp ngăn chặn một hành vi sai
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
    //get

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    // set: dùng để thay đổi thuộc tính

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator ==0){  // cần check ở đây vì nếu khi thay đổi vẫn có trường hợp bị thay đổi thành số 0
            throw new IllegalArgumentException("Mẫu không thể bằng 0.");
        }
        this.denominator = denominator;
    }
    // phương thức rút gọn
    public int findUocMax(int a,int b){
        a = Math.abs(a);  // tìm ước chung lớn nhất nên phải loại bỏ số âm đi (ví dụ ước của 4 là 4,2,1,-1,-2,-4 nên ước lớn nhất là 4 luôn dương với mọi số
        b = Math.abs(b);  //Math.abs lấy giá trị tuyệt đối
        while (b !=0){     // chạy đến chừng nào b còn khác 0
            int temp = b;  // ban đầu gán temp = b
            b = a%b;      // b = số dư của a chia b ví dụ 16/20 dư 4 => 4 là số dư của 16 vs 20
            a = temp;     // gán số dư bằng a
        }
        return a;  // trả về a
        // hàm findUocMax giúp tìm ước chung lớn nhất của tử và mẫu
        // hàm simplify giúp thay đổi giá trị tử / mẫu của phân số và xử lý dấu.
    }
    public void simplify(){
        // tìm ước chung lớn nhất
        int uocMax = findUocMax(this.numerator,this.denominator);  // rút gọn phân số
        this.numerator /= uocMax; // tử số = tử số / ước chung max
        this.denominator /= uocMax;  // mẫu số = mẫu số / ước chung max
        // nếu phân số âm thì chuyển dấu trừ lên tử số => dùng if
        if (this.denominator < 0){
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }
    // phương thức cộng phân số hiện tại với 1 phân số khác trả về 1 fraction mới
    // công thức : a/b + c/d = (ad+bc)/bd
    public Fraction add(Fraction phanSo2){
        // kq tử số mới = ad+bc
        int tuNew = this.numerator*phanSo2.denominator + this.denominator*phanSo2.numerator;
        // mẫu mới = bd
        int mauNew = this.denominator*phanSo2.denominator;
        Fraction result = new Fraction(tuNew,mauNew);
        result.simplify();
        return result;
    }
    // phương thức trừ công thức tương tự
    public Fraction subtract(Fraction phanSoTru2){
        int tuTruNew = this.numerator* phanSoTru2.denominator - this.denominator*phanSoTru2.numerator;
        int mauTruNew = this.denominator* phanSoTru2.denominator;
        Fraction phanSoTru = new Fraction(tuTruNew,mauTruNew);
        phanSoTru.simplify();
        return phanSoTru;
    }
    // phương thức nhân  phân số
    public  Fraction multiply(Fraction phanSoNhan){
        int tuNhanNew = this.numerator* phanSoNhan.numerator;
        int mauNhanNew = this.denominator* phanSoNhan.denominator;
        Fraction kqPhanSoNhan = new Fraction(tuNhanNew,mauNhanNew);
        kqPhanSoNhan.simplify();
        return kqPhanSoNhan;
    }
    // phương thức chia
    public Fraction divide(Fraction phanSoChia){
        // check tử mới có phải 0 hay k
        if (phanSoChia.numerator == 0){
            throw new ArithmeticException("Không thể chia phân số có tử bằng 0.");
        }
        int tuChiaNew = this.numerator*phanSoChia.denominator;
        int mauChiaNew = this.denominator* phanSoChia.numerator;
        Fraction kqPhanSoChia = new Fraction(tuChiaNew,mauChiaNew);
        kqPhanSoChia.simplify();
        return kqPhanSoChia;
    }
    // chuyển dổi phân số thành chuổi
    @Override
    public String toString() {
        if (denominator == 1) return String.valueOf(numerator);
        return numerator + "/" + denominator;
    }
}