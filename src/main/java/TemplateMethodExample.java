import model.MobilePhone;
import model.impl.Iphone;
import model.impl.Samsung;

public class TemplateMethodExample {
    public static void main(String[] args) {
        MobilePhone iPhone = new Iphone();
        MobilePhone samsung = new Samsung();
        iPhone.fullSilenceMode();
        samsung.fullSilenceMode();



    }
}
