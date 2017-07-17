
package wepa.k2017.htyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import wepa.k2017.htyo.domain.DiscussionUser;

/**
 *
 * @author THyyppä
 */
@Service
public class UserService {
    
    @Autowired
    private DiscussionUserRepository discussionUserRepository;
    // käytetyt oliot
    private DiscussionUser discussionUser;
    
    //Users
    public void createUser(Model model, String userName, String password) {
       this.discussionUser = new DiscussionUser(userName, password); //CREATE
       discussionUserRepository.save(discussionUser);
       model.addAttribute("user", discussionUser);
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
