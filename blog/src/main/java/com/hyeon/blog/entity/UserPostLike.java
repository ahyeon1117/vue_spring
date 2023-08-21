package com.hyeon.blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserPostLike {

  @Id
  private int userPostLikeId;

  @Column(name = "user_id")
  private Long userId;

  private int postId;
}
