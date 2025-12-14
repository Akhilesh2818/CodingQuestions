package DesignPatterns.Creational;

interface Notification {
    void notifyUser();
}

class SMSNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending SMS");
    }
}

class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Sending Email");
    }
}

class FactoryMethod {
    public static Notification getNotification(String type) {
        return switch (type) {
            case "SMS" -> new SMSNotification();
            case "EMAIL" -> new EmailNotification();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}

