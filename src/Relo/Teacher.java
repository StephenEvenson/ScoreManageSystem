package Relo;

public class Teacher {
    private String name;
    private String number;
    private String secret;

    public Teacher(String name, String number, String secret) {
        this.name = name;
        this.number = number;
        this.secret = secret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
