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

public class SearchItemKeyHandler implements FieldHandler {
    @Override
    public Object getValue(Object o) throws IllegalStateException {
        SearchItem item = (SearchItem) o;
        SearchItem.Key key = item.getKey();
        if (key != null) {
            switch (key) {
                case HEADLINE:
                    return "headline";
                case SEARCHTEXT:
                    return "searchtext";
                case CONTENTCLASSGUID:
                    return "contentclassguid";
                case PAGEID:
                    return "pageid";
                case CREATEDBY:
                    return "createdby";
                case CHANGEDBY:
                    return "changedby";
                case CREATEDATE:
                    return "createdate";
                case CHANGEDATE:
                    return "changedate";
                case KEYWORD:
                    return "keyword";
                case WORKFLOW:
                    return "workflow";
                case SPECIALPAGES:
                    return "specialpages";
                case PAGESTATE:
                    return "pagestate";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        SearchItem item = (SearchItem) o;
        SearchItem.Key key;
        String keyValue = (String) value;
        if (keyValue.equals("headline"))
            key = SearchItem.Key.HEADLINE;
        else if (keyValue.equals("searchtext"))
            key = SearchItem.Key.SEARCHTEXT;
        else if (keyValue.equals("contentclassguid"))
            key = SearchItem.Key.CONTENTCLASSGUID;
        else if (keyValue.equals("pageid"))
            key = SearchItem.Key.PAGEID;
        else if (keyValue.equals("createdby"))
            key = SearchItem.Key.CREATEDBY;
        else if (keyValue.equals("changedby"))
            key = SearchItem.Key.CHANGEDBY;
        else if (keyValue.equals("createdate"))
            key = SearchItem.Key.CHANGEDATE;
        else if (keyValue.equals("changedate"))
            key = SearchItem.Key.CHANGEDATE;
        else if (keyValue.equals("keyword"))
            key = SearchItem.Key.KEYWORD;
        else if (keyValue.equals("workflow"))
            key = SearchItem.Key.WORKFLOW;
        else if (keyValue.equals("specialpages"))
            key = SearchItem.Key.SPECIALPAGES;
        else if (keyValue.equals("pagestate"))
            key = SearchItem.Key.PAGESTATE;
        else
            key = null;
        item.setKey(key);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((SearchItem) o).setKey(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}
