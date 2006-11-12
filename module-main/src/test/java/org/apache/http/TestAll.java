/*
 * $HeadURL$
 * $Revision$
 * $Date$
 * ====================================================================
 *
 *  Copyright 1999-2006 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.http;

import org.apache.http.entity.TestAllEntity;
import org.apache.http.impl.TestAllImpl;
import org.apache.http.impl.entity.TestAllEntityImpl;
import org.apache.http.io.TestAllIO;
import org.apache.http.message.TestAllMessage;
import org.apache.http.protocol.TestAllProtocol;
import org.apache.http.util.TestAllUtil;

import junit.framework.*;

public class TestAll extends TestCase {

    public TestAll(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite();
        
        suite.addTest(TestAllUtil.suite());
        
        suite.addTest(TestHttpExceptions.suite());
        suite.addTest(TestHttpStatus.suite());
        suite.addTest(TestHttpVersion.suite());
        suite.addTest(TestHttpHost.suite());

        suite.addTest(TestAllMessage.suite());
        suite.addTest(TestAllIO.suite());
        suite.addTest(TestAllEntity.suite());
        suite.addTest(TestAllImpl.suite());
        suite.addTest(TestAllEntityImpl.suite());
        
        suite.addTest(TestAllProtocol.suite());
        
        return suite;
    }

    public static void main(String args[]) {
        String[] testCaseName = { TestAll.class.getName() };
        junit.textui.TestRunner.main(testCaseName);
    }

}