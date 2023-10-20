public class Crema extends CafeDecorator{
    public Crema(ICafe cafe) {
        super(cafe);
    }
    @Override
    public double cost() {
        return super.cost() + 2.5;
    }
}
