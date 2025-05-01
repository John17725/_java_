package Service;

import Exception.*;
import Class.User;

public class UserService {
    public Boolean ValidateUser (String name, String email, int age) throws UsernameInvalidException, EmailInvalidException, AgeInvalidException {
        if (name == null || name.isEmpty() ) {
            throw new UsernameInvalidException("The username cannot be empty");
        }

        if (name.length() < 3){
            throw new UsernameInvalidException("The username must be at least 3 characters");
        }

        if (email == null || email.isEmpty()){
            throw new EmailInvalidException("The email cannot be empty");
        }

        if (!email.contains("@")){
            throw new EmailInvalidException("The email cannot contain @");
        }

        if (age < 18){
            throw new AgeInvalidException("The age must be at least 18");
        }

        return true;

    }
}
