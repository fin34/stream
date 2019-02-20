package forumuser;

import java.time.LocalDate;

public class ForumUser {

    private int idUser;
    private String userName;
    private char sexUser;
    private LocalDate dateOfBirth;
    private int numbOfPosts;

    public ForumUser(int idUser, String userName, char sexUser, int year, int month, int day, int numbOfPosts) {
        this.idUser = idUser;
        this.userName = userName;
        this.sexUser = sexUser;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.numbOfPosts = numbOfPosts;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getUserName() {
        return userName;
    }

    public char getSexUser() {
        return sexUser;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumbOfPosts() {
        return numbOfPosts;
    }

    @Override
    public String toString() {
        return "{" +
                "userName='" + userName + '\'' +
                ", sexUser=" + sexUser +
                ", dateOfBirth=" + dateOfBirth +
                ", numbOfPosts=" + numbOfPosts +
                '}';
    }
}
