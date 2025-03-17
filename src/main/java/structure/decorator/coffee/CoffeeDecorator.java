package structure.decorator.coffee;

class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription() {
        return this.decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return this.decoratedCoffee.getCost();
    }
}
