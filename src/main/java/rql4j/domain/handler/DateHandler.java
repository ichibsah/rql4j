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

import org.exolab.castor.mapping.GeneralizedFieldHandler;

import java.math.BigDecimal;
import java.util.Date;

public class DateHandler extends GeneralizedFieldHandler {

    private final static double cFirstMSDayInDouble = 25569d;
    private final static double cFirstMSDayInMilliSec = 2209161600000d;
    private final static double cMSecondsPerDay = 86400000d;

    public DateHandler() {
        super();
    }

    /**
     * Convert long to otms specific date string
     *
     * @param value long Value
     * @return the converted value.
     */
    @Override
    public Object convertUponGet(Object value) {
        if (value == null) return null;
        Date input = (Date) value;
        return Double.toString(getMsDouble(input.getTime())).replace('.', '.');
    }

    /**
     * Convert otms date in Java long value
     *
     * @param value otms date string
     * @return the converted value.
     */
    @Override
    public Object convertUponSet(Object value) {
        String input = (String) value;
        if (input != null && !input.equals(""))
            return new Date(getJavaLong(new Double(input.replace(',', '.'))));
        else
            return null;
    }

    @Override
    public Class getFieldType() {
        return Date.class;
    }

    private long getJavaLong(double msDate) {
        return Math.round((msDate - cFirstMSDayInDouble) * cMSecondsPerDay);
    }

    private double getMsDouble(long jvDate) {
        BigDecimal bd = new BigDecimal((jvDate + cFirstMSDayInMilliSec) / cMSecondsPerDay);
        return bd.setScale(10, BigDecimal.ROUND_CEILING).doubleValue();
    }
}
