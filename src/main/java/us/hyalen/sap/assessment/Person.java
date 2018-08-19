package us.hyalen.sap.assessment;

import lombok.Data;

import java.util.List;

@Data
public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private List<Dependent> dependentsList;
    private String[] phones;
    private Integer numberOfPages;
}