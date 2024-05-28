package generics;

import java.util.ArrayList;
import java.util.List;

public class Server2 implements ServerValidators<Double> {
    private List<Double> data = new ArrayList<>();

    @Override
    public boolean isEmptyData(){
        return data.isEmpty();
    }
    @Override
    public Double responseValidator() {
        return data.get(data.size()-1);
    }

    @Override
    public void requestValidator(Double elem) {
        data.add(elem);
    }

    @Override
    public void delValidator() {
        data.remove(data.size()-1);
    }
}
