package hu.bluesystem;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.TextArea;
import wicket.contrib.tinymce.TinyMceBehavior;

public class HomePage extends WebPage {

    private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
        add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
        TextArea intro = (TextArea) new TextArea("intro");
        intro.setRequired(true);
        intro.setEscapeModelStrings(false);
        intro.add(new TinyMceBehavior(new TinyMCeAdvancedSettings()));
        add(intro);
    }
}
