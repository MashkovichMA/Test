package com.qaprosoft.loginTest.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostLoginMethod extends AbstractApiMethodV2{

	public PostLoginMethod() {
		super("api/post/rqlogin.json","api/post/rslogin.json", "api/login.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("apilogin_url"));		
	}
}
