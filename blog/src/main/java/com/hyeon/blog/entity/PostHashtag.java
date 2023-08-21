package com.hyeon.blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class PostHashtag {

  @Id
  @Column(name = "post_id")
  private Long postId;

  @OneToMany
  @JoinColumn(name = "hashtag_id")
  private List<Hashtag> hashtag;
}
