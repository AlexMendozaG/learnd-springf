package services;

import aspects.LogginAspect;
import org.springframework.stereotype.Service;
import models.Comment;

import java.util.logging.Logger;

@Service
public class CommentService {

    private Logger logger = Logger.getLogger(LogginAspect.class.getName());

    public void publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment);
    }
}
