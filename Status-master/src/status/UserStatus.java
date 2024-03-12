package status;
/*
@author Arin Sharma 991667506
*/
public enum UserStatus {
    REJECTED(0, "REJECTED"),
    PENDING(1, "PENDING"),
    PROCESSING(2, "PROCESSING"),
    APPROVED(3, "APPROVED");

    private final int code;
    private final String description;

    UserStatus(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static UserStatus fromCode(int code) {
        for (UserStatus status : UserStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid status code");
    }
}