package personal.projects;

public interface Phone {
    Contact createContact(Contact contact);

    void listContacts();

    void callContact(String phoneNumber);

    void callHistory();
}
