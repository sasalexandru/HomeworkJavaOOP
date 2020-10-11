package personal.projects;

public class Iphone extends MobilePhone {
    public Iphone(double batteryLyfe, String colour, String material, String imei) {
        super(batteryLyfe, colour, material, imei);
    }

    @Override
    void sendMessage(String phoneNumber, String message) {

    }

    @Override
    void listMessage(String phoneNumber) {

    }

    @Override
    public Contact createContact(Contact contact) {
        return null;
    }

    @Override
    public void listContacts() {

    }

    @Override
    public void callContact(String phoneNumber) {

    }

    @Override
    public void callHistory() {

    }
}
