package com.ahyeon.project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

  private String id;

  private String name;

  private String address;

  private String password;

  private String contents;

  private String tag;

  private String email;

  private String phoneNumber;

  private Integer age;
}
