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

import rql4j.domain.Page;
import org.exolab.castor.mapping.FieldHandler;
import org.exolab.castor.mapping.ValidityException;

public class PageActionFlagHandler implements FieldHandler {
    @Override
    public Object getValue(Object o) throws IllegalStateException {
        Page page = (Page) o;
        Page.ActionFlag pageActionFlag = page.getActionFlag();
        if (pageActionFlag != null) {
            switch (pageActionFlag) {
                case DRAFT:
                    return 65536;
                case COMPLETED:
                    return 32768;
                case RELEASED:
                    return 4096;
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        Page page = (Page) o;
        Page.ActionFlag pageActionFlag;
        Integer actionValue = Integer.valueOf((Integer) value);
        switch (actionValue) {
            case 65536:
                pageActionFlag = Page.ActionFlag.DRAFT;
                break;
            case 32768:
                pageActionFlag = Page.ActionFlag.COMPLETED;
                break;
            case 4096:
                pageActionFlag = Page.ActionFlag.RELEASED;
                break;
            case 36864:
                pageActionFlag = Page.ActionFlag.RELEASED;
                break;
            default:
                pageActionFlag = null;
                break;
        }
        page.setActionFlag(pageActionFlag);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((Page) o).setActionFlag(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}
