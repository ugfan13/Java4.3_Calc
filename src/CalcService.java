public class CalcService {
    public long calculate (long ammount, long year) {
        double percent = 9.99 / 12 / 100;
        double coefficient = Math.pow ((1 + percent), year * 12); // коэффициент возведения в степень
        double annuitant = percent * coefficient / (coefficient - 1);
        double payment = ammount * annuitant;
        return (long) payment;
    }

}
