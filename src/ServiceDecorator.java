public abstract class ServiceDecorator implements ServeBehavior{
    protected ServeBehavior serveBehavior;

    public ServiceDecorator(ServeBehavior serveBehavior) {
        this.serveBehavior = serveBehavior;
    }

    @Override
    public void serve() {
        serveBehavior.serve();
    }
}
