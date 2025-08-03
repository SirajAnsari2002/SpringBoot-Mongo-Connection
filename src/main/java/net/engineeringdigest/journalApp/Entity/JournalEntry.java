package net.engineeringdigest.journalApp.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//this annotation tells the mongoDB that this POJO class will be mapped to a Document in the MongoDB database. The instance of the JournalEntry will be equal to the Document
@Document(collection = "journal_entries")
public class JournalEntry {

//this annotation is used to denote the primary key in our collection.
    @Id
    private ObjectId id;
    private String title;
    private String content;

    public ObjectId getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
