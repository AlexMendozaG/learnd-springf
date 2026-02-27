package classes_component;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {

    private String kindofparrot;

    public Parrot(){}
    public void setKindofparrot(String kindofparrot){this.kindofparrot = kindofparrot;}
    public String getKindofparrot() {return kindofparrot;}

    @PostConstruct
    public void init(){
        this.kindofparrot = "ave";
    }
}
