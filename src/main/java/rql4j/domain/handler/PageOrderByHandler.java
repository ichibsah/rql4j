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

public class PageOrderByHandler implements FieldHandler {
    @Override
    public Object getValue(Object o) throws IllegalStateException {
        Page page = (Page) o;
        Page.OrderBy orderBy = page.getOrderBy();
        if (orderBy != null) {
            switch (orderBy) {
                case PAGEID:
                    return "pageid";
                case HEADLINE:
                    return "headline";
                case CREATEDATE:
                    return "createdate";
                case CHANGEDATE:
                    return "changedate";
                case CONTENTCLASS:
                    return "contentclass";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        Page page = (Page) o;
        Page.OrderBy orderBy;
        String orderByValue = (String)value;

        if(orderByValue.equals("pageid"))
            orderBy = Page.OrderBy.PAGEID;
        else if(orderByValue.equals("headline"))
            orderBy = Page.OrderBy.HEADLINE;
        else if(orderByValue.equals("createdate"))
            orderBy = Page.OrderBy.CREATEDATE;
        else if(orderByValue.equals("changedate"))
            orderBy = Page.OrderBy.CHANGEDATE;
        else if(orderByValue.equals("contentclass"))
            orderBy = Page.OrderBy.CONTENTCLASS;
        else orderBy = null;

        page.setOrderBy(orderBy);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((Page) o).setOrderBy(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}
