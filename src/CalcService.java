public class CalcService {
    public long calculate (long ammount, long year) {
        long percent = 999;
        long payment = ammount * percent / year / 12 / 100;
        return payment;
    }

}
