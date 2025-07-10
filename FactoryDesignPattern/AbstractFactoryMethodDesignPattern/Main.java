class Main{
    public static void main(String []args){
        GuiFactory factory= new MacFactory();
        IButton macButton= factory.createButton();
        macButton.clickButton();
    }
}