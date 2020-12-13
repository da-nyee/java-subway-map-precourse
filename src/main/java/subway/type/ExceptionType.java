package subway.type;

public enum  ExceptionType {
    ERROR("[ERROR] "),
    INVALID_FEATURE_CHOICE(ERROR.getException() + "선택할 수 없는 기능입니다.\n"),
    INVALID_STATION_NAME(ERROR.getException() + "이미 등록된 역 이름입니다.\n"),
    INVALID_STATION_NAME_LENGTH(ERROR.getException() + "2글자 이상의 역 이름을 입력해주세요.\n"),
    INVALID_STATION_NAME_LAST_CHARACTER(ERROR.getException() + "'역'으로 끝나는 역 이름을 입력해주세요.\n"),
    INVALID_STATION_NAME_IN_TRANSIT_MAP(ERROR.getException() + "해당 역은 지하철 노선에 등록되어 있어 삭제할 수 없습니다.\n"),
    INVALID_STATION_NAME_EXISTENCE(ERROR.getException() + "해당 역이 존재하지 않습니다.\n"),
    INVALID_LINE_NAME(ERROR.getException() + "이미 등록된 노선 이름입니다.\n"),
    INVALID_LINE_NAME_LENGTH(ERROR.getException() + "2글자 이상의 노선 이름을 입력해주세요.\n"),
    INVALID_LINE_NAME_LAST_CHARACTER(ERROR.getException() + "'선'으로 끝나는 노선 이름을 입력해주세요.\n");

    private final String exception;

    ExceptionType(String exception) {
        this.exception = exception;
    }

    public String getException() {
        return exception;
    }
}
