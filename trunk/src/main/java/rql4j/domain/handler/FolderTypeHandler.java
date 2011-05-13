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

import rql4j.domain.Folders;
import org.exolab.castor.mapping.FieldHandler;
import org.exolab.castor.mapping.ValidityException;

public class FolderTypeHandler implements FieldHandler {
    @Override
    public Object getValue(Object o) throws IllegalStateException {
        Folders folders = (Folders) o;
        Folders.FolderType folderType = folders.getFolderType();
        if (folderType != null) {
            switch (folderType) {
                case FILE:
                    return "0";
                case CONTENT_CLASS:
                    return "1";
                case EXTERNAL:
                    return "4";
                case XCMS:
                    return "5";
                case STYLESHEET:
                    return "6";
                case HUMMINGBIRD:
                    return "7";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        Folders folders = (Folders) o;
        Folders.FolderType folderType;
        String folderTypeValue = (String)value;

        if(folderTypeValue.equals("0"))
            folderType = Folders.FolderType.FILE;
        else if(folderTypeValue.equals("1"))
            folderType = Folders.FolderType.CONTENT_CLASS;
        else if(folderTypeValue.equals("4"))
            folderType = Folders.FolderType.EXTERNAL;
        else if(folderTypeValue.equals("5"))
            folderType = Folders.FolderType.XCMS;
        else if(folderTypeValue.equals("6"))
            folderType = Folders.FolderType.STYLESHEET;
        else if(folderTypeValue.equals("7"))
            folderType = Folders.FolderType.HUMMINGBIRD;
        else folderType = null;

        folders.setFolderType(folderType);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((Folders) o).setFolderType(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}
