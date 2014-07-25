/*
 * Copyright 2014 Blazebit.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.blazebit.persistence.impl.predicate;

import com.blazebit.persistence.SubqueryBuilder;

/**
 *
 * @author ccbem
 */
public class ExistsPredicate implements SubqueryPredicate {
    private SubqueryBuilder<?> subqueryBuilder;
    
    @Override
    public void setSubqueryBuilder(SubqueryBuilder<?> builder) {
        this.subqueryBuilder = builder;
    }

    public SubqueryBuilder<?> getBuilder() {
        return subqueryBuilder;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
}