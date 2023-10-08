public class MassageDecorator extends ServiceDecorator {
    public MassageDecorator(ServeBehavior serveBehavior){
        super(serveBehavior);
    }

    @Override
    public void serve() {
        super.serve();
        System.out.println("Massage service is added");
    }
}
