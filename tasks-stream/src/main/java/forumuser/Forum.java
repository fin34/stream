package forumuser;

import java.util.List;

public class Forum {

    private List<ForumUser> listOfUser;

    public Forum(List<ForumUser> listOfUser) {
        this.listOfUser = listOfUser;
    }

    public List<ForumUser> getUserList(){
        return listOfUser;
    }
}
