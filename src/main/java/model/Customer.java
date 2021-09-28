package model;

public class Customer {
    private String name;
    private String address;
    private String birthday;
    private String imageLink;

    public Customer() {
    }

    public Customer(String name, String address, String birthday, String imageLink) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.imageLink = imageLink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
