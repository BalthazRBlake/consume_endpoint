package org.dev.fhhf.consume_endpoint.service;

import org.dev.fhhf.consume_endpoint.model.Bio;
import org.dev.fhhf.consume_endpoint.model.People;

public interface ConsumeApi {

    Bio getBioByUserName(String userName);
    People getUsersByPage(int offset, int size, String name);
}
