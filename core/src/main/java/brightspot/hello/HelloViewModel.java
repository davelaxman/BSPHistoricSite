package brightspot.hello;

import brightspot.util.RichTextUtils;
import com.psddev.cms.view.ViewModel;
import com.psddev.styleguide.hello.HelloModuleView;
import com.psddev.styleguide.hello.HelloModuleViewAboutField;
import com.psddev.styleguide.hello.HelloModuleViewProfilePictureField;
import com.psddev.styleguide.hello.HelloModuleViewTitleField;

public class HelloViewModel extends ViewModel<Hello> implements HelloModuleView {
    @Override
    public Iterable<? extends HelloModuleViewAboutField> getAbout() {

        return RichTextUtils.buildHtml(
                model,
                Hello::getAbout,
                e -> createView(HelloModuleViewAboutField.class, e));
    }

    @Override
    public CharSequence getFirstName() {
        return model.getFirstName();

    }

    @Override
    public CharSequence getLastName() {
        return model.getFirstName();
    }

    @Override
    public Iterable<? extends HelloModuleViewProfilePictureField> getProfilePicture() {
        return createViews(HelloModuleViewProfilePictureField.class, model.getProfilePicture());
    }

    @Override
    public Iterable<? extends HelloModuleViewTitleField> getTitle() {
        return RichTextUtils.buildInlineHtml(
                model,
                Hello::getTitle,
                e -> createView(HelloModuleViewTitleField.class, e));
    }
}
