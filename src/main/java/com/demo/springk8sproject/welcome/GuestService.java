package com.demo.springk8sproject.welcome;

import org.springframework.aop.target.LazyInitTargetSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class GuestService {

    private GuestRepo guestRepo;

    public GuestService(GuestRepo guestRepo) {
        this.guestRepo=guestRepo;
    }

    public GuestEntity createGuest(GuestEntity guestData) {
        guestRepo.save(guestData);
        return guestData;
    }

    public GuestEntity updateGuest(GuestEntity guestData) {
        guestRepo.save(guestData);
        return guestData;
        }

    public List<GuestEntity> getAllGuests() {
        List<GuestEntity> guestEntityList = guestRepo.findAll();
        return guestEntityList;
    }

    public GuestEntity deleteGuest(String firstName) {
        GuestEntity guest= guestRepo.findByFirstName(firstName);
        guestRepo.delete(guest);
        return guest;
    }

}
