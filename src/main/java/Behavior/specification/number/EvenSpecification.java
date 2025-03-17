package Behavior.specification.number;

public class EvenSpecification implements Specification{
    @Override
    public boolean isSatisfiedBy(int number) {
        return number % 2 == 0;
    }
}
