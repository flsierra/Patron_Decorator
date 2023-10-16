public class CafeDecorator implements  ICafe {
    protected ICafe cafe;

    public CafeDecorator(ICafe cafe) {
        this.cafe = cafe;
    }

    @Override
    public double cost() {
        return cafe.cost();
    }
}
