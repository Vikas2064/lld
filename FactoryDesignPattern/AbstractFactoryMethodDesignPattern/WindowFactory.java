public class WindowFactory implements IFactory {
     public IText createText(){
         return new WindowText();
     }
     public IButton createButton(){
         return new WindowButton();
     }
}
