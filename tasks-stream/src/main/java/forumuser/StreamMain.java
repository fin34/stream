package forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        ForumUser user1 = new ForumUser(1, "Adam", 'M', 1990, 12, 23, 5);
        ForumUser user2 = new ForumUser(2, "Alicja", 'F', 1999, 12, 23, 6);
        ForumUser user3 = new ForumUser(3, "Andrzej", 'M', 1980, 12, 23, 90);
        ForumUser user4 = new ForumUser(4, "Agnieszka", 'F', 1999, 12, 23, 34);
        List<ForumUser> listOfUser = new ArrayList<>();
        listOfUser.add(user1);
        listOfUser.add(user2);
        listOfUser.add(user3);
        listOfUser.add(user4);
        Forum forum = new Forum(listOfUser);

        Map<Integer, ForumUser> mapOfUser = forum.getUserList().stream()
                .filter(a -> a.getSexUser()=='M')
                .filter(b -> b.getDateOfBirth().plusYears(20).isBefore(LocalDate.now()))
                .filter(c -> c.getNumbOfPosts()>0)
                .collect(Collectors.toMap(ForumUser::getIdUser, forumUser->forumUser));

        for (Map.Entry<Integer, ForumUser> entry:mapOfUser.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
