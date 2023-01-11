package com.technews.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "comment")
public class Comment implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String commentBody;
    private Integer userId;
    private Integer postId;

    public Comment () {
    }

    public Comment(Integer id, String commentBody, Integer userId, Integer postId) {
        this.id = id;
        this.commentBody = commentBody;
        this.userId = userId;
        this.postId = postId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommentBody() {
        return commentBody;
    }

    public void setCommentBody(String commentBody) {
        this.commentBody = commentBody;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;
        Comment comment = (Comment) o;
        return Objects.equals(getId(), comment.getId()) &&
                Objects.equals(getCommentBody(), comment.getCommentBody()) &&
                Objects.equals(getUserId(), comment.getUserId()) &&
                Objects.equals(getPostId(), comment.getPostId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCommentBody(), getUserId(), getPostId());
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", commentBody='" + commentBody + '\'' +
                ", userId=" + userId +
                ", postId=" + postId +
                '}';
    }
}
