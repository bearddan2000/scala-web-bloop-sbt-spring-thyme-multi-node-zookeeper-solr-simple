package example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import scala.jdk.CollectionConverters._
import scala.collection.Iterable

import example.model.Dog;
import example.repository.DogRepository;

@RestController
class DogRestController (
	@Autowired() dogRepository: DogRepository
) {

	def init(): Unit =
	{
	    val lst: List[Dog] = List(
				new Dog("1L", "Am Bulldog", "White"),
				new Dog("2L", "Foxhound", "Red"),
				new Dog("3L", "Gr Shepard", "Black")
			);

			lst.foreach {dog => dogRepository.save(dog)};

	}

	@GetMapping(Array("/dogs"))
	def getAllDogs(): String =
	{
			init();
			val itr: List[Dog] = dogRepository.findAll().asScala.toList;
			var i = 0;
			val sb = new StringBuilder("[")
				itr.foreach {
					dog =>
					sb ++= dog.toString()
					if(i < itr.size-1)
						sb += ','
					i+=1
				}
			sb += ']'
			return sb.toString()
	}
}
