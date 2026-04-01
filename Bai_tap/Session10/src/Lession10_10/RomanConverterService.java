package Lession10_10;

import java.util.ArrayList;
import java.util.List;

public class RomanConverterService {
    private final List<RomanMapping> mappings;

    public RomanConverterService() {
        mappings = new ArrayList<>();
        // Khởi tạo các mốc giá trị từ lớn đến nhỏ
        mappings.add(new RomanMapping(1000, "M"));
        mappings.add(new RomanMapping(900, "CM"));
        mappings.add(new RomanMapping(500, "D"));
        mappings.add(new RomanMapping(400, "CD"));
        mappings.add(new RomanMapping(100, "C"));
        mappings.add(new RomanMapping(90, "XC"));
        mappings.add(new RomanMapping(50, "L"));
        mappings.add(new RomanMapping(40, "XL"));
        mappings.add(new RomanMapping(10, "X"));
        mappings.add(new RomanMapping(9, "IX"));
        mappings.add(new RomanMapping(5, "V"));
        mappings.add(new RomanMapping(4, "IV"));
        mappings.add(new RomanMapping(1, "I"));
    }

    public String toRoman(int number) {
        if (number < 1 || number > 3999) {
            throw new IllegalArgumentException("Số phải nằm trong khoảng 1-3999");
        }

        StringBuilder result = new StringBuilder();
        int temp = number;

        for (RomanMapping mapping : mappings) {
            while (temp >= mapping.getValue()) {
                result.append(mapping.getSymbol());
                temp -= mapping.getValue();
            }
        }
        return result.toString();
    }
}