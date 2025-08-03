package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.Entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//Extending MongoRepository helps us to use all the built-in functions provided by this interface to implement CRUD operations.
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {
}
