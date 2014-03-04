
package poo.semana5.comparator.datas;

import java.util.Date;

/**
 *
 * @author Mauro Pinto
 */
public class Data implements Comparable<Data> {

    private Date data;

    public Data(Date data)
    {
        this.data = data;
    }

    public Date getData()
    {
        return data;
    }

    @Override
    public int compareTo(Data outraData)
    {
        return data.compareTo(outraData.getData());
    }

}
