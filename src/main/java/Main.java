import ru.netology.sqr.SqrtService;

public class Main {
    public static void main(String[] args) {

        SqrtService service = new SqrtService();
        int count = service.calcSqrt(200, 300);

        System.out.println(count);

    }
}
