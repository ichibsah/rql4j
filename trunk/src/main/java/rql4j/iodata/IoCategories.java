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

package rql4j.iodata;

import rql4j.domain.Category;
import rql4j.domain.IoData;

import java.util.List;

public class IoCategories extends IoObject {

    public IoCategories(IoData ioData) {
        super(ioData);
    }

    public Category getCategoryByValue(String categoryValue) {
        if (this.ioData != null &&
                this.ioData.getCategories() != null &&
                this.ioData.getCategories().getCategoryList() != null) {
            List<Category> categoryList = this.ioData.getCategories().getCategoryList();
            for (Category category : categoryList) {
                if (category.getValue().equals(categoryValue))
                   return category;
            }
        }
        return null;
    }

    public List<Category> getCategoryList() {
        if (this.ioData != null &&
                this.ioData.getCategories() != null &&
                this.ioData.getCategories().getCategoryList() != null) {
            return this.ioData.getCategories().getCategoryList();
        }
        return null;
    }
}
