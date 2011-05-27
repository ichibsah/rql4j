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
import rql4j.domain.Link;
import rql4j.domain.User;

public class UserPreferredEditorHandler implements FieldHandler {

    @Override
    public Object getValue(Object o) throws IllegalStateException {
        User user = (User) o;
        User.PreferredEditor preferredEditor = user.getPreferredEditor();
        if (preferredEditor != null) {
            switch (preferredEditor) {
                case PROJECT_DEFAULT:
                    return "0";
                case REDDOT_EDITOR:
                    return "1";
                case MICROSOFT_WORD:
                    return "2";
                case EXTERNAL_EDITOR:
                    return "3";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        User user = (User) o;
        User.PreferredEditor preferredEditor;
        String preferredEditorValue = (String) value;

        if (preferredEditorValue.equals("0"))
            preferredEditor = User.PreferredEditor.PROJECT_DEFAULT;
        else if (preferredEditorValue.equals("1"))
            preferredEditor = User.PreferredEditor.REDDOT_EDITOR;
        else if (preferredEditorValue.equals("2"))
            preferredEditor = User.PreferredEditor.MICROSOFT_WORD;
        else if (preferredEditorValue.equals("3"))
            preferredEditor = User.PreferredEditor.EXTERNAL_EDITOR;
        else preferredEditor = null;

        user.setPreferredEditor(preferredEditor);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((User) o).setPreferredEditor(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}

