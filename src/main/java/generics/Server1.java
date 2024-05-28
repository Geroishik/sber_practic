package generics;

import java.util.ArrayList;
import java.util.List;

public class Server1 implements ServerValidators<Integer> {
    private List<Integer> data = new ArrayList<>();

    @Override
    public boolean isEmptyData(){
        return data.isEmpty();
    }

    @Override
    public Integer responseValidator() {
        return data.get(data.size()-1);
    }

    @Override
    public void requestValidator(Integer elem) {
        data.add(elem);
    }

    @Override
    public void delValidator() {
        data.remove(data.size()-1);
    }
}
