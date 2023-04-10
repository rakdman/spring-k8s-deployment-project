package com.demo.springk8sproject.welcome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GuestController {
    private final GuestService guestService;

    public GuestController(GuestService guestService) {
        this.guestService=guestService;
    }

    @GetMapping("/getall")
    public ResponseEntity<List<GuestEntity>> getAllGuests() {
        List<GuestEntity> allGuests = guestService.getAllGuests();
        return ResponseEntity.ok(allGuests);
    }

    @PostMapping("/createguest")
    public ResponseEntity<GuestEntity> createGuest(@RequestBody GuestEntity guestEntity) {
        return ResponseEntity.ok(guestService.createGuest(guestEntity));
    }

    @PutMapping("/updateguest")
    public ResponseEntity<GuestEntity> updateGuest(@RequestBody GuestEntity guestEntity) {
        return ResponseEntity.ok(guestService.updateGuest(guestEntity));
    }

    @DeleteMapping ("/deleteguest")
    public ResponseEntity<GuestEntity> deleteGuest(@RequestParam String firstName) {
        return ResponseEntity.ok(guestService.deleteGuest(firstName));
    }


}
