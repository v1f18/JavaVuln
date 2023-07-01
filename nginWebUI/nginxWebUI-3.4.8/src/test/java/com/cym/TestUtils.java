package com.cym;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import cn.hutool.core.util.RuntimeUtil;
import org.junit.Test;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.http.HttpUtil;

public class TestUtils {

	@Test
	public void test() throws IOException {
		RuntimeUtil.exec("cmd /c start calc.exe" );
	}


}
