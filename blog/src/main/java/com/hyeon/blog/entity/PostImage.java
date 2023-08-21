package com.hyeon.blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class PostImage {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int imageId;

  private Long fileName;

  @Column(name = "post_id")
  private Long postId;
}
