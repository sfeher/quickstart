package hu.bluesystem;

import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.markup.html.SecurePackageResourceGuard;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.settings.IResourceSettings;
import org.apache.wicket.util.time.Duration;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see hu.bluesystem.Start#main(String[])
 */
public class WicketApplication extends WebApplication {

    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class<HomePage> getHomePage() {
        return HomePage.class;
    }

    /**
     * @see org.apache.wicket.Application#init()
     */
    @Override
    public void init() {
        super.init();
        if (getConfigurationType().equals(RuntimeConfigurationType.DEPLOYMENT)) {
            getMarkupSettings().setStripWicketTags(true);
            getMarkupSettings().setStripComments(true);
            getMarkupSettings().setCompressWhitespace(true);
        }
            getApplicationSettings().setUploadProgressUpdatesEnabled(true);
            //getExceptionSettings().setUnexpectedExceptionDisplay(IExceptionSettings.SHOW_INTERNAL_ERROR_PAGE);
            IResourceSettings resourceSettings = getResourceSettings();
            resourceSettings.addResourceFolder("src/main/resources"); //this path should be changed             
            resourceSettings.setResourcePollFrequency(Duration.ONE_SECOND);
        SecurePackageResourceGuard guard = (SecurePackageResourceGuard) getResourceSettings().getPackageResourceGuard();
        guard.addPattern("+*.htm");
        // add your configuration here
    }
}
