package DesignPatterns;

 class SingletonEx {
    private static volatile SingletonEx instance; // volatile is MUST

    private SingletonEx() {}

    public static SingletonEx getInstance() {
        if (instance == null) { // first check (no locking)
            synchronized (Singleton.class) {
                if (instance == null) { // second check (with lock)
                    instance = new SingletonEx();
                }
            }
        }
        return instance;
    }
}


public enum Single{
    INSTANCE;
    public  void display(){
        System.out.println("This is single class enum");
    }
}
