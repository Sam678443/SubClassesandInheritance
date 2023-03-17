public class MicroComputer extends Computer {
  String display;

  public MicroComputer(double memory, double gpu, double motherboard, double cpu) {
    super(memory, gpu, motherboard, cpu);
  }

  public MicroComputer() {
  }

  @Override
  public void display() {
    System.out.println("Hey I'm a MicroComputer");
  }
}
