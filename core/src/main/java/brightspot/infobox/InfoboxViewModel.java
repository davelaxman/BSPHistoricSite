package brightspot.infobox;

import brightspot.util.RichTextUtils;
import com.psddev.cms.view.ViewInterface;
import com.psddev.cms.view.ViewModel;
import com.psddev.handlebars.HandlebarsTemplate;
import com.psddev.styleguide.infobox.InfoboxView;
import com.psddev.styleguide.infobox.InfoboxViewContactField;
import com.psddev.styleguide.infobox.InfoboxViewFollowField;
import com.psddev.styleguide.infobox.InfoboxViewImageField;
import com.psddev.styleguide.infobox.InfoboxViewPhysicalAddressField;
import com.psddev.styleguide.infobox.InfoboxViewScheduleField;
import com.psddev.styleguide.infobox.InfoboxViewTitleField;

@ViewInterface
@HandlebarsTemplate("infobox/Infobox")
public class InfoboxViewModel extends ViewModel<Infobox> implements InfoboxView {
    @Override
    public Iterable<? extends InfoboxViewContactField> getContact() {
        return RichTextUtils.buildHtml(
                model,
                Infobox::getContact,
                e -> createView(InfoboxViewContactField.class, e));
    }

    @Override
    public Iterable<? extends InfoboxViewFollowField> getFollow() {
        return RichTextUtils.buildHtml(
                model,
                Infobox::getFollow,
                e -> createView(InfoboxViewFollowField.class, e));
    }

    @Override
    public Iterable<? extends InfoboxViewImageField> getImage() {
        return createViews(InfoboxViewImageField.class, model.getImage());
    }

    @Override
    public Iterable<? extends InfoboxViewPhysicalAddressField> getPhysicalAddress() {
        return RichTextUtils.buildHtml(
                model,
                Infobox::getPhysicalAddress,
                e -> createView(InfoboxViewPhysicalAddressField.class, e));
    }

    @Override
    public Iterable<? extends InfoboxViewScheduleField> getSchedule() {
        return RichTextUtils.buildHtml(
                model,
                Infobox::getSchedule,
                e -> createView(InfoboxViewScheduleField.class, e));
    }

    @Override
    public Iterable<? extends InfoboxViewTitleField> getTitle() {
        return createViews(InfoboxViewTitleField.class, model.getTitle());
    }
}
