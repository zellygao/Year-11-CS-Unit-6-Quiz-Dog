public class Owner {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Owner(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLirstName(){
        return lastName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public void setFirstName (){
        this.firstName = firstName;
    }
    public void setLastName (){
        this.lastName = lastName;
    }
    public void setPhoneNumber (){
        this.phoneNumber = phoneNumber;
    }

}
