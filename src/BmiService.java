public class BmiService {
    public double calculate(double height, int weight) {
        double index = (weight/(height*height));
        int a =(int) index;
        return a;
    }
}
