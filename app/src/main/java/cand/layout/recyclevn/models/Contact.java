package cand.layout.recyclevn.models;

public class Contact {
    private String name;
    private String phone;
    private String imageUrl;
    private String win;

    public Contact(String name, String phone, String imageUrl, String win) {
        this.name = name;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.win = win;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }
}
