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

import rql4j.domain.SearchItem;
import org.exolab.castor.mapping.FieldHandler;
import org.exolab.castor.mapping.ValidityException;

public class SearchItemOperatorHandler implements FieldHandler {
    @Override
    public Object getValue(Object o) throws IllegalStateException {
        SearchItem item = (SearchItem) o;
        SearchItem.Operator operator = item.getOperator();
        if (operator != null) {
            switch (operator) {
                case LIKE:
                    return "like";
                case CONTAINS:
                    return "contains";
                case EQ:
                    return "eq";
                case NE:
                    return "ne";
                case GT:
                    return "gt";
                case LT:
                    return "lt";
                case GE:
                    return "ge";
                case LE:
                    return "le";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        SearchItem item = (SearchItem) o;
        SearchItem.Operator operator;
        String operatorValue = (String) value;
        if (operatorValue.equals("like"))
            operator = SearchItem.Operator.LIKE;
        else if (operatorValue.equals("contains"))
            operator = SearchItem.Operator.CONTAINS;
        else if (operatorValue.equals("eq"))
            operator = SearchItem.Operator.EQ;
        else if (operatorValue.equals("ne"))
            operator = SearchItem.Operator.NE;
        else if (operatorValue.equals("gt"))
            operator = SearchItem.Operator.GT;
        else if (operatorValue.equals("lt"))
            operator = SearchItem.Operator.LT;
        else if (operatorValue.equals("ge"))
            operator = SearchItem.Operator.LE;
        else if (operatorValue.equals("le"))
            operator = SearchItem.Operator.LE;
        else
            operator = null;
        item.setOperator(operator);
    }


    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((SearchItem) o).setOperator(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}
