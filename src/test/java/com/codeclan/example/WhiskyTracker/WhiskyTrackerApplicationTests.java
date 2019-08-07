package com.codeclan.example.WhiskyTracker;

import com.codeclan.example.WhiskyTracker.models.Whisky;
import com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository.DistilleryRepository;
import com.codeclan.example.WhiskyTracker.repositories.WhiskyRepository.WhiskyRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyTrackerApplicationTests {

	@Autowired
	DistilleryRepository distilleryRepository;

	@Autowired
	WhiskyRepository whiskyRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findWhiskysForAParticularYear(){
		List<Whisky> found = whiskyRepository.findWhiskyByYear(1991);
		assertEquals("The Rosebank 12 - Flora and Fona", found.get(0).getName());
	}

//	@Test
//	public void findShipsThatHavePiratesNamed(){
//		List<Ship> found  = shipRepository.findShipsThatHavePiratesNamed("John");
//		assertEquals("The Flying Dutchman", found.get(0).getName());
//	}

}
