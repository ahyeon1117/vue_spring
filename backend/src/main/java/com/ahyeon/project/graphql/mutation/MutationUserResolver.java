package com.ahyeon.project.graphql.mutation;

import com.ahyeon.project.dto.UserDto;
import com.ahyeon.project.enums.ProcessResult;
import com.ahyeon.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MutationUserResolver {

  @Autowired
  private UserService userService;

  @MutationMapping
  public String registerUser(UserDto userDto) {
    ProcessResult result = ProcessResult.FAIL;
    result = userService.register(userDto);
    return result.toString();
  }
}
