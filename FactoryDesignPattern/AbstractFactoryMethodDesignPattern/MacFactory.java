class MacFactory implements GuiFactory{
    public IButton createButton(){
        return new MacButton();
    }

    public IText createText(){
        return new MacText();
    }
}