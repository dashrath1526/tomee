/**
 *
 * Copyright 2006 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.openejb.jee.common;

import org.openejb.jee.common.JndiEnvironmentRef;

/**
 * @version $Revision$ $Date$
 */
public class ResourceEnvRef extends JndiEnvironmentRef {
    private String resourceEnvRefName;
    private String resourceEnvRefType;

    public ResourceEnvRef() {
    }

    public ResourceEnvRef(String resourceEnvRefName, String resourceEnvRefType) {
        this.resourceEnvRefName = resourceEnvRefName;
        this.resourceEnvRefType = resourceEnvRefType;
    }

    public String getResourceEnvRefName() {
        return resourceEnvRefName;
    }

    public void setResourceEnvRefName(String resourceEnvRefName) {
        this.resourceEnvRefName = resourceEnvRefName;
    }

    public String getResourceEnvRefType() {
        return resourceEnvRefType;
    }

    public void setResourceEnvRefType(String resourceEnvRefType) {
        this.resourceEnvRefType = resourceEnvRefType;
    }
}
