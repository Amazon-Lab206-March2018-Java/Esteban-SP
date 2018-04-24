/**
 * StringManipulator
 */
public class StringManipulator {
    public String trimAndConcat(String aString, String bString) {
        return (aString.trim() + bString.trim());
    };

    public Integer getIndexOrNull(String aString, char bChar) {
        if (aString.indexOf(bChar) != -1) {
            return aString.indexOf(bChar);
        } else {
            return null;
        }
    };

    public Integer getIndexOrNull(String aString, String bString) {
        if (aString.indexOf(bString) != -1) {
            return aString.indexOf(bString);
        } else {
            return null;
        }
    };

    public String concatSubstring(String aString, int bInt, int cInt, String dString) {
        String newString = aString.substring(bInt, cInt);
        return (newString + dString);
    };
}