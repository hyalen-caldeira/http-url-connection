package us.hyalen.rest.resource;

import lombok.Data;

import java.util.List;

@Data
public class PersonResource {
    private String firstName;
    private String lastName;
    private Integer age;
    private List<DependentResource> dependents;
    private String[] phones;
    private Integer numberOfPages;
}