package wepa.k2017.htyo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author THyyppä
 */
@Controller
public class DiscussionLiController {
    
    @Autowired
    private DiscussionLiService discussionLiService;

    public DiscussionLiController() {
    }

    // Tämä POST luo ja tallettaa uuden keskustelun
    @RequestMapping(value = "/crtDiscussion", method = RequestMethod.GET)
    public String createDiscussion(Model model, @RequestParam Integer initiatedBy, @RequestParam Integer topic, @RequestParam String header) {
        this.discussionLiService.createDiscussion(model, initiatedBy, topic, header);
        return "/discussion";
    }
    
    // Tämä POST poistaa keskustelun
    @RequestMapping(value = "/delDiscussion", method = RequestMethod.GET)
    public String deleteDiscussion(@RequestParam Long discussionId) {
        this.discussionLiService.deleteDiscussion(discussionId);
        return "/discussions";
    }

    // Tämä GET näyttää tietyn keskustelun tiedot
    @RequestMapping("/oneDiscussion")
    public String getOneDiscussion(Model model, @RequestParam Long discussionId) {
        this.discussionLiService.getOneDiscussion(model, discussionId);
        return "/discussion";
    }

    // Tämä GET näyttää kaikki keskustelut
    @RequestMapping("/allDiscussions")
    public String getAllDiscussions(Model model) {
        this.discussionLiService.getAllDiscussions(model);
        return "/discussions";   
    }
     // Tämä GET näyttää kaikki tietyn keskustelun viestit
    @RequestMapping("/msgPerDiscussion")
    public String getAllMessagesPerDiscussion(Model model) {
        this.discussionLiService.findMessagesPerDiscussion(model);
        return "/messages";
    }
}


