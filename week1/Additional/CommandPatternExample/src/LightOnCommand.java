public class LightOnCommand implements Command{
    Light l;
    public LightOnCommand(Light l ){
        this.l = l;
    }
    @Override
    public void execute(){
        l.stateOn();
    }
}
