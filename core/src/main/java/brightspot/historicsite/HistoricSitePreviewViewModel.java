package brightspot.historicsite;

import brightspot.page.CurrentPageViewModel;
import brightspot.page.PageViewModel;
import com.psddev.cms.view.PreviewEntryView;
import com.psddev.cms.view.ViewModel;
import com.psddev.styleguide.PreviewPageView;
import com.psddev.styleguide.PreviewPageViewExtraBodyItemsField;
import com.psddev.styleguide.PreviewPageViewExtraScriptsField;
import com.psddev.styleguide.PreviewPageViewExtraStylesField;
import com.psddev.styleguide.PreviewPageViewFaviconsField;
import com.psddev.styleguide.PreviewPageViewMainField;
import com.psddev.styleguide.PreviewPageViewMetaField;
import com.psddev.styleguide.PreviewPageViewStylePackageField;

public class HistoricSitePreviewViewModel extends ViewModel<HistoricSitePage> implements
        PreviewEntryView,
        PreviewPageView {

    @CurrentPageViewModel(PageViewModel.class)
    private PageViewModel page;

    @Override
    public Iterable<? extends PreviewPageViewMainField> getMain() {
        return createViews(PreviewPageViewMainField.class, model);
    }

    // -- PreviewPageView support --

    @Override
    public CharSequence getCanonicalLink() {
        return page.getCanonicalLink();
    }

    @Override
    public CharSequence getDescription() {
        return page.getDescription();
    }

    @Override
    public Iterable<? extends PreviewPageViewExtraBodyItemsField> getExtraBodyItems() {
        return page.getExtraBodyItems(PreviewPageViewExtraBodyItemsField.class);
    }

    @Override
    public Iterable<? extends PreviewPageViewExtraScriptsField> getExtraScripts() {
        return page.getExtraScripts(PreviewPageViewExtraScriptsField.class);
    }

    @Override
    public Iterable<? extends PreviewPageViewExtraStylesField> getExtraStyles() {
        return page.getStyles(PreviewPageViewExtraStylesField.class);
    }

    @Override
    public Iterable<? extends PreviewPageViewFaviconsField> getFavicons() {
        return page.getFavicons();
    }

    @Override
    public CharSequence getKeywords() {
        return page.getKeywords();
    }

    @Override
    public CharSequence getLanguage() {
        return page.getLanguage();
    }

    @Override
    public CharSequence getManifestLink() {
        return page.getManifestLink();
    }

    @Override
    public Iterable<? extends PreviewPageViewMetaField> getMeta() {
        return page.getMeta(PreviewPageViewMetaField.class);
    }

    @Override
    public Iterable<? extends PreviewPageViewStylePackageField> getStylePackage() {
        return page.getStylePackage(PreviewPageViewStylePackageField.class);
    }

    @Override
    public CharSequence getTitle() {
        return page.getTitle();
    }
}
