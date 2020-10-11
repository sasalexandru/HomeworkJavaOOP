package personal.projects;

import java.util.*;

public abstract class MobilePhone implements Phone{
    private double batteryLife;
    private String colour;
    private String material;
    private String imei;
    protected List<Contact> contacts = new ArrayList<>();
    protected Map<String, List<String> > messages = new HashMap<>();
    protected List<String> callHistory = new ArrayList<>();

    public MobilePhone(double batteryLife, String colour, String material, String imei) {
        this.batteryLife = batteryLife;
        this.colour = colour;
        this.material = material;
        this.imei = imei;
    }

    abstract void sendMessage(String phoneNumber, String message);

    abstract void listMessage(String phoneNumber);

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MobilePhone that = (MobilePhone) o;
        return Objects.equals(contacts, that.contacts) &&
                Objects.equals(messages, that.messages) &&
                Objects.equals(callHistory, that.callHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacts, messages, callHistory);
    }
}
