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
public class DiscussionMessageController {

    @Autowired
    private MessageService messageService;

    public DiscussionMessageController() {
    }

    // Tämä POST luo ja tallettaa uuden viestin
    @RequestMapping(value = "/crtMessage", method = RequestMethod.POST)
    public String createMessage(Model model, @RequestParam String writer, @RequestParam String content) {
        messageService.createMessage(model, writer, content);
        return "redirect:/message";
    }

    // Tämä POST poistaa viestin, "${'/viestit/' + viesti.id}"
    @RequestMapping(value = "/delMessage", method = RequestMethod.GET)
    public String deleteMessage(@RequestParam Long messageId) {
        messageService.deleteMessage(messageId);
        return "redirect:/messages";
    }

    // Tämä GET näyttää tietyn viestin tiedot
    @RequestMapping("/oneMessage")
    public String getOneMessage(Model model, @RequestParam Long messageId) {
        messageService.getOneMessage(model, messageId);
        return "/message";
    }

    // Tämä GET näyttää kaikkien käyttäjien tiedot
    @RequestMapping("/allMessages")
    public String getAllMessages(Model model) {
        messageService.getAllMessages(model);
        return "/messages";
    }
}
