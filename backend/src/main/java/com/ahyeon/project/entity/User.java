package com.ahyeon.project.entity;

import com.ahyeon.project.enums.AuthorityEnum;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

  @Id
  private String id;

  private String name;

  private String address;

  private String password;

  @Column(columnDefinition = "TEXT")
  private String contents;

  private String[] tag;

  private String[] email;

  private String[] phoneNumber;

  private Integer age;

  @Enumerated(EnumType.STRING)
  private AuthorityEnum authority;
}
