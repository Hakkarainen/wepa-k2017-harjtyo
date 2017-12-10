package wepa.k2017.htyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author THyyppä
 */
@Controller
public class DiscussionAdminController {
    
    @Autowired
    private DiscussionAdminService discussionAdminService;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String initDiscussionDB(Model model) {
        discussionAdminService = new DiscussionAdminService();
        discussionAdminService.initDiscussionDB(model);
        return "/home";
    }
//
//    @RequestMapping(value = "/{list}", method = RequestMethod.GET)
//    public String home(Model model) {
//        this.discussionService.getAllDiscussions(model);
//        return "adminIndex";
//    }
//
//    // Tämä POST luo ja tallettaa uuden keskustelun
//    @RequestMapping(value = "/{discussion}", method = RequestMethod.POST)
//    public String createDiscussion(@RequestParam String writer) {
//        this.discussionService.createDiscussion(writer);
//        return "redirect:/";
//    }
//
//    // Tämä POST poistaa keskustelun
//    @RequestMapping(value = "/{discussionId}", method = RequestMethod.POST)
//    public String deleteDiscussion(@RequestParam Long discussionId) {
//        this.discussionService.deleteDiscussion(discussionId);
//        return "redirect:/";
//    }
//
//    // Tämä GET näyttää tietyn keskustelun tiedot
//    @RequestMapping("/{discussionId}")
//    public String getOneDiscussion(Model model,
//            @PathVariable Long discussionId) {
//        this.discussionService.getOneDiscussion(model, discussionId);
//        return "redirect:/";
//    }
//
//    // Tämä GET näyttää kaikki keskustelut
//    @RequestMapping("/{discussions}")
//    public String getAllDiscussions(Model model) {
//        this.discussionService.getAllDiscussions(model);
//        return "redirect:/";
//    }
//
//////Admin: DiscussionTopic
////public class DiscussionTopicController {
////    @Autowired
////    private DiscussionService discussionService;
////
////    public DiscussionTopicController() {
////    }
//    // Tämä POST luo ja tallettaa uuden keskustelualueen
//    @RequestMapping(value = "/{discussionTopic}", method = RequestMethod.POST)
//    public String createDiscussionTopic(@RequestParam Integer topic,
//            @RequestParam String writer,
//            @RequestParam String header) {
//        this.discussionService.createDiscussionTopic(topic, writer, header);
//        return "redirect:/";
//    }
//
//    // Tämä POST poistaa keskustelualueen
//    @RequestMapping(value = "/{discussionTopicId}", method = RequestMethod.POST)
//    public String deleteDiscussionTopic(@PathVariable Long discussionTopicId) {
//        this.discussionService.deleteDiscussionTopic(discussionTopicId);
//        return "redirect:/";
//    }
//
//    // Tämä GET näyttää tietyn keskustelualueen tiedot
//    @RequestMapping("/{discussionTopicId}")
//    public String getOneDiscussionTopic(Model model,
//            @PathVariable Long discussionTopicId) {
//        this.discussionService.getOneDiscussionTopic(model, discussionTopicId);
//        return "redirect:/discussionTopic";
//    }
//
//    // Tämä GET näyttää kaikki keskustelualueet
//    @RequestMapping("/{discussions}")
//    public String getAllDiscussionTopics(Model model) {
//        this.discussionService.getAllDiscussionTopics(model);
//        return "redirect:/";
//    }
////}
//
////Admin: Message
////public class MessageController {
////
////    @Autowired
////    private DiscussionService discussionService;
////    private Message message;
////
////    public MessageController() {
////    }
//    // Tämä POST luo ja tallettaa uuden viestin
//    //ERROR
//    @RequestMapping(value = "/header}", method = RequestMethod.POST)
//    public String createMessage(Model model,
//            @RequestParam Integer writerID,
//            @RequestParam int discussion,
//            @RequestParam String writer,
//            @RequestParam String content) 
//    {
//        this.discussionService.createMessage(writerID, discussion, writer, content);
//        return "redirect:/";
//    }
//
//    // Tämä POST poistaa viestin
//    @RequestMapping(value = "/messageId}", method = RequestMethod.POST) 
//    public String deleteMessage(Model model, @PathVariable Long messageId){
//        this.discussionService.deleteMessage(messageId);
//        return "redirect:/";
//    }
//
//    // Tämä GET näyttää tietyn viestin tiedot
//    @RequestMapping("/{messageId}")
//    public String getOneMessage(Model model,
//            @PathVariable Long messageId) {
//        this.discussionService.getOneMessage(model, messageId);
//        return "message";
//    }
//
//    // Tämä GET näyttää kaikkien käyttäjien tiedot
//    @RequestMapping("/{messages}")
//    public String getAllMessages(Model model) {
//        this.discussionService.getAllMessages(model);
//        return "messages";
//    }
//
////Admin: User
////public class UserController {
////
////    @Autowired
////    private DiscussionService discussionService;
////    private User user;
////
////    public UserController() {
////    }
//    // Tämä POST luo ja tallettaa uuden käyttäjän
//    @RequestMapping(value = "/name}", method = RequestMethod.POST)
//    public String createUser(Model model,
//            @PathVariable String name) {
//        this.discussionService.createUser(name);
//        return "redirect:/";
//    }
//
//    // Tämä POST poistaa käyttäjän
//    @RequestMapping(value = "/userId}", method = RequestMethod.POST)
//    public String deleteUser(@PathVariable Long userId) {
//        this.discussionService.deleteUser(userId);
//        return "redirect:/";
//    }
//
//    // Tämä GET näyttää tietyn käyttäjän tiedot
//    @RequestMapping("/{userId}")
//    public String getOneUser(Model model,
//            @PathVariable Long userId) {
//        this.discussionService.getOneUser(model, userId);
//        return "user";
//    }
//
//    // Tämä GET näyttää kaikkien käyttäjien tiedot
//    @RequestMapping("/{users}")
//    public String getAllUsers(Model model) {
//        this.discussionService.getAllUsers(model);
//        return "users";
//    }
}
