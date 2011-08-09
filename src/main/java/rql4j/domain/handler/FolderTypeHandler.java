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
import rql4j.domain.FolderType;

public class FolderTypeHandler extends GeneralizedFieldHandler {

	@Override
	public Object convertUponGet(Object o) {
		String value = null;
		if (o == null)
			return value;
		if (o == FolderType.FILE)
			value = "0";
		else if (o == FolderType.CONTENT_CLASS)
			value = "1";
		else if (o == FolderType.EXTERNAL)
			value = "4";
		else if (o == FolderType.XCMS)
			value = "5";
		else if (o == FolderType.STYLESHEET)
			value = "6";
		else if (o == FolderType.HUMMINGBIRD)
			value = "7";
		else
			value = null;
		return value;
	}

	@Override
	public Object convertUponSet(Object o) {
		FolderType value = null;
		try {
			Integer integer = Integer.parseInt((String) o);
			if (integer != null) {
				if (integer == 0)
					value = FolderType.FILE;
				else if (integer == 1)
					value = FolderType.CONTENT_CLASS;
				else if (integer == 4)
					value = FolderType.EXTERNAL;
				else if (integer == 5)
					value = FolderType.XCMS;
				else if(integer == 6)
					value = FolderType.STYLESHEET;
				else if(integer == 	7)
					value = FolderType.HUMMINGBIRD;
			}
		} catch (NumberFormatException e) {
			return null;
		}
		return value;
	}

	@Override
	public Class getFieldType() {
		return FolderType.class;
	}
}
