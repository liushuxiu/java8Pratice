import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

@Data
@AllArgsConstructor
class Apple{
    int weight;

}
public class ww {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(9));
        inventory.add(new Apple(8));
       inventory.stream().forEach(x -> System.out.println(x.getWeight()));

        inventory.sort(comparing(Apple::getWeight));
        inventory.stream().forEach(x -> System.out.println(x.getWeight()));
    }
}
