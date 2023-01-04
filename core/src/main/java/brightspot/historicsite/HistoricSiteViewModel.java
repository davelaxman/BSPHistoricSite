package brightspot.historicsite;

import java.util.ArrayList;
import java.util.Locale;

import brightspot.l10n.CurrentLocale;
import brightspot.page.CurrentPageViewModel;
import brightspot.page.PageViewModel;
import brightspot.util.RichTextUtils;
import com.psddev.cms.view.PageEntryView;
import com.psddev.cms.view.ViewModel;
import com.psddev.styleguide.historicsite.HistoricSitePageView;
import com.psddev.styleguide.historicsite.HistoricSitePageViewAdditionalInformationField;
import com.psddev.styleguide.historicsite.HistoricSitePageViewBodyField;
import com.psddev.styleguide.historicsite.HistoricSitePageViewHistoricSitePromoField;
import com.psddev.styleguide.historicsite.HistoricSitePageViewImageGalleryField;
import com.psddev.styleguide.historicsite.HistoricSitePageViewInfoBoxField;
import com.psddev.styleguide.historicsite.HistoricSitePageViewIntroductionField;
import com.psddev.styleguide.page.ContentPageViewBreadcrumbsField;
import com.psddev.styleguide.page.ContentPageViewCommentsField;
import com.psddev.styleguide.page.ContentPageViewTagsField;
import com.psddev.styleguide.page.PageViewAboveField;
import com.psddev.styleguide.page.PageViewActionsField;
import com.psddev.styleguide.page.PageViewAmpAnalyticsField;
import com.psddev.styleguide.page.PageViewAmpIntegrationsField;
import com.psddev.styleguide.page.PageViewAsideField;
import com.psddev.styleguide.page.PageViewBannerField;
import com.psddev.styleguide.page.PageViewBelowField;
import com.psddev.styleguide.page.PageViewDisclaimerField;
import com.psddev.styleguide.page.PageViewExtraBodyItemsField;
import com.psddev.styleguide.page.PageViewExtraLinksField;
import com.psddev.styleguide.page.PageViewExtraScriptsField;
import com.psddev.styleguide.page.PageViewExtraStylesField;
import com.psddev.styleguide.page.PageViewFaviconsField;
import com.psddev.styleguide.page.PageViewFooterContentField;
import com.psddev.styleguide.page.PageViewFooterLogoField;
import com.psddev.styleguide.page.PageViewFooterNavigationField;
import com.psddev.styleguide.page.PageViewHatField;
import com.psddev.styleguide.page.PageViewLogoField;
import com.psddev.styleguide.page.PageViewMetaField;
import com.psddev.styleguide.page.PageViewNavigationField;
import com.psddev.styleguide.page.PageViewPageSubHeadingField;
import com.psddev.styleguide.page.PageViewSectionNavigationField;
import com.psddev.styleguide.page.PageViewSocialField;
import com.psddev.styleguide.page.PageViewStylePackageField;

