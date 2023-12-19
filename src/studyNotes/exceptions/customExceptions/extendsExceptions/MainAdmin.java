package studyNotes.exceptions.customExceptions.extendsExceptions;

import studyNotes.exceptions.customExceptions.InvalidLoginException;

public class MainAdmin {
    public static void main(String[] args) {
        User user = new User();
        Admin admin = new Admin();
        
        try {
            admin.save();
        } catch (InvalidLoginException e) {
            e.printStackTrace();
        }
    }
}
