public class BmiService {
    public double calculate (double height, double weight) {
        double index = weight/height*100/2;
        return index;
    }
}
