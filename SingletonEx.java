public class  SingletonEx {
    private static  SingletonEx instance=null;
    private SingletonEx(){

    }

    public  static SingletonEx getInstance() {
        if (instance == null) {
            instance = new SingletonEx();
        }
        return  instance;
    }
}
