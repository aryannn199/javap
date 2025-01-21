package com.example.spring_boot_2;
import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController
public class ProductController {
	
	private static Map<String,Product> products_list= new HashMap<String,Product>();
		
	static {
		Product honey = new Product();
		honey.setId("1");
		honey.setName("Honey");
		
		products_list.put(honey.getId(), honey);
		
	}
	@RequestMapping(value="/products")
		public ResponseEntity<Object>getProduct() {
			return new ResponseEntity<Object>(products_list.values(),
					HttpStatus.OK );
					
			
		}
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public ResponseEntity<Object> addProduct(@RequestBody Product p){
		products_list.put(p.getId(), p);
		
		return new ResponseEntity<Object>("Product is added Succefully",HttpStatus.OK);
		
				
	}
	@RequestMapping(value="/products/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Object>updateProduct(
			@PathVariable("id") String id,@RequestBody Product p){products_list.put(id, p);
	     return new ResponseEntity<Object>("Product Updated Succesfull" ,HttpStatus.OK);
	                    		 
	}
	@RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Object>deletProduct(
			@PathVariable String id){
		products_list.remove(id);
		return new ResponseEntity<Object>("Product Is Deleted Succesfully", HttpStatus.OK);
		
	}
}
