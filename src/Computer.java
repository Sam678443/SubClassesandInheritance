/**
 * Computer
 */
public class Computer {
  private double memory;
  private double gpu;
  private double cpu;
  private double motherboard;
  private boolean isOn;

  public Computer() {

  }

  public Computer(double memory, double gpu, double motherboard, double cpu) {
    this.memory = memory;
    this.gpu = gpu;
    this.motherboard = motherboard;
    this.cpu = cpu;
  }

  public void display() {
    System.out.println("Hey I'm a Computer");
  }

  public void turnOn() {
    if (isOn == false) {
      isOn = true;
    }
    System.out.println("Computer is on");
  }

  /**
   * @return double return the memory
   */
  public double getMemory() {
    return memory;
  }

  /**
   * @param memory the memory to set
   */
  public void setMemory(double memory) {
    this.memory = memory;
  }

  /**
   * @return double return the gpu
   */
  public double getGpu() {
    return gpu;
  }

  /**
   * @param gpu the gpu to set
   */
  public void setGpu(double gpu) {
    this.gpu = gpu;
  }

  /**
   * @return double return the cpu
   */
  public double getCpu() {
    return cpu;
  }

  /**
   * @param cpu the cpu to set
   */
  public void setCpu(double cpu) {
    this.cpu = cpu;
  }

  /**
   * @return double return the motherboard
   */
  public double getMotherboard() {
    return motherboard;
  }

  /**
   * @param motherboard the motherboard to set
   */
  public void setMotherboard(double motherboard) {
    this.motherboard = motherboard;
  }

  /**
   * @return boolean return the isOn
   */
  public boolean isIsOn() {
    return isOn;
  }

  /**
   * @param isOn the isOn to set
   */
  public void setIsOn(boolean isOn) {
    this.isOn = isOn;
  }

}