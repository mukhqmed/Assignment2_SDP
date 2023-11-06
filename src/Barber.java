public class Barber {
    ServeBehavior service;
    public Barber(ServeBehavior service) {
        this.service = service;
    }
    public void serve(){
        service.serve();
    }
}
