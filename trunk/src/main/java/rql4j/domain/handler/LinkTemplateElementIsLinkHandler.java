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

public class LinkTemplateElementIsLinkHandler implements FieldHandler {

    @Override
    public Object getValue(Object o) throws IllegalStateException {
        Link link = (Link) o;
        Link.LinkType linkType = link.getTemplateElementIsLink();
        if (linkType != null) {
            switch (linkType) {
                case NONE:
                    return "0";
                case SIMPLE_LINK:
                    return "1";
                case MULTI_LINK:
                    return "2";
                case REFERENCE:
                    return "10";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        Link link = (Link) o;
        Link.LinkType linkType;
        String linkTypeValue = (String) value;

        if (linkTypeValue.equals("0"))
            linkType = Link.LinkType.NONE;
        else if (linkTypeValue.equals("1"))
            linkType = Link.LinkType.SIMPLE_LINK;
        else if (linkTypeValue.equals("2"))
            linkType = Link.LinkType.MULTI_LINK;
        else if (linkTypeValue.equals("10"))
            linkType = Link.LinkType.REFERENCE;
        else linkType = null;

        link.setTemplateElementIsLink(linkType);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((Link) o).setTemplateElementIsLink(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}

