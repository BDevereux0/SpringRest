package com.example.springrest.clientInputREST;


//Because @RequestBody can be used once per controller method, use a class like this. Ex:

/*@PostMapping("/rbt")
public String toLowerCase(@RequestBody String word, @RequestBody Person person){
        logger.info("person: " + person.getName());

        return word = word.toLowerCase();
        }*/
public class RequestData {
    String someData;

    Person person;

    public RequestData(String someData, Person person) {
        this.someData = someData;
        this.person = person;
    }

    public String getSomeData() {
        return someData;
    }

    public void setSomeData(String someData) {
        this.someData = someData;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "RequestData{" +
                "name='" + someData + '\'' +
                ", person=" + person +
                '}';
    }
}
