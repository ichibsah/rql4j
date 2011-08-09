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
import rql4j.domain.Folder;

public class FolderSaveTypeHandler extends GeneralizedFieldHandler {

	@Override
	public Object convertUponGet(Object o) {
		String value = null;
		if (o == null)
			return value;
		if (o == Folder.SaveType.REDDOT_DATABASE)
			value = "0";
		else if (o == Folder.SaveType.EXTERNAL_FOLDER)
			value = "1";
		else if (o == Folder.SaveType.FILE_SYSTEM)
			value = "2";
		else if (o == Folder.SaveType.EXTERNAL_DATABASE)
			value = "3";
		else
			value = null;
		return value;
	}

	@Override
	public Object convertUponSet(Object o) {
		Folder.SaveType value = null;
		try {
			Integer integer = Integer.parseInt((String) o);
			if (integer != null) {
				if (integer == 0)
					value = Folder.SaveType.REDDOT_DATABASE;
				else if (integer == 1)
					value = Folder.SaveType.EXTERNAL_FOLDER;
				else if (integer == 2)
					value = Folder.SaveType.FILE_SYSTEM;
				else if (integer == 3)
					value = Folder.SaveType.EXTERNAL_DATABASE;
			}
		} catch (NumberFormatException e) {
			return null;
		}
		return value;
	}

	@Override
	public Class getFieldType() {
		return Folder.SaveType.class;
	}
}
