package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    Duck5 d;

    @Override
    public String toString() {
        return ", в зайце утка " + d.toString();
    }

    @Autowired
    public void setD(Duck5 d) {
        this.d = d;
    }
}
