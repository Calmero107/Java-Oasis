package junit;

public class Week4 {
    /**
     * Tìm giá trị lớn nhất giữa hai số nguyên.
     *
     * @param a Số thứ nhất.
     * @param b Số thứ hai.
     * @return Giá trị lớn nhất giữa a và b.
     */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Tìm giá trị nhỏ nhất trong mảng số nguyên.
     *
     * @param array Mảng số nguyên cần tìm giá trị nhỏ nhất.
     * @return Giá trị nhỏ nhất trong mảng.
     */
    public static int minArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    /**
     * Tính chỉ số khối cơ thể (BMI) dựa trên cân nặng và chiều cao.
     *
     * @param weight Cân nặng (kg).
     * @param height Chiều cao (m).
     * @return Một chuỗi mô tả tình trạng cơ thể dựa trên chỉ số BMI.
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        double bmiRoundOne = Math.round(bmi * 10.0) / 10.0;
        if (bmiRoundOne < 18.5) {
            return "Thiếu cân";
        } else if (bmiRoundOne < 22.9) {
            return "Bình thường";
        } else if (bmiRoundOne < 24.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
