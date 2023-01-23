package RestController;

import java.awt.Image;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import Repository.ApiRepository;

@RestController
public class RestControllerClass {
	
	@Autowired
	private ApiRepository apiRepo;
	
	
	@PostMapping("/image")
	public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file) {
		return new ResponseEntity<>("Image uploaded successfully", HttpStatus.OK);
	}
	
//	@GetMapping("/image/{id}")
//	public ResponseEntity<byte[]>getImage(@PathVariable("id") String id){
//		return new ResponseEntity<>(Image, HttpStatus.OK);
//	}
	
	@PostMapping("/inventory")
	public ResponseEntity<String> createInventoryItem(@RequestBody Item item){
		return new ResponseEntity<>("Item updated successfully", HttpStatus.CREATED);
	}
	
	@PutMapping("/inventory/{id}")
	public ResponseEntity<String> updateInventoryItem(@PathVariable("id") String id,@RequestBody Item item){
		return new ResponseEntity<>("Item updated successfully", HttpStatus.OK);
	}
	
	@GetMapping("/inventory")
	public ResponseEntity<String> removeInventoryItem(@PathVariable("id")String id){
		return new ResponseEntity<>("Item removed successfully", HttpStatus.OK);
	}
	
	@DeleteMapping("/inventory/{id}")
	public ResponseEntity<String> removeInventoryItems(@PathVariable("id") String id){
		return new ResponseEntity<>("Item removed successfully", HttpStatus.OK);
	}
	
//	@GetMapping("/inventory/stock")
//	public ResponseEntity<Integer> getInventoryStock() {
//		return new ResponseEntity<>(stock, HttpStatus.OK);
//	}
}
