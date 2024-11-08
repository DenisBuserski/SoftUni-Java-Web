package com.demo.web

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class BankController {

    @PostMapping("/transfer") // http://localhost:8080/transfer?from=User1&to=User2
    fun transferMoney(@RequestParam("from") from: String,
                      @RequestParam("to") to: String,
                      model: Model) : String {
        model.addAttribute("from", from)
        model.addAttribute("to", to)
        return "transfer"
    }
}