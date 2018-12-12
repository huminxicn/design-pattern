package adapter.practice;

import java.io.IOException;

/**
 * 需求。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/10 15:20
 */
public interface FileIO {
    public void readFromFile(String fileName) throws IOException;

    public void writeToFile(String fileName) throws IOException;

    public void setValue(String key, String value);

    public String getValue(String key);
}
