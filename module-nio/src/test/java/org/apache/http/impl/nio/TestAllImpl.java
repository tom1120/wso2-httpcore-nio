/*
 * $HeadURL$
 * $Revision$
 * $Date$
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.http.impl.nio;

import org.apache.http.impl.nio.codecs.TestAllImplCodecs;
import org.apache.http.impl.nio.reactor.TestAllImplReactor;

import junit.framework.*;

public class TestAllImpl extends TestCase {

    public TestAllImpl(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(TestAllImplReactor.suite());
        suite.addTest(TestAllImplCodecs.suite());
        suite.addTest(TestBuffers.suite());
        return suite;
    }

    public static void main(String args[]) {
        String[] testCaseName = { TestAllImpl.class.getName() };
        junit.textui.TestRunner.main(testCaseName);
    }

}