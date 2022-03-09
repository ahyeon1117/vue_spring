package com.ahyeon.project.enums;

public enum AuthorityEnum {
  ADMIN("Admin"),
  USER("User");

  private final String text;

  AuthorityEnum(final String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }
}
