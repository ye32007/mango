/*
 * Copyright 2014 mango.jfaster.org
 *
 * The Mango Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.jfaster.mango.invoker.function;

import org.jfaster.mango.invoker.LiteFunction;
import org.jfaster.mango.util.Strings;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * String --> List<Long>
 *
 * @author ash
 */
public class StringToLongListFunction extends LiteFunction<String, List<Long>> {

    private final static String SEPARATOR = ",";

    @Nullable
    @Override
    public List<Long> apply(@Nullable String input) {
        if (Strings.isEmpty(input)) {
            return new ArrayList<Long>();
        }
        String[] ss = input.split(SEPARATOR);
        List<Long> r = new ArrayList<Long>();
        for (int i = 0; i < ss.length; i++) {
            r.add(Long.parseLong(ss[i]));
        }
        return r;
    }

}
