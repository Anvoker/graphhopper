/*
 *  Licensed to GraphHopper GmbH under one or more contributor
 *  license agreements. See the NOTICE file distributed with this work for
 *  additional information regarding copyright ownership.
 *
 *  GraphHopper GmbH licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except in
 *  compliance with the License. You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.graphhopper.util;

import com.graphhopper.GHResponse;
import com.graphhopper.PathWrapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class GHResponseTest {
    @Test
    public void testToString() throws Exception {
        Assertions.assertEquals("no paths", new GHResponse().toString());
    }

    @Test
    public void testHasNoErrorIfEmpty() throws Exception {
        assertFalse(new GHResponse().hasErrors());
        GHResponse rsp = new GHResponse();
        rsp.add(new PathWrapper());
        assertFalse(rsp.hasErrors());
    }
}
