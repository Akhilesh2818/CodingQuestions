public class CheckClasspath {
    public static void main(String[] args) {
        System.out.println("=== Runtime Classpath ===");
        String cp = System.getProperty("java.class.path");
        for (String path : cp.split(System.getProperty("path.separator"))) {
            System.out.println(path);
        }
    }
}