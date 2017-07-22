
package wepa.k2017.htyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import wepa.k2017.htyo.domain.Discussion_User;

/**
 *
 * @author THyyppä
 */
@Service
public class UserService {
    
    @Autowired
    private DiscussionUserRepository discussionUserRepository;
    // käytetyt oliot
    private Discussion_User discussion_User;
    
    //Users
    public void createUser(Model model, String user_Name, String password) {
       this.discussion_User = new Discussion_User(user_Name, password); //CREATE
       discussionUserRepository.save(discussion_User);
       model.addAttribute("user", discussion_User);
    }

    public void deleteUser(Long userId) {
        discussionUserRepository.delete(userId);
    }

    public void getOneUser(Model model, Long userId) {
       //DiscussionUser user = discussionUserRepository.findOne(userId);
        //Do update here !
        //discussionRepository.save(user); //UPDATE/WRITE
        model.addAttribute("user", discussionUserRepository.findOne(userId));
    }

    public void getAllUsers(Model model) {
        model.addAttribute("users", discussionUserRepository.findAll());
    }
}
