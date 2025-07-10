class WindowFactory implements GuiFactory{
    public IButton createButton(){
        return new WindowButton();
    }

    public IText createText(){
        return new WindowText();
    }
}