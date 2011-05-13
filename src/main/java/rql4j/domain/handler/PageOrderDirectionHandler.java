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

public class PageOrderDirectionHandler implements FieldHandler {
    @Override
    public Object getValue(Object o) throws IllegalStateException {
        Page page = (Page) o;
        Page.OrderDirection orderDirection = page.getOrderDirection();
        if (orderDirection != null) {
            switch (orderDirection) {
                case ASC:
                    return "ASC";
                case DESC:
                    return "DESC";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        Page page = (Page) o;
        Page.OrderDirection orderDirection;
        String orderDirectionValue = (String)value;

        if(orderDirectionValue.equals("ASC"))
            orderDirection = Page.OrderDirection.ASC;
        else if(orderDirectionValue.equals("DESC"))
            orderDirection = Page.OrderDirection.DESC;
        else orderDirection = null;

        page.setOrderDirection(orderDirection);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((Page) o).setOrderDirection(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}
