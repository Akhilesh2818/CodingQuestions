package DesignPatterns.Creational;

interface Button {
    void click();
}
interface Checkbox {
    void check();
}

class WinButton implements Button {
    public void click() { System.out.println("Win Click"); }
}
class WinCheckbox implements Checkbox {
    public void check() { System.out.println("Win Checkbox"); }
}

class MacButton implements Button {
    public void click() { System.out.println("Mac Click"); }
}
class MacCheckbox implements Checkbox {
    public void check() { System.out.println("Mac Checkbox"); }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WinFactory implements GUIFactory {
    public Button createButton() { return new WinButton(); }
    public Checkbox createCheckbox() { return new WinCheckbox(); }
}

class MacFactory implements GUIFactory {
    public Button createButton() { return new MacButton(); }
    public Checkbox createCheckbox() { return new MacCheckbox(); }
}
