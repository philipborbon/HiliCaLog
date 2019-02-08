package com.hilicalog.dictionary.database;

import com.hilicalog.dictionary.dao.DictionaryEntry;
import com.hilicalog.dictionary.dao.QuestionEntry;
import com.hilicalog.dictionary.dao.QuestionSet;
import com.hilicalog.dictionary.dao.RecentSearchResult;
import com.j256.ormlite.android.apptools.OrmLiteConfigUtil;

/**
 * Created on 1/25/2018.
 */

public class DatabaseConfigUtil extends OrmLiteConfigUtil {
    private static final Class<?>[] classes = new Class[] {
            DictionaryEntry.class,
            QuestionEntry.class,
            QuestionSet.class,
            RecentSearchResult.class
    };

    public static void main(String[] args) throws Exception {
        writeConfigFile("ormlite_config.txt", classes);
    }
}
