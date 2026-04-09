package main;

import aspects.LogginAspect;
import config.ProjectConfig;
import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Comment comment = new Comment("Text of prove: Hello World!!","Ed Piche");
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

    }
}
