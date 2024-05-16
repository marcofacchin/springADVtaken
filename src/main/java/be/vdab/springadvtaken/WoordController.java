package be.vdab.springadvtaken;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("woorden")
public class WoordController {
    private final WoordService woordService;

    WoordController(WoordService woordService) {
        this.woordService = woordService;
    }

    @GetMapping("{woord}/isPalindroom")
    public boolean isPalindroom(@PathVariable String woord) {
        return woordService.isPalindroom(woord);
    }
}
