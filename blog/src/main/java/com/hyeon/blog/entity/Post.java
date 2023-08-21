package com.hyeon.blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class Post {

  @Id
  private Long id;

  @Lob
  private String content;

  private String location;

  @Column(name = "user_id")
  private Long userId;

  @OneToMany
  @JoinColumn(name = "post_id")
  private List<PostImage> postImg;

  @OneToOne
  @JoinColumn(name = "post_id")
  private PostHashtag postHashtag;
}
