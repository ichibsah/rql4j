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

package rql4j;

import rql4j.builder.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestRql4j extends TestCase {
    public TestRql4j(String name) {
        super(name);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(AdministrationBuilderTest.suite());
        suite.addTest(ProjectsBuilderTest.suite());
        suite.addTest(ProjectBuilderTest.suite());
        suite.addTest(ElementsBuilderTest.suite());
        suite.addTest(FilesBuilderTest.suite());
        suite.addTest(EltBuilderTest.suite());
        suite.addTest(FileBuilderTest.suite());
        suite.addTest(TemplateBuilderTest.suite());
        suite.addTest(PageBuilderTest.suite());
        return suite;
    }

}
