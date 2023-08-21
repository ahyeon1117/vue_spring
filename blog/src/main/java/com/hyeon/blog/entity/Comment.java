package com.hyeon.blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Data
@Entity
public class Comment {

  @Id
  private int commentId;

  @Lob
  private String content;

  @Column(name = "user_id")
  private Long userId;

  private int postId;
}
