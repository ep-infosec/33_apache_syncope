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
package org.apache.syncope.core.provisioning.api;

import org.apache.syncope.common.lib.oidc.OIDCLoginResponse;
import org.apache.syncope.common.lib.request.UserCR;
import org.apache.syncope.common.lib.request.UserUR;
import org.apache.syncope.common.lib.to.UserTO;

public interface OIDCC4UIProviderActions {

    default UserCR beforeCreate(UserCR input, OIDCLoginResponse loginResponse) {
        return input;
    }

    default UserTO afterCreate(UserTO input, OIDCLoginResponse loginResponse) {
        return input;
    }

    default UserUR beforeUpdate(UserUR input, OIDCLoginResponse loginResponse) {
        return input;
    }

    default UserTO afterUpdate(UserTO input, OIDCLoginResponse loginResponse) {
        return input;
    }
}
