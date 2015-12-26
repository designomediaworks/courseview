package in.nowke.courseview.classes;

/**
 * Created by nav on 23/12/15.
 */
public class Constants {
    public static final String BASE_URL = "http://192.168.1.104:5200";
    public static final String DOCUMENTS_URL = BASE_URL + "/api/v1/documents/";

    public static String getSubjectsForDocument(Integer documentId) {
        return DOCUMENTS_URL + documentId + "/";
    }

    public static final String PREFERENCES = "pref";
    public static final String PREVIOUS_DOC_PREF = "previousDocPref";
    public static final String SCROLL_X = "scrollX";
    public static final String SCROLL_Y = "scrollY";
}
