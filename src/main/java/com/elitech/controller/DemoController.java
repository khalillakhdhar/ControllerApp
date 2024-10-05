package com.elitech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
@GetMapping("web")
public String welcome()
{
return 	"welcome.html";
}
}
