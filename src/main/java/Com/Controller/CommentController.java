package Com.Controller;

import Com.Model.Comment;
import Com.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("comment",new Comment());
        model.addAttribute("comments",commentService.findAll());
        return "index";
    }
    @PostMapping("/postComment")
    public String comment(Comment comment){
        commentService.save(comment);
        return "redirect:/";
    }
}
