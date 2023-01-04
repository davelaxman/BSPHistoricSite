package brightspot.hello;

import brightspot.article.AbstractRichTextArticle;
import com.psddev.cms.db.ToolUi;

@ToolUi.FieldDisplayOrder({
        "headline",
        "hasUrlSlug.urlSlug",
        "hello",
        "hasAuthorsWithField.authors",
        "lead",
        "body",
        "hasSectionWithField.section",
        "hasTags.tags",
        "embargoable.embargo"
})

public class HelloArticle extends AbstractRichTextArticle {
    @Required
    private Hello hello;

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }

}
