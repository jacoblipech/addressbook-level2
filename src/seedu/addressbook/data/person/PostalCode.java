package seedu.addressbook.data.person;

public class PostalCode {

    private String value;

    public PostalCode(String postalCode){
        this.value = postalCode;
    }

    public String getPostalCode(){
        return this.value;
    }
}