public class AzucarDecorator extends  CafeDecorator{
    public AzucarDecorator(ICafe cafe) {
        super(cafe);
    }
    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