public class HistoricSiteViewModel extends ViewModel<HistoricSitePage> implements
        HistoricSitePageView,
        PageEntryView {

    private static final String DATE_FORMAT_KEY = "dateFormat";

    @CurrentLocale
    private Locale locale;

    @CurrentPageViewModel(PageViewModel.class)
    private PageViewModel pageViewModel;
    private Iterable<? extends HistoricSitePageViewAdditionalInformationField> additionalResourcesItems = new ArrayList<>();

    @Override
    public Iterable<? extends HistoricSitePageViewAdditionalInformationField> getAdditionalInformation() {
        //        List<AbstractPageListModule> resources =  model.getAdditionalResources();
        //        for (AbstractPageListModule resource : resources) {
        //            additionalResourcesItems
        //        }
        return additionalResourcesItems;
    }

    @Override
    public Iterable<? extends HistoricSitePageViewBodyField> getBody() {
        return RichTextUtils.buildHtml(
                model,
                HistoricSitePage::getBody,
                e -> createView(HistoricSitePageViewBodyField.class, e));
    }

    @Override
    public Iterable<? extends HistoricSitePageViewHistoricSitePromoField> getHistoricSitePromo() {
        return (Iterable<? extends HistoricSitePageViewHistoricSitePromoField>) model.getHistoricSitePromo();
    }

    @Override
    public Iterable<? extends HistoricSitePageViewImageGalleryField> getImageGallery() {
        return (Iterable<? extends HistoricSitePageViewImageGalleryField>) model.getGallery();
    }

    @Override
    public Iterable<? extends HistoricSitePageViewInfoBoxField> getInfoBox() {
        return createViews(HistoricSitePageViewInfoBoxField.class, model.getInfobox());

    }

    @Override
    public Iterable<? extends HistoricSitePageViewIntroductionField> getIntroduction() {
        return RichTextUtils.buildHtml(
                model,
                HistoricSitePage::getIntroduction,
                e -> createView(HistoricSitePageViewIntroductionField.class, e));
    }

    @Override
    public CharSequence getName() {
        return model.getName();
    }

    @Override
    public Iterable<? extends ContentPageViewBreadcrumbsField> getBreadcrumbs() {
        return pageViewModel.getBreadcrumbs(ContentPageViewBreadcrumbsField.class);
    }

    @Override
    public Iterable<? extends ContentPageViewCommentsField> getComments() {
        return null;
    }

    @Override
    public Iterable<? extends ContentPageViewTagsField> getTags() {
        return pageViewModel.getTags(ContentPageViewTagsField.class);
    }

    @Override
    public Iterable<? extends PageViewAboveField> getAbove() {
        return pageViewModel.getAbove(PageViewAboveField.class);
    }

    @Override
    public Iterable<? extends PageViewActionsField> getActions() {
        return pageViewModel.getActions(PageViewActionsField.class);
    }

    @Override
    public Iterable<? extends PageViewAmpAnalyticsField> getAmpAnalytics() {
        return null;
    }

    @Override
    public Iterable<? extends PageViewAmpIntegrationsField> getAmpIntegrations() {
        return null;
    }

    @Override
    public Iterable<? extends PageViewAsideField> getAside() {
        return pageViewModel.getAside(PageViewAsideField.class);
    }

    @Override
    public Iterable<? extends PageViewBannerField> getBanner() {
        return pageViewModel.getBanners(PageViewBannerField.class);
    }

    @Override
    public Iterable<? extends PageViewBelowField> getBelow() {
        return pageViewModel.getBelow(PageViewBelowField.class);
    }

    @Override
    public CharSequence getCanonicalLink() {
        return pageViewModel.getCanonicalLink();
    }

    @Override
    public CharSequence getContentId() {
        return pageViewModel.getContentId();
    }

    @Override
    public CharSequence getDescription() {
        return pageViewModel.getDescription();
    }

    @Override
    public Iterable<? extends PageViewDisclaimerField> getDisclaimer() {
        return pageViewModel.getDisclaimer(PageViewDisclaimerField.class);
    }

    @Override
    public Iterable<? extends PageViewExtraBodyItemsField> getExtraBodyItems() {
        return pageViewModel.getExtraBodyItems(PageViewExtraBodyItemsField.class);
    }

    @Override
    public Iterable<? extends PageViewExtraLinksField> getExtraLinks() {
        return pageViewModel.getExtraLinks(PageViewExtraLinksField.class);
    }

    @Override
    public Iterable<? extends PageViewExtraScriptsField> getExtraScripts() {
        return pageViewModel.getExtraScripts(PageViewExtraScriptsField.class);
    }

    @Override
    public Iterable<? extends PageViewExtraStylesField> getExtraStyles() {
        return pageViewModel.getStyles(PageViewExtraStylesField.class);
    }

    @Override
    public Iterable<? extends PageViewFaviconsField> getFavicons() {
        return pageViewModel.getFavicons();
    }

    @Override
    public CharSequence getFeedLink() {
        return pageViewModel.getFeedLink();
    }

    @Override
    public Iterable<? extends PageViewFooterContentField> getFooterContent() {
        return pageViewModel.getFooterContent(PageViewFooterContentField.class);
    }

    @Override
    public Iterable<? extends PageViewFooterLogoField> getFooterLogo() {
        return pageViewModel.getFooterLogo(PageViewFooterLogoField.class);
    }

    @Override
    public Iterable<? extends PageViewFooterNavigationField> getFooterNavigation() {
        return pageViewModel.getFooterNavigation(PageViewFooterNavigationField.class);
    }

    @Override
    public Iterable<? extends PageViewHatField> getHat() {
        return pageViewModel.getHat(PageViewHatField.class);
    }

    @Override
    public CharSequence getJsonLinkedData() {
        return null;
    }

    @Override
    public CharSequence getKeywords() {
        return pageViewModel.getKeywords();
    }

    @Override
    public CharSequence getLanguage() {
        return pageViewModel.getLanguage();
    }

    @Override
    public Iterable<? extends PageViewLogoField> getLogo() {
        return pageViewModel.getLogo(PageViewLogoField.class);
    }

    @Override
    public CharSequence getManifestLink() {
        return pageViewModel.getManifestLink();
    }

    @Override
    public Iterable<? extends PageViewMetaField> getMeta() {
        return pageViewModel.getMeta(PageViewMetaField.class);
    }

    @Override
    public Iterable<? extends PageViewNavigationField> getNavigation() {
        return pageViewModel.getNavigation(PageViewNavigationField.class);
    }

    @Override
    public Iterable<? extends PageViewPageSubHeadingField> getPageSubHeading() {
        return null;
    }

    @Override
    public CharSequence getSearchAction() {
        return pageViewModel.getSearchAction();
    }

    @Override
    public Iterable<? extends PageViewSectionNavigationField> getSectionNavigation() {
        return pageViewModel.getSectionNavigation(PageViewSectionNavigationField.class);
    }

    @Override
    public Iterable<? extends PageViewSocialField> getSocial() {
        return pageViewModel.getSocial(PageViewSocialField.class);
    }

    @Override
    public Iterable<? extends PageViewStylePackageField> getStylePackage() {
        return pageViewModel.getStylePackage(PageViewStylePackageField.class);
    }

    @Override
    public CharSequence getTitle() {
        return pageViewModel.getTitle();
    }
}
