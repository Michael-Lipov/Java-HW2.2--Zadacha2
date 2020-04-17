public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate (176, 90);
        System.out.println(index);
    }
}