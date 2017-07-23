package multiple.inharitance;

/**
 * Created by Evegeny on 23/07/2017.
 */
public class Son implements Mother,Father {
    @Override
    public void talk() {
        Father.super.talk();
        Mother.super.talk();
    }
}
