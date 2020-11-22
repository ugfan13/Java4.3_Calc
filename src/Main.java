public class Main {
    public static void main(String[] args) {
        CalcService service = new CalcService();
        long payment1 = service.calculate( 1_000_000, 1);
        System.out.println(payment1);

        long payment2 = service.calculate( 1_000_000, 2);
        System.out.println(payment2);

        long payment3 = service.calculate(  1_000_000, 3);
        System.out.println(payment3);
    }
}
