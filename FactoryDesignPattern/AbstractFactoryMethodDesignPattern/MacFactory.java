public class MacFactory implements IFactory {
     public IText createText(){
         return new MacText();
     }
     public IButton createButton(){
         return new MacButton();
     }
}
