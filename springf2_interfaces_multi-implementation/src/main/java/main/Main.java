package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.BDCommentRepository;
import repositories.CommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        //CommentRepository commentRepository = new BDCommentRepository();
        //CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        //CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment("Edgar","Hello world");
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}
