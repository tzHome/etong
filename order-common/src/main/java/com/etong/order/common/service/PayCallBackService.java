/*
 * Copyright 2015 Etong Tech. Ltd. All rights reserved.
 * distributed with this file and available online at
 * http://www.etong.com/
 */
package com.etong.order.common.service;

import java.util.Map;

import com.etong.commons.command.Result;

public interface PayCallBackService {
  Result paybackCall(String memberId,Map<String, String[]> rs);
}
