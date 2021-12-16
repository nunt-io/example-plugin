package io.nunt.plugin.example;

import com.mongodb.client.result.DeleteResult;
import io.nunt.core.db.bridge.*;
import io.nunt.core.user.User;

@DocumentCollection("user")
public interface ExampleBridge extends DocumentBridge {

    @DocumentInsertQuery()
    void addUser(User... users);

    @DocumentFindQuery(value = "{id: {{id}}}")
    User getByUser(@FieldName("id") String id);

    @DocumentDeleteQuery(value = "{id: {{raw}}}")
    DeleteResult deleteByUser(String id);
}

