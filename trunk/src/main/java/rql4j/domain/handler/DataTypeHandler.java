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

import rql4j.domain.Data;
import org.exolab.castor.mapping.FieldHandler;
import org.exolab.castor.mapping.ValidityException;

public class DataTypeHandler implements FieldHandler {
    @Override
    public Object getValue(Object o) throws IllegalStateException {
        Data data = (Data) o;
        Data.DataType dataType = data.getType();
        if (data != null) {
            switch (dataType) {
                case PAGE:
                    return "page";
                case CONTENT_CLASS:
                    return "app.4015";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        Data data = (Data) o;
        Data.DataType dataType;
        String dataTypeValue = (String) value;

        if (dataTypeValue.equals("page"))
            dataType = Data.DataType.PAGE;
        else if (dataTypeValue.equals("app.4015"))
            dataType = Data.DataType.CONTENT_CLASS;
        else dataType = null;
        data.setType(dataType);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((Data) o).setType(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}
