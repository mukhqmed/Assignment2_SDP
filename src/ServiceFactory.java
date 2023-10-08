public class ServiceFactory {
    public static ServeBehavior createService(int choice) {
        switch (choice) {
            case 1:
                return new MenService();
            case 2:
                return new WomenService();
            case 3:
                return new ChildrenService();
            default:
                throw new IllegalArgumentException("Invalid choice");
        }
    }
}
