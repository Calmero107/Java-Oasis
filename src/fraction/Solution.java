package fraction;

/**
 * Đối tượng phân số.
 */
public class Solution {
    private int numerator;  // Tử số của phân số
    private int denominator; // Mẫu số của phân số

    /**
     * Lấy giá trị tử số.
     *
     * @return Tử số của phân số.
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Thiết lập giá trị tử số.
     *
     * @param numerator Tử số cần thiết lập.
     */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Lấy giá trị mẫu số.
     *
     * @return Mẫu số của phân số.
     */
    public int getDenominator() {
        return denominator;
    }

    /**
     * Thiết lập giá trị mẫu số.
     * Nếu mẫu số là 0, mẫu số sẽ được thiết lập thành 1.
     *
     * @param denominator Mẫu số cần thiết lập.
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            this.denominator = 1;
            return;
        }
        this.denominator = denominator;
    }

    /**
     * Khởi tạo một phân số với mẫu số mặc định là 1.
     */
    public Solution() {
        this.denominator = 1;
    }

    /**
     * Khởi tạo một phân số với tử số và mẫu số cho trước.
     * Nếu mẫu số là 0, mẫu số sẽ được thiết lập thành 1.
     *
     * @param numerator   Tử số.
     * @param denominator Mẫu số.
     */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
            return;
        }
        this.denominator = denominator;
    }

    /**
     * Giảm phân số về dạng tối giản.
     *
     * @return Phân số đã giảm.
     */
    public Solution reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return this;
    }

    /**
     * Cộng hai phân số.
     *
     * @param solution Phân số cần cộng.
     * @return Phân số kết quả sau khi cộng.
     */
    public Solution add(Solution solution) {
        numerator = this.numerator * solution.denominator + solution.numerator * this.denominator;
        denominator *= solution.denominator;
        return this.reduce();
    }

    /**
     * Trừ hai phân số.
     *
     * @param solution Phân số cần trừ.
     * @return Phân số kết quả sau khi trừ.
     */
    public Solution subtract(Solution solution) {
        numerator = this.numerator * solution.denominator - solution.numerator * this.denominator;
        denominator *= solution.denominator;
        return this.reduce();
    }

    /**
     * Nhân hai phân số.
     *
     * @param solution Phân số cần nhân.
     * @return Phân số kết quả sau khi nhân.
     */
    public Solution multiply(Solution solution) {
        if (solution.denominator == 0) {
            solution.denominator = 1;
        }
        numerator *= solution.numerator;
        denominator *= solution.denominator;
        return this.reduce();
    }

    /**
     * Chia một phân số cho phân số khác.
     *
     * @param solution Phân số chia.
     * @return Phân số kết quả sau khi chia.
     */
    public Solution divide(Solution solution) {
        if (solution.numerator * solution.denominator == 0) {
            return this;
        }
        numerator *= solution.denominator;
        denominator *= solution.numerator;
        return this.reduce();
    }

    /**
     * So sánh hai phân số.
     *
     * @param obj Đối tượng cần so sánh.
     * @return true nếu hai phân số bằng nhau, false nếu không.
     */
    public boolean equals(Object obj) {
        if (!(obj instanceof Solution)) {
            return false;
        }

        Solution solution = (Solution) obj;
        solution.reduce();
        this.reduce();

        return numerator == solution.numerator && denominator == solution.denominator;
    }

    /**
     * Tính ước số chung lớn nhất của hai số.
     *
     * @param a Số thứ nhất.
     * @param b Số thứ hai.
     * @return GCD của hai số.
     */
    public static int gcd(int a, int b) {
        a = (a > 0) ? a : -a;
        b = (b > 0) ? b : -b;

        int min = Math.min(a, b);
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }
}

