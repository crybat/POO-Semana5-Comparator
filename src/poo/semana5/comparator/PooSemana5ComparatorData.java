
package poo.semana5.comparator;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import poo.semana5.comparator.datas.Data;

/**
 *
 * @author Mauro Pinto
 */
public class PooSemana5ComparatorData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        List<Data> ld = new ArrayList<>();
        ld.add(new Data(date));
        calendar.add(Calendar.HOUR, -1);
        ld.add(new Data(calendar.getTime()));
        calendar.add(Calendar.HOUR, 2);
        ld.add(new Data(calendar.getTime()));
        Collections.sort(ld);

        for (Data data : ld) {
            System.out.println(data.getData().toString());
        }
    }

}
