package brightspot.historicsite;

import com.psddev.cms.view.ViewInterface;
import com.psddev.cms.view.ViewModel;
import com.psddev.handlebars.HandlebarsTemplate;
import com.psddev.styleguide.historicsite.promo.HistoricSitePromoView;
import com.psddev.styleguide.historicsite.promo.HistoricSitePromoViewMediaField;
import com.psddev.styleguide.historicsite.promo.HistoricSitePromoViewSocialField;

@ViewInterface
@HandlebarsTemplate("HistoricSitePromo")
public class HistoricSitePromoViewModel extends ViewModel<HistoricSitePromo> implements
        HistoricSitePromoView {
    @Override
    public Iterable<? extends HistoricSitePromoViewMediaField> getMedia() {
        return (Iterable<? extends HistoricSitePromoViewMediaField>) model.getImage();
    }

    @Override
    public Iterable<? extends HistoricSitePromoViewSocialField> getSocial() {
        return null;
    }

    @Override
    public CharSequence getTitle() {
        return model.getTitle();
    }
}
