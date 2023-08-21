package com.hyeon.blog.entity;

import com.hyeon.blog.enums.GenderEnums;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;
import lombok.Data;

@Data
@Entity
public class BlogUser {

  @Id
  private int id;

  private String email;
  private String password;
  private String phone;

  @Enumerated(value = EnumType.STRING)
  private GenderEnums gender;

  private LocalDate birth;
  private String name;
  private String nickname;

  @Lob
  private String introduce;

  @Lob
  private String profile_image;

  @OneToMany
  @JoinColumn(name = "user_id")
  private List<UserFollow> userfollow;

  @OneToMany
  @JoinColumn(name = "user_id")
  private List<UserPostLike> userPostLike;

  @OneToMany
  @JoinColumn(name = "user_id")
  private List<UserPostTag> userPostTag;

  @OneToMany
  @JoinColumn(name = "user_id")
  private List<Post> post;

  @OneToMany
  @JoinColumn(name = "user_id")
  private List<Comment> comment;
}
