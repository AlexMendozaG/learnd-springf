package services;

import custom_anotation.ToLog;
import models.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publicComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
        return "Success";
    }

    public void editComment(Comment comment) {
        logger.info("Editing comment: " + comment.getText());
    }
    @ToLog
    public String deleteComment(Comment comment) {
        logger.info("Deleting comment: " + comment.getText());
        return "Success";
    }
}
