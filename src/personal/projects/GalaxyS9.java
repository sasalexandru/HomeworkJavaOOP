package personal.projects;

import java.util.ArrayList;
import java.util.Arrays;

public class GalaxyS9 extends Samsung {

    public GalaxyS9(String colour, String material) {
        super(1000, colour, material, "389473289132");
    }

    @Override
    void sendMessage(String phoneNumber, String message) {
        if(messages.containsKey(phoneNumber)){
            messages.get(phoneNumber).add(message);

            System.out.println("Message was sent to -> " + phoneNumber);
        }else{
            messages.put(phoneNumber,new ArrayList<>(Arrays.asList(message)));
            System.out.println("Message was sent to -> " + phoneNumber);
        }
    }

    @Override
    void listMessage(String phoneNumber) {
        System.out.println("Message list");
        if(messages.containsKey(phoneNumber)){
            System.out.println(messages);
        } else {
            System.out.println("Phone number is not in the list");
        }
    }


    @Override
    public Contact createContact(Contact contact) {
        if (findContact(contact.getPhoneNumber()) >= 0) {
            System.out.println("Phone number is already in the list -> " + contact.getPhoneNumber());

        } else {
            System.out.println(contact.getPhoneNumber() + " was added to the list!");
            contacts.add(contact);
        }
        return contact;
    }

    @Override
    public void listContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.contacts.size(); i++) {
            System.out.println(contacts.get(i).getContactNumber() + " -> " +
                    contacts.get(i).getFirstName() + " -> " +
                    contacts.get(i).getLastName() + " -> " + contacts.get(i).getPhoneNumber());
        }
    }

    private int findContact(String contactPhoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getPhoneNumber().equals(contactPhoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void callContact(String phoneNumber) {

        if (findContact(phoneNumber) >= 0) {
            callHistory.add(phoneNumber);
            if (findContact(phoneNumber) >= 0) {

                System.out.println("Phone number called -> " + phoneNumber);
            }
        } else {
            System.out.println("This phone number is not available in your list!");
        }

    }

    @Override
    public void callHistory() {
        System.out.println("Call History List");
        for (int i = 0; i < callHistory.size(); i++) {
            System.out.println((i + 1) + "." +
                    callHistory.get(i));
        }
    }

}
