package main;

import model.Comment;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.BDCommentRepository;
import repositories.CommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        CommentRepository commentRepository = new BDCommentRepository();
        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);

        Comment comment = new Comment("Edgar","Hello world");

        commentService.publishComment(comment);

    }
}
