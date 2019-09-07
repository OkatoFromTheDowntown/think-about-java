package main.java.http.server.user;

import main.java.http.server.annotation.Validate;

public class Passport {

    @Validate(type = Validate.ValidateType.STRING, require = Validate.Require.TRUE)
    private String name;

    @Validate(type = Validate.ValidateType.NUMBER, require = Validate.Require.TRUE)
    private String id;

    public Passport(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public static PassportBuilder builder() {
        return new PassportBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passport: " + this.getId() + "," + this.getName();
    }

    public static class PassportBuilder {

        private String name;

        private String id;

        PassportBuilder() {
        }

        public PassportBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PassportBuilder id(String id) {
            this.id = id;
            return this;
        }

        public Passport build() {
            return new Passport(this.name, this.id);
        }
    }

}
