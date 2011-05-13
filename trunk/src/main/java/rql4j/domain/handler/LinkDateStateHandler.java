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

import rql4j.domain.Link;
import org.exolab.castor.mapping.FieldHandler;
import org.exolab.castor.mapping.ValidityException;

public class LinkDateStateHandler implements FieldHandler {
    @Override
    public Object getValue(Object o) throws IllegalStateException {
        Link link = (Link) o;
        Link.DateState dateState = link.getDateState();
        if (dateState != null) {
            switch (dateState) {
                case PAGE_HAS_EXPIRED:
                    return "0";
                case PAGE_NEVER_EXPIRES:
                    return "1";
                case PAGE_WILL_APPEAR_IN_THE_FUTURE:
                    return "2";
                case PAGE_IS_CURRENT:
                    return "3";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        Link link = (Link) o;
        Link.DateState dateState;
        String dateStateValue = (String) value;

        if (dateStateValue.equals("0"))
            dateState = Link.DateState.PAGE_HAS_EXPIRED;
        else if (dateStateValue.equals("1"))
            dateState = Link.DateState.PAGE_NEVER_EXPIRES;
        else if (dateStateValue.equals("2"))
            dateState = Link.DateState.PAGE_WILL_APPEAR_IN_THE_FUTURE;
        else if (dateStateValue.equals("3"))
            dateState = Link.DateState.PAGE_IS_CURRENT;
        else dateState = null;

        link.setDateState(dateState);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((Link) o).setDateState(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}
