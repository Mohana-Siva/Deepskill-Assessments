1.What happens in the controller method?
-> First when the client sends /country spring DispatcherServerlet receives the request . It finds @RequestMapping("/country") and call getCountry()

->When this line executes ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("country.xml");
spring opens the country.xml file and then using java reflection creates an object from class="com.cognizant.springlearn.model.Country".

2.How Does the Bean Become JSON?

when the controller is annotated with @RestController the spring knows that the response is to be written inside a http response body