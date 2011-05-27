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
import rql4j.domain.Project;

public class ProjectUserLevelHandler implements FieldHandler {

    @Override
    public Object getValue(Object o) throws IllegalStateException {
        Project project = (Project) o;
        Project.UserLevel userLevel = project.getUserLevel();
        if (userLevel != null) {
            switch (userLevel) {
                case ADMINISTRATOR:
                    return "1";
                case SITE_BUILDER:
                    return "2";
                case EDITOR:
                    return "3";
                case AUTHOR:
                    return "4";
                case VISITOR:
                    return "5";
                default:
                    return null;
            }
        }
        return null;
    }

    @Override
    public void setValue(Object o, Object value) throws IllegalStateException, IllegalArgumentException {
        Project project = (Project) o;
        Project.UserLevel userLevel;
        String userLevelValue = (String) value;

        if (userLevelValue.equals("1"))
            userLevel = Project.UserLevel.ADMINISTRATOR;
        else if (userLevelValue.equals("2"))
            userLevel = Project.UserLevel.SITE_BUILDER;
        else if (userLevelValue.equals("3"))
            userLevel = Project.UserLevel.EDITOR;
        else if (userLevelValue.equals("4"))
            userLevel = Project.UserLevel.AUTHOR;
        else if (userLevelValue.equals("5"))
            userLevel = Project.UserLevel.VISITOR;
        else userLevel = null;

        project.setUserLevel(userLevel);
    }

    @Override
    public Object newInstance(Object o) throws IllegalStateException {
        return null;
    }

    @Override
    public void resetValue(Object o) throws IllegalStateException, IllegalArgumentException {
        ((Project) o).setUserLevel(null);
    }

    @Override
    @Deprecated
    public void checkValidity(Object o) throws ValidityException, IllegalStateException {
    }
}

