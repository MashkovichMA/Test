/*
 * Copyright 2013-2018 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qaprosoft.loginTest;

import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.loginTest.api.PostLoginMethod;
import com.qaprosoft.loginTest.api.PostResetMethod;

public class APISampleTest extends AbstractTest {
    @Test(description = "Zafira_Login")
    @MethodOwner(owner = "qps")
    public void testLogin() throws Exception {
        PostLoginMethod login = new PostLoginMethod();
        login.expectResponseStatus(HttpResponseStatusType.UNAUTHORIZED_401);
        login.callAPI();
    }
    @Test(description = "Zafira_Reset")
    @MethodOwner(owner = "qps")
    public void testReset() throws Exception {
        PostResetMethod reset = new PostResetMethod();
        reset.expectResponseStatus(HttpResponseStatusType.OK_200);
        reset.callAPI();
    }
}
