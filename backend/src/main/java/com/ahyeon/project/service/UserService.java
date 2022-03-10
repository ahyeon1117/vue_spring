package com.ahyeon.project.service;

import com.ahyeon.project.dto.UserDto;
import com.ahyeon.project.entity.User;
import com.ahyeon.project.enums.AuthorityEnum;
import com.ahyeon.project.enums.ProcessResult;
import com.ahyeon.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public ProcessResult register(UserDto userDto) {
    try {
      User user = User
        .builder()
        .id(userDto.getId())
        .name(userDto.getName())
        .password(userDto.getPassword())
        .age(userDto.getAge())
        .email(userDto.getEmail())
        .address(userDto.getAddress())
        .contents(userDto.getContents())
        .phoneNumber(userDto.getPhoneNumber())
        .authority(AuthorityEnum.USER)
        .build();

      userRepository.save(user);
      return ProcessResult.SUCCESS;
    } catch (Exception e) {
      e.printStackTrace();
      return ProcessResult.FAIL;
    }
  }
}
