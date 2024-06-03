package com.tencent.wxcloudrun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * index控制器
 */

@RestController
public class IndexController {

  /**
   * 主页页面
   * @return API response html
   */
  @GetMapping(value = "/api/index")
  public String index() {
    return "index-titan-01";
  }

}
