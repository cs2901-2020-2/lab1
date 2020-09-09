import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FizzBuzz {

    static final Logger logger = Logger.getLogger(FizzBuzz.class.getName());

    public  static List<String> calculate(int n){
        List<String> list = new ArrayList<String>();
        //TODO add your code here
        return list;
    }

    public static void main(String[] args){
        logger.info("CS-UTEC Software Engineering I");
        List<String> results = FizzBuzz.calculate(5);
        for(String result: results ){
            logger.info(result);
        }
    }

}
