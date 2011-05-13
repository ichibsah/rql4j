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

import rql4j.domain.Template;
import org.exolab.castor.mapping.GeneralizedFieldHandler;

import java.util.EnumSet;

public class TemplateRightsHandler extends GeneralizedFieldHandler {

    private static final Integer BASE = 2147483628;
    private static final Integer EDIT = 1;
    private static final Integer USE = 2;
    private static final Integer RELESE = 16;


    public TemplateRightsHandler() {
        super();
    }


    @Override
    public Object convertUponGet(Object value) {
        if (value == null) return null;
        EnumSet<Template.TemplateRights> templateRights;
        try {
            templateRights = (EnumSet<Template.TemplateRights>) value;
            Integer templateRight = BASE;
            if (templateRights.contains(Template.TemplateRights.EDIT))
                templateRight += EDIT;
            if (templateRights.contains(Template.TemplateRights.USE))
                templateRight += USE;
            if (templateRights.contains(Template.TemplateRights.RELEASE))
                templateRight += RELESE;
            return templateRight.toString();
        } catch (Exception e) {
            return null;
        }

    }


    @Override
    public Object convertUponSet(Object value) {
        String templateRight = (String) value;
        if (value != null && !value.equals("")) {
            try {
                Integer templateRightInt = Integer.parseInt(templateRight);
                EnumSet<Template.TemplateRights> templateRights = EnumSet.allOf(Template.TemplateRights.class);
                if ((templateRightInt & EDIT) != EDIT)
                    templateRights.remove(Template.TemplateRights.EDIT);
                if ((templateRightInt & USE) != USE)
                    templateRights.remove(Template.TemplateRights.USE);
                if ((templateRightInt & RELESE) != RELESE)
                    templateRights.remove(Template.TemplateRights.RELEASE);
                return templateRights;
            } catch (NumberFormatException e) {
                return null;
            }
        } else
            return null;
    }

    @Override
    public Class getFieldType() {
        return EnumSet.class;
    }
}
