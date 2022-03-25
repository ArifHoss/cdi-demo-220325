import jakarta.enterprise.inject.Alternative;

@Alternative
public class UpperCaseTextProcessor implements TextProcessor{
    @Override
    public String processTest(String text) {
        return text.toUpperCase();
    }
}
