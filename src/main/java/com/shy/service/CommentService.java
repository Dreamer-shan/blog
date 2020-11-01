package com.shy.service;

import com.shy.entity.Comment;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: shy
 * @Date: 2020/11/01/20:33
 * @Description:
 */
public interface CommentService {
    //根据博客id查询评论信息
    List<Comment> listCommentByBlogId(Long blogId);

    //添加保存评论
    int saveComment(Comment comment);

    //删除评论
    void deleteComment(Comment comment,Long id);
}
