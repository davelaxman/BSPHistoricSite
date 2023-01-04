package brightspot.historicsite;

import java.util.List;

import brightspot.cascading.CascadingPageElements;
import brightspot.gallery.Gallery;
import brightspot.infobox.Infobox;
import brightspot.page.Page;
import brightspot.permalink.AbstractPermalinkRule;
import brightspot.permalink.DefaultPermalinkRule;
import brightspot.promo.page.AbstractPagePromo;
import brightspot.promo.page.PagePromotableWithOverrides;
import brightspot.rte.MediumRichTextToolbar;
import brightspot.rte.SmallRichTextToolbar;
import brightspot.search.modifier.exclusion.SearchExcludable;
import brightspot.seo.SeoWithFields;
import brightspot.share.Shareable;
import brightspot.site.DefaultSiteMapItem;
import brightspot.social.SocialEntity;
import brightspot.urlslug.HasUrlSlugWithField;
import brightspot.util.RichTextUtils;
import com.psddev.cms.db.Content;
import com.psddev.cms.db.Site;
import com.psddev.cms.db.ToolUi;
import com.psddev.dari.db.Recordable;
import com.psddev.dari.util.Utils;


//@ToolUi.FieldDisplayOrder({
//        "name",
//
//})
@ToolUi.IconName("bungalow")
@Recordable.DisplayName("Historic Site")
public class HistoricSitePage extends Content implements
        CascadingPageElements,
        DefaultSiteMapItem,
        HasUrlSlugWithField,
        PagePromotableWithOverrides,
        Page,
        SearchExcludable,
        SeoWithFields,
        Shareable,
        SocialEntity,
        HasInfobox {
    @Indexed
    @Required
    private String name;

    @Required
    private Infobox infobox;

    @ToolUi.RichText(toolbar = SmallRichTextToolbar.class)
    private String introduction;

    private Gallery gallery;

    @ToolUi.RichText(toolbar = MediumRichTextToolbar.class)
    private String body;

    private List<AbstractPagePromo> additionalResources;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLinkableText() {
        return null;
    }

    @Override
    public String getSeoTitleFallback() {
        return RichTextUtils.richTextToPlainText(getPagePromotableTitle());
    }

    @Override
    public String getSeoDescriptionFallback() {
        return RichTextUtils.richTextToPlainText(getPagePromotableDescription());
    }

    @Override
    public String getUrlSlugFallback() {
        return Utils.toNormalized(getName());
    }

    @Override
    public String createPermalink(Site site) {
        return AbstractPermalinkRule.create(site, this, DefaultPermalinkRule.class);
    }

    public Infobox getInfobox() {
        return infobox;
    }

    public void setInfobox(Infobox infobox) {
        this.infobox = infobox;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<AbstractPagePromo> getAdditionalResources() {
        return additionalResources;
    }

    public void setAdditionalResources(List<AbstractPagePromo> additionalResources) {
        this.additionalResources = additionalResources;
    }

}
