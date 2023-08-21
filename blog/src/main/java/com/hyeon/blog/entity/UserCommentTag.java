package com.hyeon.blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserCommentTag {

  @Id
  private String userCommentTagId;

  @Column(name = "user_id")
  private int userId;

  @Column(name = "comment_id")
  private int commentId;
}
