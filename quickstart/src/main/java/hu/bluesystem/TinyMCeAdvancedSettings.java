/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.bluesystem.hrportal.components;


import wicket.contrib.tinymce.settings.*;
import wicket.contrib.tinymce.settings.TinyMCESettings.Language;
import wicket.contrib.tinymce.settings.TinyMCESettings.Theme;


/**
 *
 * @author sfeher
 */


public class TinyMCeAdvancedSettings extends TinyMCESettings {

    public TinyMCeAdvancedSettings(Theme theme, Language lang) {
        super(theme, lang);
    }

    public TinyMCeAdvancedSettings(Theme theme) {
        super(theme);
    }

    public TinyMCeAdvancedSettings() {
        super(TinyMCESettings.Theme.advanced);
        init();
    }
            
    
    private void init() {
        
        ContextMenuPlugin contextMenuPlugin = new ContextMenuPlugin();
        this.register(contextMenuPlugin);

        // first toolbar
        SavePlugin savePlugin = new SavePlugin();
        //this.add(savePlugin.getSaveButton(), TinyMCESettings.Toolbar.first, TinyMCESettings.Position.before);
        //this.add(Button.newdocument, TinyMCESettings.Toolbar.first, TinyMCESettings.Position.before);
        //this.add(Button.separator, TinyMCESettings.Toolbar.first, TinyMCESettings.Position.before);
        this.add(Button.fontselect, TinyMCESettings.Toolbar.first, TinyMCESettings.Position.after);
        this.add(Button.fontsizeselect, TinyMCESettings.Toolbar.first, TinyMCESettings.Position.after);

        // second toolbar
        PastePlugin pastePlugin = new PastePlugin();
        SearchReplacePlugin searchReplacePlugin = new SearchReplacePlugin();
        DateTimePlugin dateTimePlugin = new DateTimePlugin();
        dateTimePlugin.setDateFormat("Date: %m-%d-%Y");
        dateTimePlugin.setTimeFormat("Time: %H:%M");
        PreviewPlugin previewPlugin = new PreviewPlugin();
        this.add(Button.cut, TinyMCESettings.Toolbar.second, TinyMCESettings.Position.before);
        this.add(Button.copy, TinyMCESettings.Toolbar.second, TinyMCESettings.Position.before);
        this.add(pastePlugin.getPasteButton(), TinyMCESettings.Toolbar.second, TinyMCESettings.Position.before);
        this.add(pastePlugin.getPasteTextButton(), TinyMCESettings.Toolbar.second, TinyMCESettings.Position.before);
        this.add(pastePlugin.getPasteWordButton(), TinyMCESettings.Toolbar.second, TinyMCESettings.Position.before);
        this.add(Button.separator, TinyMCESettings.Toolbar.second, TinyMCESettings.Position.before);
        this.add(searchReplacePlugin.getSearchButton(), TinyMCESettings.Toolbar.second,TinyMCESettings.Position.before);
        this.add(searchReplacePlugin.getReplaceButton(), TinyMCESettings.Toolbar.second,TinyMCESettings.Position.before);
        this.add(Button.separator, TinyMCESettings.Toolbar.second, TinyMCESettings.Position.before);
        this.add(Button.separator, TinyMCESettings.Toolbar.second, TinyMCESettings.Position.after);
        this.add(dateTimePlugin.getDateButton(), TinyMCESettings.Toolbar.second, TinyMCESettings.Position.after);
        this.add(dateTimePlugin.getTimeButton(), TinyMCESettings.Toolbar.second, TinyMCESettings.Position.after);
        this.add(Button.separator, TinyMCESettings.Toolbar.second, TinyMCESettings.Position.after);
        this.add(previewPlugin.getPreviewButton(), TinyMCESettings.Toolbar.second, TinyMCESettings.Position.after);
        this.add(Button.separator, TinyMCESettings.Toolbar.second, TinyMCESettings.Position.after);
        this.add(Button.forecolor, TinyMCESettings.Toolbar.second, TinyMCESettings.Position.after);
        this.add(Button.backcolor, TinyMCESettings.Toolbar.second, TinyMCESettings.Position.after);

        // third toolbar
        TablePlugin tablePlugin = new TablePlugin();
        EmotionsPlugin emotionsPlugin = new EmotionsPlugin();
        IESpellPlugin iespellPlugin = new IESpellPlugin();
        MediaPlugin mediaPlugin = new MediaPlugin();
        PrintPlugin printPlugin = new PrintPlugin();
        FullScreenPlugin fullScreenPlugin = new FullScreenPlugin();
        DirectionalityPlugin directionalityPlugin = new DirectionalityPlugin();
        this.add(tablePlugin.getTableControls(), TinyMCESettings.Toolbar.third, TinyMCESettings.Position.before);
        this.add(emotionsPlugin.getEmotionsButton(), TinyMCESettings.Toolbar.third, TinyMCESettings.Position.after);
        this.add(iespellPlugin.getIespellButton(), TinyMCESettings.Toolbar.third, TinyMCESettings.Position.after);
        this.add(mediaPlugin.getMediaButton(), TinyMCESettings.Toolbar.third, TinyMCESettings.Position.after);
        this.add(Button.separator, TinyMCESettings.Toolbar.third, TinyMCESettings.Position.after);
        this.add(printPlugin.getPrintButton(), TinyMCESettings.Toolbar.third, TinyMCESettings.Position.after);
        this.add(Button.separator, TinyMCESettings.Toolbar.third, TinyMCESettings.Position.after);
        this.add(directionalityPlugin.getLtrButton(), TinyMCESettings.Toolbar.third, TinyMCESettings.Position.after);
        this.add(directionalityPlugin.getRtlButton(), TinyMCESettings.Toolbar.third, TinyMCESettings.Position.after);
        this.add(Button.separator, TinyMCESettings.Toolbar.third, TinyMCESettings.Position.after);
        this.add(fullScreenPlugin.getFullscreenButton(), TinyMCESettings.Toolbar.third,TinyMCESettings.Position.after);

//        // fourth toolbar
//        SpellCheckPlugin spellCheckPlugin = new SpellCheckPlugin();
//        this.add(spellCheckPlugin.getSpellCheckButton(), TinyMCESettings.Toolbar.fourth,
//                TinyMCESettings.Position.after);

        // other settings
        this.setToolbarAlign(TinyMCESettings.Align.left);
        this.setToolbarLocation(TinyMCESettings.Location.top);
        this.setStatusbarLocation(TinyMCESettings.Location.bottom);
        this.setResizing(false);
        this.setReadOnly(false);

    }

    
}
