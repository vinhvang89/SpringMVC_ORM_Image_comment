package Com.Service;

import Com.Model.Comment;

import java.util.List;

public interface iService {
    Comment save(Comment comment);
    List<Comment> findAll();
    void delete(Comment comment);
    Comment findOne(Long id);
}
