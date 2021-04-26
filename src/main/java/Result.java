public enum Result {

  STRIKE("스트라이크"),
  BALL("볼");

  Result(String message) {
    this.message = message;
  }

  private final String message;

  public String getMessage() {
    return message;
  }

}
