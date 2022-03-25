import jakarta.enterprise.inject.Alternative;

@Alternative
public class ReverseTestProcessor implements TextProcessor{
    @Override
    public String processTest(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
