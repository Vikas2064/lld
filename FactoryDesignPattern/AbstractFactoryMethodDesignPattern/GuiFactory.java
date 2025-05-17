import java.util.Objects;

public class GuiFactory {
    public static IFactory createFactory(String osType){
        if(Objects.equals(osType, "Mac")){
            return new MacFactory();
        }
        else if(Objects.equals(osType, "Window")){
            return new WindowFactory();
        }
        return null;
    }
}
