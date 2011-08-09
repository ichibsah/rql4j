/*
 * Copyright 2011 Burkhard Pauli (http://www.bpauli.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under the License.
 */

package rql4j.domain.handler;

import org.exolab.castor.mapping.GeneralizedFieldHandler;

public class BooleanHandler extends GeneralizedFieldHandler {

    @Override
    public Object convertUponGet(Object o) {
        String value = null;
        if (o == null)
            return value;
        if ((Boolean) o)
            value = "1";
        else
            value = "0";
        return value;
    }

    @Override
    public Object convertUponSet(Object o) {
        Boolean value = null;
        try {
            Integer integer = Integer.parseInt((String) o);
            if (integer != null && integer == 1)
                value = true;
            else if (integer != null && integer == 0)
                value = false;
        } catch (NumberFormatException e) {
            return null;
        }
        return value;
    }

    @Override
    public Class getFieldType() {
        return Boolean.class;
    }
}
