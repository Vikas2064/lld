public class Main {
    public static void main(String []args){
        IFactory factory= GuiFactory.createFactory("Mac");

        IButton butt = factory.createButton();
        butt.press();
        IText text= factory.createText();
        text.setText();
    }
}
