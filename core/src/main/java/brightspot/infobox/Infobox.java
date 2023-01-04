package brightspot.infobox;

import brightspot.image.WebImage;
import brightspot.rte.SmallRichTextToolbar;
import brightspot.rte.TinyRichTextToolbar;
import brightspot.util.NoUrlsWidget;
import com.psddev.cms.db.Content;
import com.psddev.cms.db.ToolUi;

public class Infobox extends Content implements
        NoUrlsWidget {

    @Indexed
    @Required
    protected String title;

    protected WebImage image;

    @ToolUi.RichText(toolbar = TinyRichTextToolbar.class)
    protected String schedule;

    @ToolUi.RichText(toolbar = SmallRichTextToolbar.class)
    protected String physicalAddress;

    @ToolUi.RichText(toolbar = TinyRichTextToolbar.class)
    protected String contact;

    @ToolUi.RichText(toolbar = SmallRichTextToolbar.class)
    protected String follow;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WebImage getImage() {
        return image;
    }

    public void setImage(WebImage image) {
        this.image = image;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getFollow() {
        return follow;
    }

    public void setFollow(String follow) {
        this.follow = follow;
    }

}
