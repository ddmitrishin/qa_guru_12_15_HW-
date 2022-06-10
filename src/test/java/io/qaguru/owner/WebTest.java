package io.qaguru.owner;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.title;
import static org.assertj.core.api.Assertions.assertThat;

public class WebTest extends TestBase {
    @Test
    public void testGitHubTitle() {
        assertThat(title()).contains("GitHub: Where the world builds");
    }
}
