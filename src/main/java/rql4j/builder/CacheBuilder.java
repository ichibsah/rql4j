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

package rql4j.builder;

import rql4j.domain.Cache;
import rql4j.domain.IoData;
import rql4j.domain.PBCache;

public class CacheBuilder extends RqlBuilder {

	private CacheBuilder(Delete delete) {
		super(delete.ioData);
	}

	public static class Delete implements IBuilder {
		private final IoData ioData;
		private final PBCache pbCache;
		private final Cache cache;
		private final String action = "delete";

		public Delete() {
			this.ioData = new IoData();
			this.pbCache = new PBCache();
			this.cache = new Cache();
			this.cache.setAction(this.action);
		}

		@Override
		public CacheBuilder build() {
			this.ioData.setPbCache(this.pbCache);
			this.pbCache.setCache(this.cache);
			return new CacheBuilder(this);
		}
	}
}
