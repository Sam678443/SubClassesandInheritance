public class App {
    public static void main(String[] args) throws Exception {
        Computer computer = new Computer();
        computer.display(); // Hey I'm a Computer
        computer = new MicroComputer();
        computer.display();// Hey I'm a MicroComputer
        computer = new ServerComputer();
        computer.display(); // Hey I'm a ServerComputer
    }
}
