package chatgptcoding;

public class CacheService {

    static {
        System.out.println("CacheService loaded by: " + CacheService.class.getClassLoader());
    }

    private static class Holder {
        static {
            System.out.println("Holder loaded by: " + Holder.class.getClassLoader());
        }

        private static final CacheService INSTANCE = new CacheService();
    }

    public static CacheService getInstance() {
        return Holder.INSTANCE;
    }

    private CacheService() {
        System.out.println("Initializing heavy cache...");
    }

    public static void main(String[] args) {
        CacheService.getInstance();
    }
}
