package org.dev.fhhf.consume_endpoint.service;

import org.dev.fhhf.consume_endpoint.model.Bio;

public interface ConsumeApi {

    Bio getBioByUserName(String userName);
}
