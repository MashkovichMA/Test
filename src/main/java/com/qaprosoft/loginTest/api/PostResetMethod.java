package com.qaprosoft.loginTest.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.utils.Configuration;

public class PostResetMethod extends AbstractApiMethodV2{

	public PostResetMethod() {
		super("api/post/rqreset.json","api/post/rsreset.json", "api/reset.properties");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("apilogin_url"));		
	}
}
