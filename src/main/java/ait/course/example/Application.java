package ait.course.example;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;


//@RequestMapping("/api/v1")

public class Application {
//
//	@RequestMapping("")
//	public String index() {
//		return "Hello World 2022.....";
//	}

public int countWords(String words){
  String[] seperateWords = StringUtils.split(words,' ');
  return (seperateWords == null)? 0:seperateWords.length;
}

public void greet(){
	List<String> greetings = new ArrayList<>();
	greetings.add("Hello");
     for (String greeting : greetings){
		System.out.println("Greeting: "+greeting);
	}
}

public Application(){
System.out.println("Inside Application");
}

public static void main(String[] args){
	System.out.println("Starting Application");
	Application app = new Application();
        app.greet();
        int count = app.countWords("I have four words");
        System.out.println("Word Count: "+count);
//        System.out.println("Testing maven goal..");


   
}

}