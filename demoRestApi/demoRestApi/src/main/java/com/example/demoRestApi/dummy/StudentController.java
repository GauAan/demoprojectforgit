package com.example.demoRestApi.dummy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/hello")
public class StudentController {

	List<Student> ls;

	@Autowired
	private seriesInterf interf;

	@PostConstruct
	public void postconstruct() {
		ls = new ArrayList<>();
		ls.add(new Student("Gaurav", "Kumar", 1, "single", new Address("Delhi", "Gali no 4", "India", "110042")));
		ls.add(new Student("Akash", "Rajput", 2, "single", new Address("Allahabad", "Gali no 6", "India", "120042")));
		ls.add(new Student("Rishabh", "saini", 112, "single", new Address("Gujrat", "Gali no 8", "India", "140042")));
		ls.add(new Student("Abhinav", "kashyap", 1212, "single",
				new Address("Nanitail", "Gali no 12", "India", "150042")));
		ls.add(new Student("chita", "Rjaput", 112, "single", new Address("", "Gali no 14", "India", "190042")));

	}

	@GetMapping("/hi")
	public List<Student> m1() {
		return ls;
	}

	@GetMapping("/hey/{Studentid}")
	public Student M2(@PathVariable int Studentid) {
		if ((Studentid > ls.size()) || (Studentid < 0)) {

			throw new StudentNotFoundException("This is not Student ID" + Studentid);
		}

		return ls.get(Studentid);
	}

	@GetMapping("/hey")
	public String m3() {
		return "Hello Gaurav kumar";
	}

	@GetMapping("del/{id}")
	public List<Student> delete(@PathVariable int id) {

		ls.remove(id);
		return ls;

	}

	@PostMapping("/add")
	public List<Student> add() {

		ls.add(new Student("sadgjhs", "sadas", 787822, "singsadasle",
				new Address("barodassada", "galdasdasi no 105", "insadasdia", "25432421309")));
		ls.add(new Student("sadgjhs", "sadas", 787822, "singsadasle",
				new Address("barodassada", "galdasdasi no 105", "insadasdia", "25432421309")));
		ls.add(new Student("sadgjhs", "sadas", 787822, "singsadasle",
				new Address("barodassada", "galdasdasi no 105", "insadasdia", "25432421309")));
		ls.add(new Student("sadgjhs", "sadas", 787822, "singsadasle",
				new Address("barodassada", "galdasdasi no 105", "insadasdia", "25432421309")));
		ls.add(new Student("sadgjhs", "sadas", 787822, "singsadasle",
				new Address("barodassada", "galdasdasi no 105", "insadasdia", "25432421309")));
		ls.add(new Student("sadgjhs", "sadas", 787822, "singsadasle",
				new Address("barodassada", "galdasdasi no 105", "insadasdia", "25432421309")));
		ls.add(new Student("anchal", "singh", 9797, "single",
				new Address("chanchal parl", "gali no 04", "chutiya", "2543249792379823721309")));
		return ls;

	}

	//// fetching data using database/////

	@GetMapping("/data")
	public List<series> findall() {

		return interf.findAll();
	}

	@GetMapping("/single")
	public Optional<series> single() {

		return interf.findById(1);
	}

	
	

}

