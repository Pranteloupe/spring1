package services;

import main.ToLog;
import models.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

import java.util.logging.Logger;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;
    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    //if these weren't in the constructor, they would need the @Autowired annotation when declaring them
    //Qualifier needed because more than one CommentNotificationProxy exists
    public CommentService(CommentRepository commentRepository, @Qualifier("push") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public String publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
        logger.info("Comment published: " + comment.getText());
        return "SUCCESS";
    }

    @ToLog
    public void deleteComment(Comment comment) {
        logger.info("Comment deleted: " + comment.getText());
    }

    public void editComment(Comment comment) {
        logger.info("Comment edited: " + comment.getText());
    }
}
