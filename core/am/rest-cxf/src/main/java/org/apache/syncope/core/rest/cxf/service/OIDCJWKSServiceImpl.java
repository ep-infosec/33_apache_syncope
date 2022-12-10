/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.syncope.core.rest.cxf.service;

import java.net.URI;
import javax.ws.rs.core.Response;
import org.apache.syncope.common.lib.to.OIDCJWKSTO;
import org.apache.syncope.common.rest.api.service.OIDCJWKSService;
import org.apache.syncope.core.logic.OIDCJWKSLogic;
import org.springframework.stereotype.Service;

@Service
public class OIDCJWKSServiceImpl extends AbstractService implements OIDCJWKSService {

    protected final OIDCJWKSLogic logic;

    public OIDCJWKSServiceImpl(final OIDCJWKSLogic logic) {
        this.logic = logic;
    }

    @Override
    public OIDCJWKSTO get() {
        return logic.get();
    }

    @Override
    public void set(final OIDCJWKSTO entityTO) {
        logic.set(entityTO);
    }

    @Override
    public Response generate(final String jwksKeyId, final String jwksType, final int jwksKeySize) {
        OIDCJWKSTO jwks = logic.generate(jwksKeyId, jwksType, jwksKeySize);
        URI location = uriInfo.getAbsolutePathBuilder().build();
        return Response.created(location).entity(jwks).build();
    }

    @Override
    public void delete() {
        logic.delete();
    }
}