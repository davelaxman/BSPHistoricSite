package brightspot.historicsite;

import brightspot.infobox.Infobox;
import com.psddev.dari.db.Recordable;

public interface HasInfobox extends Recordable {
    public Infobox getInfobox();
}
