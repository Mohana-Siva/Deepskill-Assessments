class RemoteControll{
    private Command command;

    public void press(Command command) {
        this.command = command;
        this.command.execute();
    }
}
public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command on = new LightOnCommand(light);
        Command off = new LightOffCommand(light);
        RemoteControll remote = new RemoteControll();
        remote.press(on);
        remote.press(off);
    }
}
