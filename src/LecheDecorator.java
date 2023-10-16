public class LecheDecorator extends CafeDecorator{
    public LecheDecorator(ICafe cafe) {
        super(cafe);
    }
    @Override
    public double cost() {
        return super.cost() + 1.0;
    }
}
