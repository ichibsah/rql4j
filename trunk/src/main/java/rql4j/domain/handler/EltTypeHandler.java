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

import rql4j.domain.Element;
import org.exolab.castor.mapping.FieldHandler;
import org.exolab.castor.mapping.ValidityException;

public class EltTypeHandler implements FieldHandler {
    @Override
    public Object getValue(Object o) throws IllegalStateException {
        Element element = (Element) o;
        Element.EltType eltType = element.getEltType();
        if (eltType != null) {
            switch (eltType) {
                case STANDARD_FIELD_TEXT:
                    return "1";
                case STANDARD_FIELD_DATE:
                    return "5";
                case STANDARD_FIELD_TIME:
                    return "39";
                case STANDARD_FIELD_NUMERIC:
                    return "48";
                case STANDARD_FIELD_EMAIL:
                    return "50";
                case STANDARD_FIELD_URL:
                    return "51";
                case STANDARD_FIELD_CUSTOM:
                    return "999";
                case HEADLINE:
                    return "12";
                case TEXT:
                    return "32";
                case TEXT_ASCII:
                    return "31";
                case IMAGE:
                    return "2";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        Element element = (Element) o;
        Element.EltType eltType;
        String eltTypeValue = (String) value;

        if (eltTypeValue.equals("1"))
            eltType = Element.EltType.STANDARD_FIELD_TEXT;
        else if (eltTypeValue.equals("5"))
            eltType = Element.EltType.STANDARD_FIELD_DATE;
        else if (eltTypeValue.equals("39"))
            eltType = Element.EltType.STANDARD_FIELD_TIME;
        else if (eltTypeValue.equals("48"))
            eltType = Element.EltType.STANDARD_FIELD_NUMERIC;
        else if (eltTypeValue.equals("50"))
            eltType = Element.EltType.STANDARD_FIELD_EMAIL;
         else if (eltTypeValue.equals("51"))
            eltType = Element.EltType.STANDARD_FIELD_URL;
        else if (eltTypeValue.equals("999"))
            eltType = Element.EltType.STANDARD_FIELD_CUSTOM;
        else if (eltTypeValue.equals("12"))
            eltType = Element.EltType.HEADLINE;
        else if (eltTypeValue.equals("32"))
            eltType = Element.EltType.TEXT;
        else if (eltTypeValue.equals("31"))
            eltType = Element.EltType.TEXT;
        else if (eltTypeValue.equals("2"))
            eltType = Element.EltType.IMAGE;
        else eltType = null;

        element.setEltType(eltType);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((Element) o).setEltType(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}
