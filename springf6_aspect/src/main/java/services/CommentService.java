package services;

import models.Comment;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class CommentService {
    private Logger logger = Logger.getLogger(CommentService.class.getName());

    public void publicComment(Comment comment) {
        logger.info("Publishing comment: " + comment.getText());
    }
}
