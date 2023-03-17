public class ServerComputer extends Computer {
  private boolean LANConnection;

  public ServerComputer() {
  }

  public ServerComputer(double memory, double gpu, double motherboard, double cpu) {
    super(memory, gpu, motherboard, cpu);
  }

  public void connectToLAN() {
    LANConnection = true;
  }

  @Override
  public void display() {
    System.out.println("Hey I'm a ServerComputer");
  }
}
