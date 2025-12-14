package DesignPatterns.Creational;

class User {
    private final String name;
    private final int age;
    private final String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }

    static class Builder {
        private String name;
        private int age;
        private String address;

        public Builder name(String name) { this.name = name; return this; }
        public Builder age(int age) { this.age = age; return this; }
        public Builder address(String address) { this.address = address; return this; }

        public User build() {
            return new User(this);
        }
    }
}

