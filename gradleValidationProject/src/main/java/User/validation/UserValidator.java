package User.validation;
import java.util.regex.Pattern;

public class UserValidator {
    public boolean returnFirstNameStatus() {
        boolean mathcPattern = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,15}$", "Shailesh");
        return mathcPattern;
    }
}
