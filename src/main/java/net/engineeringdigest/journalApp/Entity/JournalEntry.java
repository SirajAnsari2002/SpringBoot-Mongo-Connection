package net.engineeringdigest.journalApp.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//this annotation tells the mongoDB that this POJO class will be mapped to a Document in the MongoDB database. The instance of the JournalEntry will be equal to the Document
@Document(collection = "journal_entries")
@Data
public class JournalEntry {

//this annotation is used to denote the primary key in our collection.
    @Id
    private ObjectId id;
    @NonNull
    private String title;
    private String content;


}
