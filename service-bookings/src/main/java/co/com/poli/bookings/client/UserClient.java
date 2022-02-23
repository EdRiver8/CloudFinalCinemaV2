package co.com.poli.bookings.client;

import co.com.poli.bookings.entities.Booking;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "service-user")
public interface UserClient {

    @RequestMapping(method = RequestMethod.GET, value = "/users/{id}")
    public ResponseEntity<Booking> findById(@PathVariable("id") long id);

}
