import com.thoughtworks.gauge.Step;

public class Multiply {

    @Step("<first> x <second>")
    public void multiply(int first, int second) {
        System.out.println("Cevap =" + first * second);
    }
}
