package tw.edu.ncu.cc.location.server.db.model.abstracts;

import tw.edu.ncu.cc.location.server.lucene.LuceneWord;

public interface WordPersistModel {
    public void persistWords( LuceneWord... words );
    public void clearAllWords();
}