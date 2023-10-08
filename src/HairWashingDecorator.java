public class HairWashingDecorator extends ServiceDecorator {
    public HairWashingDecorator(ServeBehavior serveBehavior) {
        super(serveBehavior);
    }

    @Override
    public void serve() {
        super.serve();
        System.out.println("Hair washing is added");
    }

}
