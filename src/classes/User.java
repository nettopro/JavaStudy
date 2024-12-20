package classes;

public class User {
    String name;
    String email;

    public boolean equals(Object obj) {
        
        if(obj instanceof User){
            User other = (User) obj;

            boolean equalName =  other.name.equals(this.name);
            boolean equalEmail = other.email.equals(this.email);    

            return equalName && equalEmail;
        } else {
            return false;
        }
    }
}
