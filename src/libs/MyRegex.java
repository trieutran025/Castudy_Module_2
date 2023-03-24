package src.libs;

public class MyRegex {
    public static final String REGEX_SERVICE_VILLA = "^SVVL-[0-9]{4}$";
    public static final String REGEX_SERVICE_HOUSE = "^SVHO-[0-9]{4}$";
    public static final String REGEX_SERVICE_ROOM = "^SVRO-[0-9]{4}$";
    public static final String REGEX_NAME = "^[A-Z][a-z]+(\\s[A-Z][a-z]+)*$";
    public static final String REGEX_DATE = "dd/MM/yyyy";
    public static final String REGEX_EMAIL = "^[\\w.]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+){1,2}$";
    public static final String REGEX_ID_NUMBER = "^([0-9]{9}|[0-9]{12})$";
    public static final String REGEX_NUMBER_PHONE = "^(090|091|\\\\(84\\\\)\\\\+90|\\\\(84\\\\)\\\\+91)[\\d]{7}$";
}
