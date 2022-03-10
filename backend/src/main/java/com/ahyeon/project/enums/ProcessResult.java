package com.ahyeon.project.enums;

public enum ProcessResult {
  SUCCESS("Success"),
  FAIL("Fail");

  private final String text;

  ProcessResult(final String text) {
    this.text = text;
  }

  @Override
  public String toString() {
    return text;
  }
}
