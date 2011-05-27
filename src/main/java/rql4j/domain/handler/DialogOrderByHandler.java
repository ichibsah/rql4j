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

import org.exolab.castor.mapping.FieldHandler;
import org.exolab.castor.mapping.ValidityException;
import rql4j.domain.Dialog;

public class DialogOrderByHandler implements FieldHandler {
    @Override
    public Object getValue(Object o) throws IllegalStateException {
        Dialog dialog = (Dialog) o;
        Dialog.OrderBy orderBy = dialog.getOrderBy();
        if (orderBy != null) {
            switch (orderBy) {
                case COUNTRY_CODE:
                    return "0";
                case COUNTRY_DESCRIPTION:
                    return "1";
                case COUNTRY_LANGUAGE:
                    return "2";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        Dialog dialog = (Dialog) o;
        Dialog.OrderBy orderBy;
        String orderByValue = (String)value;

        if(orderByValue.equals("0"))
            orderBy = Dialog.OrderBy.COUNTRY_CODE;
        else if(orderByValue.equals("1"))
            orderBy = Dialog.OrderBy.COUNTRY_DESCRIPTION;
        else if(orderByValue.equals("2"))
            orderBy = Dialog.OrderBy.COUNTRY_LANGUAGE;
        else orderBy = null;

        dialog.setOrderBy(orderBy);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((Dialog) o).setOrderBy(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}
