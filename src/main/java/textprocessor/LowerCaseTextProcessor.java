package textprocessor;

import jakarta.enterprise.inject.Alternative;

@Alternative
public class LowerCaseTextProcessor implements TextProcessor {
    @Override
    public String processTest(String text) {
        return text.toLowerCase();
    }
}
