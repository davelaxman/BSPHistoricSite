package brightspot.hello;

import brightspot.image.WebImage;
import brightspot.rte.LargeRichTextToolbar;
import brightspot.rte.TinyRichTextToolbar;
import com.psddev.cms.db.Content;
import com.psddev.cms.db.ToolUi;

public class Hello extends Content {

    @Indexed
    @Required
    @ToolUi.RichText(toolbar = TinyRichTextToolbar.class)
    private String title;

    @Required
    private String firstName;

    @Required
    @Indexed
    private String lastName;

    private WebImage profilePicture;

    @ToolUi.RichText(inline = false, toolbar = LargeRichTextToolbar.class)
    private String about;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public WebImage getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(WebImage profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getAbout() {
        return title;
    }

    public void setAbout(String about) {
        this.about = about;
    }

}

