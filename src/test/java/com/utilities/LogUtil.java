package com.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reusablecomponents.BrowserHelper;
import com.utilities.LogUtil;

public class LogUtil {
	public Logger loggs() {
		Logger log = LogManager.getLogger(BrowserHelper.class.getName());
		return log;
	}
}
