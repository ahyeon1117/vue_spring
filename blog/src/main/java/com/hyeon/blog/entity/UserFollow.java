package com.hyeon.blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserFollow {

  @Id
  @Column(name = "user_id")
  private Long userId;

  private int followerId;
  private int followingId;
}
