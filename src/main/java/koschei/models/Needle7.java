package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Needle7 {

    private Deth8 deth;

    public Needle7(@Autowired Deth8 dth) {
        this.deth = dth;
    }

    @Override
    public String toString() {
        return ", смерть Кощея на игле :( " + deth.toString();
    }
}
