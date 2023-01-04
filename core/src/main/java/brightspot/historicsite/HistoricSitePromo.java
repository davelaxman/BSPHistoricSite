package brightspot.historicsite;

import brightspot.image.WebImage;
import com.psddev.cms.db.Content;

public class HistoricSitePromo extends Content {

    protected String title;

    protected WebImage image;

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

}
